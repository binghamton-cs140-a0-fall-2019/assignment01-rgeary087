package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
	
	public static void main(String[] args){
		Person me = new Person("Ryan", "Geary", "1111111", new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA"),
								new StreetUSAddress("303 Main St.", "PO Box 1602", "New York City", "NY", "13412"));
		System.out.println(me);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		Person me2 = new Person("Ryan", "Geary", "1111111", new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA"),
								new StreetUSAddress("303 Main St.", "PO Box 1602", "New York City", "NY", "13412"));
		output.println(me); 
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}