package com.jzdoot.IA;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Director extends Officer{
	public void stats (){

	}
	public void updateBand(File f, boolean topLine) throws FileNotFoundException{
		Scanner s = new Scanner(f);
		s.useDelimiter(",");
		int count=0;
		if(topLine)
			s.nextLine();
		Map<String,Bandie> bl=new HashMap<String,Bandie>();
		while(s.hasNext()){
			System.out.println(s.next());
			String item = s.next();
			switch(count%5){
				case 0:
					System.out.println(item + count%5);
					break;
				// case 0:

				// 	break;
				// case 1:
				// 	nameArr[0]=item;
				// 	break;
				// case 2:
				// 	nameArr[1]=item;
				// 	break;
			}
			count++;
		}
	}
}
