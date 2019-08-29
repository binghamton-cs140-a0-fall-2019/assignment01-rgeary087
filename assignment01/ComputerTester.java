package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester{
	
	public static void main(String[] args){
		//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	
		Computer cp1 = new Computer("Acer", "i7-8750H", 8, 1024, true, 500.0);
		Computer cp2 = new Computer("Apple", "i3-3300", 4, 512, false, 50000.0);
		Computer cp3 = new Computer("HP", "i7-8750H", 8, 1024, false, 500.0);
		Computer cp4 = new Computer("Dell", "i7-8750H", 8, 256, true, 500.0);
		
		System.out.println(cp1);
		System.out.println(cp2);
		System.out.println(cp3);
		System.out.println(cp4);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		Computer cp12 = new Computer("Acer", "i7-8750H", 8, 1024, true, 500.0);
		Computer cp22 = new Computer("Apple", "i3-3300", 4, 512, false, 50000.0);
		Computer cp32 = new Computer("HP", "i7-8750H", 8, 1024, false, 500.0);
		Computer cp42 = new Computer("Dell", "i7-8750H", 8, 256, true, 500.0);
		
		output.print(cp12);
		output.print(cp22);
		output.print(cp32);
		output.print(cp42);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}
	
}