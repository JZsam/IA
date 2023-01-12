package com.jzdoot.IA;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;

public class Row{
	private char rowLetter;
	private LinkedList<Bandie> row;
	private Map<Date, SquadLeader> recordAttendance;

	public Row(char lett){
		rowLetter = lett;
		row = new LinkedList<Bandie>();
		recordAttendance = new TreeMap<Date, SquadLeader>();
	}
	public void updateRecord(SquadLeader sl){
		recordAttendance.put(new Date(), sl);
	}
}
