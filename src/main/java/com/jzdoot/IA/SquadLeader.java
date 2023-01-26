package com.jzdoot.IA;
public class SquadLeader extends Bandie{
	private String password;
	Band b = new Band();
	public SquadLeader (String s, char r, String n, String sec, int g){
		super(s,r,n,sec,g);
		password=s;
	}
	public SquadLeader (String s, char r, String n, String sec, int g, String pass){
		super(s,r,n,sec,g);
		password=pass;
	}
	public void takeRowAttendance(char[] a){
		Band.getRowFromMainBandInstance(super.getRow()).updateRecord(this);
		for (int i = 0; i < Band.getRowFromMainBandInstance(super.getRow()).size(); i++) {
			takeAttendance((""+super.getRow())+(i+1), a[i]);
			// Band.getBandieFromMainBandInstance((""+super.getRow())+a[i+1]);
		}
	}
	public void takeAttendance(String spott, char a){
		Band.getBandieFromMainBandInstance(spott).setAttendance(a);
	}
}
