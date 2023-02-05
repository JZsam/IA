package com.jzdoot.IA;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Band{
	private static LinkedList<Row> block;
	private static Band instance = null;
	public Band(){
		block = new LinkedList<Row>();
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
				//TODO add exception for krow
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
		}
	}

	public static Band getInstance(){
		return instance;
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
	public static Bandie getBandie(String spot){
		//TODO DO THIS
		return new Bandie();//FIXME Placeholder
	}
	public static void updateBand(File f) throws FileNotFoundException{
	}
	//TODO add a whole set for krow rows
	public static KRow getKRow(){
		return (KRow)getRow('k');
	}
	public static LinkedList<Bandie> getKRowRow(int index){//This index starts at 1 keep this in mind when calling. This makes it easier for user input
		return getKRow().getRow(index-1);
	}
	//public void stats(){
	//	//TODO
	//}
	//public void reset(){
	//	block.clear();
	//}
	//public void fill(LinkedList<Row> bck){
	//	for(Row r: bck){
	//		block.add(r);
	//	}
	//}
	//public void addRow(Row r){
	//	block.add(r);
	//}
	//public Row getRow(char row){
	//	return block.get(row);
	//}
	//public Bandie getBandie(String spot){
	//	return getRow(spot.charAt(0)).getBandie(spot);
	//}
	//public void updateBand(File f) throws FileNotFoundException{
	//	// Setting up the Band to work with this
	//	Band.resetMainBandInstance();
	//	Bandie current = new Bandie();
	//	Director direct  = new Director();
	//	LinkedList<Bandie> newRow = new LinkedList<Bandie>();
	//	boolean dir = false, topLine = false;
	//	Scanner s = new Scanner(f);
	//	String name = "";
	//	s.useDelimiter(",");
	//	int count=0;
	//	if(topLine)
	//		s.nextLine();
	//	while(s.hasNext()){
	//		String item = s.next();
	//		switch(count%6){
	//			case 0:
	//				switch(item){
	//					case "director":
	//						dir=true;
	//						break;
	//					case "officer":
	//						current = new Officer();
	//						break;
	//					case "leader":
	//						current = new SquadLeader();
	//						break;
	//					case "bandie":
	//						current= new Bandie();
	//						break;
	//				}
	//				break;
	//			case 1:
	//				if (!dir) {
	//				current.setSpot(item);
	//				current.setRow(item.charAt(0));
	//				}else
	//					direct.setSpot(item);
	//				break;
	//			case 2:
	//				name=item;
	//				break;
	//			case 3:
	//				name+= " " +item;
	//				if (!dir) {
	//					current.setName(name);
	//				}else{
	//					direct.setName(name);
	//					count+=2;
	//				}
	//				break;
	//			case 4:
	//				if (!dir)
	//					current.setSection(item);
	//				break;
	//			case 5:
	//				if(!dir)
	//					current.setGrade(Integer.parseInt(item));
	//				break;
	//		}
	//		count++;
	//	}
	//	s.close();
	//}
	////NOTE These are all being used for the Main Band Instance
	//public static void createMainBandIstance(LinkedList<Row> bck){
	//	mainBandInstance = new Band(bck);
	//	//TODO make it something to build off of
	//}
	//public static void resetMainBandInstance(){
	//	mainBandInstance.reset();
	//}
	//public static void fillMainBandInstance(LinkedList<Row> bck){
	//	mainBandInstance.fill(bck);
	//}
	//public static Row getRowFromMainBandInstance(char row){
	//	return mainBandInstance.getRow(row);
	//}
	//public static Bandie getBandieFromMainBandInstance(String spot){
	//	return mainBandInstance.getBandie(spot);
	//}
}
