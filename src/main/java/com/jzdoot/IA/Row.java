package com.jzdoot.IA;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Row{
	private char rowLetter;
	private LinkedList<Bandie> row;
	private Map<Date, Top> recordAttendance;

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
		return 1;
	}
}
