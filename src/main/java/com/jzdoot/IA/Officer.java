package com.jzdoot.IA;
public class Officer extends SquadLeader implements Top{
	// public void takeAttendance(char row){
	public Officer(String s, char r, String n, String sec, int g){
		super(s,r,n,sec,g);
	}
	public Officer (String s, char r, String n, String sec, int g, String pass){
		super(s,r,n,sec,g,pass);
	}
	public Officer(){
		super();
	}
	public void takeRowAttendance(char row, char[] a){
		Band.getRowFromMainBandInstance(row).updateRecord(this);
		for (int i = 0; i < Band.getRowFromMainBandInstance(row).size(); i++) {
			super.takeAttendance((""+row)+(i+1), a[i]);
		}
	}
}
