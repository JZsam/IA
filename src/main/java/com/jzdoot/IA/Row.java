package com.jzdoot.IA;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Row implements Comparable<Row>{
	private char rowLetter;
	private LinkedList<Bandie> row;
	private Map<Date, Top> recordAttendance;

	public Row(){
		rowLetter = ' ';
		row = new LinkedList<Bandie>();
		recordAttendance = new TreeMap<Date, Top>();
	}
	public Row(char lett){
		rowLetter = lett;
		row = new LinkedList<Bandie>();
		recordAttendance = new TreeMap<Date, Top>();
	}
	public void updateRecord(Top sl){
		recordAttendance.put(new Date(), sl);
	}
	public Bandie getBandie(String spot){
		return row.get(Integer.parseInt(spot.substring(spot.length()-1)));
		// return new Bandie();
	}
	public int size(){
		//TODO write
		return row.size();
	}
	public int compareTo(Row obj){
		//TODO write
		return 1;//FIXME Placeholder
	}
	public char getLetter(){
		return rowLetter;
	}
}
