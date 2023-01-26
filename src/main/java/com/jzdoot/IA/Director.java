package com.jzdoot.IA;
import java.io.File;
import java.io.FileNotFoundException;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.NoSuchElementException;
// import java.util.Scanner;

public class Director implements Top{
	//NOTE The spot prefix will be "D" example the head director will be "d1"
	private String name,spot;
	public Director(){
		name="Todd Fessler";
		spot="d1";
	}
	public Director(String n, String s){
		name=n;
		spot=s;
	}
	public void updateBand(File f, boolean topLine) throws FileNotFoundException{//FIXME
		// // TODO also make work with directors
		// Scanner s = new Scanner(f);
		// s.useDelimiter(",");
		// int count=0;
		// if(topLine)
		// 	s.nextLine();
		// Map<String,Bandie> bl=new HashMap<String,Bandie>();
		// String spot = "", section="", name="", row="";
		// int grade=9;
		// while(s.hasNext()){
		// 	String item = s.next();
		// 	// System.out.println(item +"\n"+ count%6);
		// 	switch(count%6){
		// 		case 0:
		// 			spot=item;
		// 			if (item.charAt(0)=='K') {
		// 				row=""+item.charAt(0)+item.charAt(1);
		// 			}else
		// 				row=""+item.charAt(0);
		// 			break;
		// 		case 1:
		// 			name=item+" ";
		// 			break;
		// 		case 2:
		// 			name+=item;
		// 			break;
		// 		case 3:
		// 			section = item;
		// 			break;
		// 		case 4:
		// 			grade = Integer.parseInt(item);
		// 			break;
		// 		case 5:
		// 			Top t = new Top(spot, row, name, section, grade, item);
		// 			bl.put(spot, t.get());
		// 	}
		// 	count++;
		// }
		// s.close();
		// System.out.println(bl.toString());
	}
	public void takeRowAttendance(char row, char[] a){
		Band.getRowFromMainBandInstance(row).updateRecord(this);
		for (int i = 0; i < Band.getRowFromMainBandInstance(row).size(); i++) {
			takeAttendance((""+row)+(i+1), a[i]);
		}
	}
	public void takeAttendance(String spott, char a){
		Band.getBandieFromMainBandInstance(spott).setAttendance(a);
	}
}
