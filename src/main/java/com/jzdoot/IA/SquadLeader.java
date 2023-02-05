package com.jzdoot.IA;
public class SquadLeader extends Bandie implements Top{//,Everyone{
	// Band b = new Band();
	// super.level = 1;
	public SquadLeader (String s, char r, String n, String sec, int g){
		super(s,r,n,sec,g);
		super.setLevel(1);
	}
	public SquadLeader(){
		super();
		super.setLevel(1);
	}
	public void takeRowAttendance(char[] a){
		Band.getRow(super.getRow()).updateRecord(this);
		for (int i = 0; i < Band.getRow(super.getRow()).size(); i++) {
			takeAttendance((""+super.getRow())+(i+1), a[i]);
			// Band.getBandieFromMainBandInstance((""+super.getRow())+a[i+1]);
		}
	}
	public void takeAttendance(String spott, char a){
		Band.getBandie(spott).setAttendance(a);
	}
}
