package com.jzdoot.IA;
public class Bandie implements Everyone{
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
	public void setSpot(String s){
		spot=s;
	}
	public char getRow(){
		return row;
	}
	public void setRow(char r){
		row=r;
	}
	public String getSection(){
		return section;
	}
	public void setSection(String s){
		section=s;
	}
	public int getGrade(){
		return grade;
	}
	public void setGrade(int g){
		grade=g;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
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
