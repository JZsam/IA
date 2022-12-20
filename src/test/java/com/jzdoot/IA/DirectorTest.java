package com.jzdoot.IA;
// import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;

public class DirectorTest{
	@Test
	public void updateBandTest() throws FileNotFoundException{
		Director d = new Director();
		d.updateBand(new File("./testStuff/UAMB Attendance 2022-23 - Week 2 - 8_22-8_26.csv"),true);
		// Assertions.assertFalse(false);
	}
}
