package com.jzdoot.IA;

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
		Band.getRow(spott.charAt(0)).getBandie(spott).setAttendance(a);
	}
	public String toString(){
		return "Name :: " + name + "\nSpot :: " + spot + "\nLevel :: " + level;
	}
}
