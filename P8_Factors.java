//Practical 8
//Factors

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P8_Factors {
    //Function to Print date, time and practical number
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 8");
        System.out.println("------------");
    }

    //Function to calculate GCD
     static void Factors(int value){
         int div = 2;
         while (value > 1) {
             if (value % div == 0) {
                 System.out.print(div + ", ");
                 value = value / div;
             }
             else {
                 div++;
             }
         }
     }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        Scanner input = new Scanner(System.in);

        //Read value
        System.out.print("Enter Integer value: ");
        Factors(input.nextInt());
    }
}

