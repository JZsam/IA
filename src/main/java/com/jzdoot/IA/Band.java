package com.jzdoot.IA;
import java.util.LinkedList;

public class Band{
	private LinkedList<Row> block;
	private LinkedList<Director> directors;
	private Band mainBandInstance;//MBI
	public Band(LinkedList<Row> bck){
		block = bck;
	}

	public void stats(){

	}
	public void createMainBandIstance(LinkedList<Row> bck){
		mainBandInstance = new Band(bck);
	}
	public void resetMainBandInstance(){
		this.block.clear();
	}
	public void fillMainBandInstance(LinkedList<Row> bck){
		for(Row r: bck){
			this.block.add(r);
		}
	}
	public void setMainBandInstance(LinkedList<Row> bck){
		resetMainBandInstance();
	}
	//TODO finish up getBandieFromMainBandInstance method
	public Bandie getBandieFromMainBandInstance(String spot){
		return new Bandie();
	}
}
