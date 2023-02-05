package com.jzdoot.IA;
import java.util.LinkedList;

public class KRow extends Row{
	private LinkedList<LinkedList<Bandie>> rowList;
	public KRow(){
		super('k');
		rowList = new LinkedList<LinkedList<Bandie>>();
	}
	public KRow(LinkedList<LinkedList<Bandie>> list){
		super('k');
		rowList = list;
	}
	public Bandie getBandie(String spot){
		return rowList.get(Integer.parseInt(spot.substring(1,2))).get(Integer.parseInt(spot.substring(spot.length()-1)));
		// return new Bandie();
	}
	public void addRow(LinkedList<Bandie> row){
		rowList.add(row);
	}
	public LinkedList<Bandie> getRow(int index){//intex starts at 0 so subtract in before you call this
		return rowList.get(index);
	}
}
