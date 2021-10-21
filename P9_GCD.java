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

    static int GCD(int num1, int num2)  //changed the function from recursive to iterative
    {
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)  {   
            if(x%i==0 && y%i==0)  
            gcd = i;  
        } 
        return gcd;
    }

    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();
        
        Scanner scan = new Scanner(System.in);
        int Num1;
        int Num2;
        
        // User may give negative number by mistake. So better to check the conditions to avoid undesired output.
        do{
            System.out.println("Enter two Positive Integers to Find GCD");
            //Reading two positive integers
            Num1 = scan.nextInt();
            Num2 = scan.nextInt();
        }while(Num1 <= 0 || Num2 <= 0);

        System.out.println("GCD of two number " + Num1 + " and " + Num2 + " is " + GCD(Num1, Num2));

    }
}
