package com.jzdoot.IA;
public class Bandie{
	private String spot, section, name;
	private int grade;
	private char currentAttendace, row;
	private Attendance attendance;

	public Bandie(){
		spot=null;
		section=null;
		name=null;
	}
	public Bandie(String s, char r, String n, String sec, int g){
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
	public char getRow(){
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
	public char getCurrentAttendance(){
		return currentAttendace;
	}
	public Attendance getAttendance(){
		return attendance;
	}
	//NOTE Only ever use in Squad Leader or Above
	public void setAttendance(char a){
		 currentAttendace= a;
		attendance.updateAttendance(a);
	}
	public String toString(){
		return "Spot :: " + spot + "\nRow :: " + row + "\nName :: " + name + "\nSection :: " + section + "\nGrade :: " + grade;
	}
}
