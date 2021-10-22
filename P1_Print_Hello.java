//(1) Write a Program that displays 
// Welcome to Java, Learning Java Now and Programming is fun.

import java.util.Date;
import java.text.SimpleDateFormat;

public class P1_Print_Hello {
	//Function to Print date, time and practical number
    	static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 4");
        System.out.println("------------");
    }
    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();

	    // Test
	    
        //Code
        System.out.print("Welcome to Java, Learning Java Now and Programming is fun");
    }
}
