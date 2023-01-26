package com.jzdoot.IA;
import java.util.LinkedList;

public class Band{
	private LinkedList<Row> block;
	// private LinkedList<Director> directors;
	private static Band mainBandInstance;//MBI

	public Band(){
		block = new LinkedList<Row>();
	}
	public Band(LinkedList<Row> bck){
		block = bck;
	}

	public void stats(){

	}
	public void reset(){
		block.clear();
	}
	public void fill(LinkedList<Row> bck){
		for(Row r: bck){
			block.add(r);
		}
	}
	public void set(LinkedList<Row> bck){
		reset();
		fill(bck);
	}
	public Row getRow(char row){
		return block.get(row);
	}
	public Bandie getBandie(String spot){
		return getRow(spot.charAt(0)).getBandie(spot);
	}
	//NOTE These are all being used for the Main Band Instance
	public static void createMainBandIstance(LinkedList<Row> bck){
		mainBandInstance = new Band(bck);
	}
	public static void resetMainBandInstance(){
		mainBandInstance.reset();
	}
	public static void fillMainBandInstance(LinkedList<Row> bck){
		mainBandInstance.fill(bck);
	}
	public static void setMainBandInstance(LinkedList<Row> bck){
		mainBandInstance.set(bck);
	}
	public static Row getRowFromMainBandInstance(char row){
		return mainBandInstance.getRow(row);
	}
	public static Bandie getBandieFromMainBandInstance(String spot){
		return mainBandInstance.getBandie(spot);
	}
}
