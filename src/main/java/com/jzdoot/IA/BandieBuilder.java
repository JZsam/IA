package com.jzdoot.IA;
public class BandieBuilder{
	private String spot, section, name;
	private int grade, level = 0;
	private char row;

	public void setSpot(String s){
		spot=s;
	}
	public void setRow(char r){
		row=r;
	}
	public void setSection(String s){
		section=s;
	}
	public void setGrade(int g){
		grade=g;
	}
	public void  setLevel(int l){
		level = l;
	}
	public void setName(String n){
		name = n;
	}
	public Bandie get(){
		switch(level){
			case 1:
				return new SquadLeader(spot, row, name, section, grade);
			case 3:
				return new Officer(spot, row, name, section, grade);
			default:
				return new Bandie(spot, row, name, section, grade);
		}
	}
	public Director getDir(){
		return new Director(name, spot);
	}
}
