package com.jzdoot.IA;
import java.io.File;
import java.io.FileNotFoundException;

public class App{
	public static void main(String[] args) throws FileNotFoundException{
		Director d = new Director();
		d.updateBand(new File("testStuff/UAMB Attendance 2022-23 - Week 2 - 8_22-8_26.csv"), true);
	}
}
