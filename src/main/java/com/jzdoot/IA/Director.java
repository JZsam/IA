package com.jzdoot.IA;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
// import java.util.LinkedList;
import java.util.Scanner;

public class Director implements Top{
	//NOTE The spot prefix will be "D" example the head director will be "d1"
	private int level = 3;
	private String name,spot;
	public Director(){
		name="Todd Fessler";
		spot="d1";
	}
	public Director(String n, String s){
		name=n;
		spot=s;
	}
	public void updateBand(File f) throws FileNotFoundException{//FIXME
		// Setting up the Band to work with this
		// Band.resetMainBandInstance();
		Bandie current = new Bandie();
		Director direct  = new Director();
		LinkedList<Row> newBlc = new LinkedList<Row>();
		File saved = f;
		f.renameTo(new File("config/block.csv"));//test me
		boolean dir = false;
		Scanner s = new Scanner(f);
		String name = "";
		s.useDelimiter(",");
		int count=0,realCount=0;
		s.nextLine();
		while(s.hasNext()){
			String item = s.next();
			switch(count%6){
				case 0:
					switch(item){
						case "director":
							dir=true;
							break;
						case "officer":
							current = new Officer();
							break;
						case "leader":
							current = new SquadLeader();
							break;
						case "bandie":
							current= new Bandie();
							break;
					}
					break;
				case 1:
					if (!dir) {
					current.setSpot(item);
					current.setRow(item.charAt(0));
					}else
						direct.setSpot(item);
					break;
				case 2:
					name=item;
					break;
				case 3:
					name+= " " +item;
					if (!dir) {
						current.setName(name);
					}else{
						direct.setName(name);
						count+=2;
					}
					break;
				case 4:
					if (!dir)
						current.setSection(item);
					break;
				case 5:
					if(!dir){
						current.setGrade(Integer.parseInt(item));
					}
					break;
			}
			count++;
		}
		s.close();
	}
	public void setSpot(String s){
		spot=s;
	}
	public void setName(String n){
		name = n;
	}
	public int getLevel(){
		return level;
	}
	public String getSpot(){
		return spot;
	}
	public void takeRowAttendance(char row, char[] a){
		Band.getRow(row).updateRecord(this);
		for (int i = 0; i < Band.getRow(row).size(); i++) {
			takeAttendance((""+row)+(i+1), a[i]);
		}
	}
	public void takeAttendance(String spott, char a){
		Band.getBandie(spott).setAttendance(a);
	}
}
