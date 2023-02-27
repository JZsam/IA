package com.jzdoot.IA;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Attendance{
	private Map<Date,Character> record;
	//NOTE the currentAttendace is now in the bandie class
	public Attendance(){
		record=new HashMap<Date,Character>();
	}
	public void updateAttendance(char attendance){
		record.put(new Date(), attendance);
	}
}
