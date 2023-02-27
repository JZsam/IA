package com.jzdoot.IA;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Row implements Comparable<Row>{
	private char rowLetter;
	private LinkedList<Bandie> row;
	private Map<Date, Top> recordAttendance;
	private int type = 1;

	public Row(){
		rowLetter = ' ';
		row = new LinkedList<Bandie>();
		recordAttendance = new HashMap<Date, Top>();
	}
	public Row(char lett){
		rowLetter = lett;
		row = new LinkedList<Bandie>();
		recordAttendance = new HashMap<Date, Top>();
	}
	public void updateRecord(Top sl){
		recordAttendance.put(new Date(), sl);
	}
	public Bandie getBandie(String spot){
		return row.get(Integer.parseInt(spot.substring(spot.length()-1)));
		// return new Bandie();
	}
	public int size(){
		return row.size();
	}
	public int compareTo(Row obj){//TODO Find out why
		return 1;//FIXME Placeholder
	}
	public int getType(){
		return type;
	}
	public void setType(int t){
		this.type = t;
	}
	public char getLetter(){
		return rowLetter;
	}
	public LinkedList<Bandie> getList(){
		return row;
	}
	public void addBandie(Bandie b){
		int current = Integer.parseInt(""+ b.getSpot().charAt(b.getSpot().length()-1));
		boolean worked = false;
		if(row.size()!=0){
			for(int i=0;i<row.size();i++){
				if(current > Integer.parseInt("" + row.get(i-1).getSpot().charAt(row.get(i-1).getSpot().length()-1)) && current < Integer.parseInt("" + row.get(i).getSpot().charAt(row.get(i).getSpot().length()-1))){
					row.add(i, b);
					worked = true;
				}
			}
		}
		if(!worked)
			row.add(b);
	}
}
