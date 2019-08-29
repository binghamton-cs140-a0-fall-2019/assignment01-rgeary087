package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
		
	public static void main(String[] args){
		SimpleDate date1 = new SimpleDate();
		SimpleDate date2 = new SimpleDate();
		SimpleDate date3 = new SimpleDate();
		SimpleDate date4 = new SimpleDate();
		date1 = date1.of(2001, 8, 7);
		date2 = date2.of(2003, 8, 7);
		date3 = date3.of(2001, 9, 7);
		date4 = date4.of(2001, 8, 6);
		
		System.out.println(date1.before(date2));
		System.out.println(date1.before(date3));
		System.out.println(date1.before(date4));
	}
	
}