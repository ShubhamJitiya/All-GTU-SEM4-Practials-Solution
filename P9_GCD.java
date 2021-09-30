//Practical: 9
//Find GCD

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P9_GCD{

    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 9");
        System.out.println("------------");
    }

    static int GCD(int num1, int num2)
    {
        if(num2==0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }

    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        System.out.println("Enter two Positive Integers to Find GCD");

        //Reading two positive integers
        Scanner scan = new Scanner(System.in);
        int Num1 = scan.nextInt();
        int Num2 = scan.nextInt();

        System.out.println("GCD of two number " + Num1 + " and " + Num2 + " is " + GCD(Num1, Num2));

    }
}
