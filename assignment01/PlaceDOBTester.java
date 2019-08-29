package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	
	public static void main(String[] args){
		//yr, month, day, city, state, country
		//yr, month, day, cirt, country
		
		
		DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob3 = new DateAndPlaceOfBirth(2001, 10, 26, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob4 = new DateAndPlaceOfBirth(2003, 8, 7, "Parma", "Italy");
		DateAndPlaceOfBirth dob5 = new DateAndPlaceOfBirth(2005, 12, 25, "Parma", "Italy");
		
		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(dob3);
		System.out.println(dob4);
		System.out.println(dob5);
		
		//4 methods: olderThan, youngerThan, hasSameBirthDayAs, hasSameBirthDateAs
		System.out.println(dob1.olderThan(dob2));
		System.out.println(dob1.olderThan(dob5));
		System.out.println(dob5.olderThan(dob3));
		
		System.out.println(dob1.youngerThan(dob2));
		System.out.println(dob3.youngerThan(dob4));
		System.out.println(dob5.youngerThan(dob3));
		
		System.out.println(dob1.hasSameBirthDayAs(dob2));
		System.out.println(dob2.hasSameBirthDayAs(dob4));
		System.out.println(dob3.hasSameBirthDayAs(dob5));
		
		System.out.println(dob1.hasSameBirthDateAs(dob2));
		System.out.println(dob2.hasSameBirthDateAs(dob4));
		System.out.println(dob3.hasSameBirthDateAs(dob5));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob22 = new DateAndPlaceOfBirth(2001, 8, 7, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob32 = new DateAndPlaceOfBirth(2001, 10, 26, "Parma", "Ohio", "USA");
		DateAndPlaceOfBirth dob42 = new DateAndPlaceOfBirth(2003, 8, 7, "Parma", "Italy");
		DateAndPlaceOfBirth dob52 = new DateAndPlaceOfBirth(2005, 12, 25, "Parma", "Italy");
		
		output.println(dob12);
		output.println(dob22);
		output.println(dob32);
		output.println(dob42);
		output.println(dob52);
		
		//4 methods: olderThan, youngerThan, hasSameBirthDayAs, hasSameBirthDateAs
		output.println(dob12.olderThan(dob22));
		output.println(dob12.olderThan(dob52));
		output.println(dob52.olderThan(dob32));
		
		output.println(dob12.youngerThan(dob22));
		output.println(dob32.youngerThan(dob42));
		output.println(dob52.youngerThan(dob32));
		
		output.println(dob12.hasSameBirthDayAs(dob22));
		output.println(dob22.hasSameBirthDayAs(dob42));
		output.println(dob32.hasSameBirthDayAs(dob52));
		
		output.println(dob12.hasSameBirthDateAs(dob22));
		output.println(dob22.hasSameBirthDateAs(dob42));
		output.println(dob32.hasSameBirthDateAs(dob52));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}