package com.jzdoot.IA;
public class Officer extends SquadLeader{
	// public void takeAttendance(char row){
	public Officer(String s, String r, String n, String sec, int g){
		super(s,r,n,sec,g);
	}
	public Officer (String s, String r, String n, String sec, int g, String pass){
		super(s,r,n,sec,g,pass);
	}
	public void takeAttendance(Row row){

	}
}
