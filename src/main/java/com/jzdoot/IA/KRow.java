package com.jzdoot.IA;
import java.util.LinkedList;

public class KRow extends Row{
	private LinkedList<LinkedList<Bandie>> rowList;
	public KRow(){
		super('k');
		rowList = new LinkedList<LinkedList<Bandie>>();
	}
	public Bandie getBandie(String spot){
		return rowList.get(Integer.parseInt(spot.substring(1,2))).get(Integer.parseInt(spot.substring(spot.length()-1)));
		// return new Bandie();
	}
}
