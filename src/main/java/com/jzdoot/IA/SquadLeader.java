package com.jzdoot.IA;
public class SquadLeader extends Bandie{
	private String password;
	
	public SquadLeader (String s, String r, String n, String sec, int g){
		super(s,r,n,sec,g);
	}
	public SquadLeader (String s, String r, String n, String sec, int g, String pass){
		super(s,r,n,sec,g);
		password=pass;
	}
	public void takeAttendance(){

	}
}
