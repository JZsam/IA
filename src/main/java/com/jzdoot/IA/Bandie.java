package com.jzdoot.IA;
public class Bandie{
	private String spot, section,name;
	private char row;
	private int grade;
	private Attendance attendance;

	public Bandie(){
		spot=null;
		section=null;
		name=null;
	}
	public Bandie(String spo, String sec, String nam, char r,int grad){
		spot=spo;
		section=sec;
		name=nam;
		row=r;
		grade=grad;
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
	public Attendance getAttendance(){
		return attendance;
	}
}
