package com.jzdoot.IA;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Band{
	private static LinkedList<Row> block;
	private static LinkedList<Director> dirRow;
	private static Band instance = null;
	public Band(){
		block = new LinkedList<Row>();
		dirRow = new LinkedList<Director>();
	}
	public static void init() throws FileNotFoundException{
		if(instance != null)
			System.out.println("Error: instance already exists");
		else{
			instance = new Band();
			int kCount = 0;
			Scanner s = new Scanner(new File("config/rows.txt"));
			while(s.hasNext()){
				String item = s.nextLine();
				char r = item.charAt(0);
				//DONE add exception for krow
				if(r != 'k')
					addRow(new Row(r));
				else{
					kCount++;
				}
			}
			LinkedList<LinkedList<Bandie>> kr = new LinkedList<LinkedList<Bandie>>();
			for(int i=0;i<=kCount;i++)
				kr.add(new LinkedList<Bandie>());
			addRow(new KRow(kr));
			set();
		}
	}

	private static void set() throws FileNotFoundException{
		////Set up for scanner to set the file
		Scanner s = new Scanner(new File("config/block.csv"));
		s.useDelimiter(",");
		s.nextLine();
		LinkedList<LinkedList<String>> tempBlock = new LinkedList<LinkedList<String>>();
		tempBlock.add(new LinkedList<String>());
		int count = 0;
		while (s.hasNext()) {
			String next = s.next();
			if(!next.contains("\n"))
				tempBlock.get(count).add(next);
			else{
				char[] charNext = next.toCharArray();
				boolean done = false;
				int cnt = 0;
				for(int i=0; i<charNext.length;i++){
					if(!done && charNext[i] != '\n')
						cnt++;
					else
						done = true;
				}
				tempBlock.get(count).add(next.substring(0,cnt));
				count++;
				tempBlock.add(new LinkedList<String>());
				tempBlock.get(count).add(next.substring(cnt+1));
			}
		}
		for(LinkedList<String> arr : tempBlock){
			BandieBuilder bb = new BandieBuilder();
			boolean dir = false;
			//Level
			if(!arr.isEmpty() && arr.size()>1){
				String str = arr.get(0);
				switch(str){
					case "director":
						bb.setLevel(3);
						dir = true;
						break;
					case "officer":
						bb.setLevel(2);
						dir = false;
						break;
					case "leader":
						bb.setLevel(1);
						dir = false;
						break;
					case "bandie":
						bb.setLevel(0);
						dir = false;
						break;
				}
				//spot
				bb.setSpot(arr.get(1));
				//Name
				bb.setName(arr.get(2)+ " " +arr.get(3));
				if(!dir) {
					//Row
					bb.setRow(arr.get(1).charAt(0));
					//Section
					bb.setSection(arr.get(4));
					//Grade
					if(arr.get(1).charAt(0) != 'k')
						addBandie(arr.get(1).charAt(0), bb.get());
					else
						getKRowRow(Integer.parseInt(arr.get(1).charAt(1)+"")).add(bb.get());

				}else
					addDir(bb.getDir());
			}
		}
	}
	public static Band getInstance() throws FileNotFoundException{
		if(instance!=null)
			return instance;
		else{
			init();
			return instance;
		}
	}
	public static void addRow(Row r){
		if(block.size() > 0)
			for(int i=0; i<block.size();i+=0){
				if(block.get(i).compareTo(r)<0)
					i++;
				else if(block.get(i).compareTo(r)==0){
					System.out.println("already exists");
					break;
				}else if(block.get(i).compareTo(r)>0){
					block.add(i, r);
					break;
				}else
					block.add(r);
			}
		else
			block.add(r);
	}
	public static Row getRow(char row){
		for(Row arr : block){
			if(arr.getLetter()==row)
				return arr;
		}
		return null;
	}
	public static void updateBand(File f) throws FileNotFoundException{
	}
	public static KRow getKRow(){
		return (KRow)getRow('k');
	}
	public static LinkedList<Bandie> getKRowRow(int index){//This index starts at 1 keep this in mind when calling. This makes it easier for user input
		return getKRow().getRow(index-1);
	}
	private static void addDir(Director dir){
		int current = Integer.parseInt(""+ dir.getSpot().charAt(dir.getSpot().length()-1));
		boolean worked = false;
		if(dirRow.size()!=0){
			for(int i=0;i<dirRow.size();i++){
				if(current > Integer.parseInt("" + dirRow.get(i-1).getSpot().charAt(dirRow.get(i-1).getSpot().length()-1)) && current < Integer.parseInt("" + dirRow.get(i).getSpot().charAt(dirRow.get(i).getSpot().length()-1))){
					dirRow.add(i, dir);
					worked = true;
				}
			}
		}
		if(!worked)
			dirRow.add(dir);
	}
	public String toString(){
		String outString = "";
		for(Row arr : block){
			outString += arr.getLetter() + "{ ";
			if(arr.getType() == 1)
				for(Bandie person : arr.getList()){
					outString += person.getSpot() + " ";
				}
			else{
				KRow kr = (KRow)arr;
				boolean first = true;
				for(int i=0; i<kr.size();i++){
					outString += (first) ? "\n\t{ " : "\t{ ";
					first = false;
					// (first) ? outString += "\n\t{" : out
					for(Bandie person : kr.getRow(i))
						outString += person.getSpot() + " ";
					outString += "}\n";
				}
			}
			outString += "}\n";
		}
		return outString;
	}
	private static void addBandie(char row, Bandie bandie){
		for(int i = 0; i < block.size(); i++){
			if(block.get(i).getLetter() == row)
				block.get(i).addBandie(bandie);
		}
	}
	public static LinkedList<Row> getBlock(){
		return block;
	}
	public static LinkedList<Director> getDir(){
		return dirRow;
	}
}
