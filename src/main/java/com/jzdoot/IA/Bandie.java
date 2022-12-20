package com.jzdoot.IA;
public class Bandie{
	private String spot, section, name, row;
	private int grade;
	private Attendance attendance;

	public Bandie(){
		spot=null;
		section=null;
		name=null;
	}
	public Bandie(String s, String r, String n, String sec, int g){
		spot=s;
		section=sec;
		name=n;
		row=r;
		grade=g;
		attendance = new Attendance();
	}
	public String getSpot(){
		return spot;
	}
	public String getRow(){
		return row;
	}
	public String getSection(){
		return section;
	}
	public int getGrade(){
		return grade;
	}
	public String getName(){
		return name;
	}
	public Attendance getAttendance(){
		return attendance;
	}
	public String toString(){
		return "Spot :: " + spot + "\nRow :: " + row + "\nName :: " + name + "\nSection :: " + section + "\nGrade :: " + grade;
	}
}
