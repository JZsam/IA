package com.jzdoot.IA;
public class Officer extends SquadLeader{//implements Top{
	// private int level = 2;
	// public void takeAttendance(char row){
	public Officer(String s, char r, String n, String sec, int g){
		super(s,r,n,sec,g);
		super.setLevel(2);
	}
	public Officer(){
		super();
		super.setLevel(2);
	}
	public void takeRowAttendance(char row, char[] a){
		Band.getRow(row).updateRecord(this);
		for (int i = 0; i < Band.getRow(row).size(); i++) {
			super.takeAttendance((""+row)+(i+1), a[i]);
		}
	}
}
