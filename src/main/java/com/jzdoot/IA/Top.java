package com.jzdoot.IA;
public class Top{// extends Director{
	private Bandie fin;
	public Top(String s, String r, String n, String sec, int g, String ro){
		// super(s, r, n, sec, g);
		switch (ro) {
			case "leader":
				fin = new SquadLeader(s, r, n, sec, g);
				break;
			case "officer":
				fin = new Officer(s, r, n, sec, g);
				break;
			default:
				fin = new Bandie(s, r, n, sec, g);
				break;
		}
	}
	public Bandie get(){
		return fin;
	}
}
