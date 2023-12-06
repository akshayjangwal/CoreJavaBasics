import java.text.SimpleDateFormat;
import java.util.Date;                      //-----> import java.util is the PACKAGE and Date is a CLASS in that package

public class DateDemo {

	public static void main(String[] args) {

		Date d = new Date();               //---> imported java.util package by hovering over this line
		System.out.println(d.toString());  //----> can't print object directly, so converted it into string to get a readable output
	    
		//print date in desired format 
		SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");  //---> imported import java.text.SimpleDateFormat package
		SimpleDateFormat b = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(a.format(d));                          //----> used object.format() method
	    System.out.println(b.format(d));
	}

}
