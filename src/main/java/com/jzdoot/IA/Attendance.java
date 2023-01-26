package com.jzdoot.IA;
import java.util.Date;
import java.util.HashMap;

public class Attendance{
	private HashMap<Date,Character> record;
	//NOTE the currentAttendace is now in the bandie class

	public void updateAttendance(char attendance){
		record.put(new Date(), attendance);
	}
}
