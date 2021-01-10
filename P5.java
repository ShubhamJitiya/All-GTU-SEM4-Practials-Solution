//Practical: 5
//Enter three integers
//Display the integers in decreasing order

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

public class P5 {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 5");
        System.out.println("------------");
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        int [] integers = new int[3];
        int swap;
        Scanner scan = new Scanner(System.in);

        //Prompts message to Enter 3 integers
        System.out.print("Enter three integers: ");
        for (int i = 0; i<integers.length; i++)
        {
            integers[i] = scan.nextInt();
        }
        System.out.print("Elements you have Entered: ");

        for (int integer : integers) {
            System.out.print(" " + integer);
        }

        //Sorting
        Arrays.sort(integers);

        //Print Integers in Decreasing Order
        System.out.print("\nElements in Decreasing order: ");
        for (int i = 2; i>=0; i--)
        {
            System.out.print(" " + integers[i]);
        }
    }
}
