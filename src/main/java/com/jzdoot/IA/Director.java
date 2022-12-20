package com.jzdoot.IA;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
// import java.util.NoSuchElementException;
import java.util.Scanner;

public class Director extends Officer{
	public Director(){
		super("D1", "D", "Todd Fessler", "Director",13);
	}
	public Director (String s, String r, String n, String sec, int g){
		super(s,r,n,sec,g);
	}
	public Director (String s, String r, String n, String sec, int g, String pass){
		super(s,r,n,sec,g,pass);
	}
	public void stats (){

	}
	public void updateBand(File f, boolean topLine) throws FileNotFoundException{
		Scanner s = new Scanner(f);
		s.useDelimiter(",");
		int count=0;
		if(topLine)
			s.nextLine();
		Map<String,Bandie> bl=new HashMap<String,Bandie>();
		String spot = "", section="", name="", row="";
		int grade=9;
		while(s.hasNext()){
			String item = s.next();
			// System.out.println(item +"\n"+ count%6);
			switch(count%6){
				case 0:
					spot=item;
					if (item.charAt(0)=='K') {
						row=""+item.charAt(0)+item.charAt(1);
					}else
						row=""+item.charAt(0);
					break;
				case 1:
					name=item+" ";
					break;
				case 2:
					name+=item;
					break;
				case 3:
					section = item;
					break;
				case 4:
					grade = Integer.parseInt(item);
					break;
				case 5:
					Top t = new Top(spot, row, name, section, grade, item);
					bl.put(spot, t.get());
			}
			count++;
		}
		s.close();
		System.out.println(bl.toString());
	}
}
