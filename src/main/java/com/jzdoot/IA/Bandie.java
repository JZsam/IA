package com.jzdoot.IA;
public class Bandie{
	private String spot, section, name;
	private int grade, level;
	private char currentAttendace = 'p', row;
	private Attendance attendance;

	public Bandie(){
		spot=null;
		section=null;
		name=null;
		level = 0;
	}
	public Bandie(String s, char r, String n, String sec, int g){
		spot=s;
		section=sec;
		name=n;
		row=r;
		grade=g;
		level = 0;
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
	public void  setLevel(int l){
		level = l;
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
	public int getLevel(){
		return level;
	}
	//NOTE Only ever use by Squad Leader or Above
	public void setAttendance(char a){
		 currentAttendace= a;
		attendance.updateAttendance(a);
	}
	public String toString(){
		return "Name :: " + name + "\nSpot :: " + spot + "\nLevel :: " + level + "\nRow :: " + row + "\nSection :: " + section + "\nGrade :: " + grade + "\nCurrent Attendance:: " + currentAttendace;
	}
}
