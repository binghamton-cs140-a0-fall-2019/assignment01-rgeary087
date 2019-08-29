package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDate{
	int year, month, date;	
	public static SimpleDate of(int yr, int m, int d){
		SimpleDate returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.date = d;
		return returnValue;
	}
	public boolean before(SimpleDate other){
		if(year < other.year){
			return true;
		}else if(month < other.month){
			return true;
		}else if(date < other.date){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}