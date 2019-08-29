package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester{
	
	public static void main(String[] args){
		StreetUSAddress add1 = new StreetUSAddress("4400 Vestal Pkwy E", "   ", "Vestal", "NY", "13902");
		StreetUSAddress add2 = new StreetUSAddress("303 Main St.", "PO Box 1602", "New York City", "NY", "13412");
		
		System.out.println(add2);
		System.out.println(add1);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress add12 = new StreetUSAddress("4400 Vestal Pkwy E", "", "Vestal", "NY", "13902");
		StreetUSAddress add22 = new StreetUSAddress("303 Main St.", "PO Box 1602", "New York City", "NY", "13412");
		
		output.println(add22);
		output.println(add12);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
