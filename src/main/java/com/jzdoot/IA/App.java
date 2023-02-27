package com.jzdoot.IA;
// import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class App{
	public static void main(String[] args) throws FileNotFoundException{
		Band b = Band.getInstance();
		System.out.println(b);
		// Scanner k = new Scanner(System.in);
		//TODO Login
		//System.out.print("Login (Spot):: ");
		//String spot = k.next();
		//Bandie bUser;
		//SquadLeader slUser;
		//Officer oUser;
		//Director d;
		//if(Band.getBandie(spot).getLevel()==0){
		//	//TODO Bandie outcome
		//	bUser = Band.getBandie(spot);
		//	System.out.println(bUser);
		//}else if(Band.getBandie(spot).getLevel()==1){
		//	//TODO SL outcome
		//	slUser = (SquadLeader)Band.getBandie(spot);
		//	//TODO SL Attendance
		//	LinkedList<Character> att = new LinkedList<Character>();
		//	for(int i=0;i<Band.getRow(slUser.getRow()).size();i++){
		//		System.out.print("Attendance for " + (""+slUser.getRow()).toUpperCase() + (i+1) + " [a/l/p]:: ");
		//		att.add(k.next().charAt(0));
		//	}
		//	char[] arr = new char[att.size()];
		//	for(int i=0;i<att.size();i++)
		//		arr[i]=att.get(i);
		//	slUser.takeRowAttendance(arr);
		//}
		//TODO Officer outcome
		//TODO Director outcome
		//TODO other Attendance
		//TODO update Band
		// k.close();
		// Band.createMainBandIstance(new LinkedList<Row>());
		// Director d = new Director();
		// d.updateBand(new File("testStuff/UAMB Attendance 2022-23 - Week 2 - 8_22-8_26.csv"), true);
	}
}
