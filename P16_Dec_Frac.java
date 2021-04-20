/*
Practical 16:
Write a program that prompts the user to enter a decimal number and displays
the number in a fraction.
Hint: Read the decimal number as a string, extract the integer part and fractional part from the string.
*/

package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class D2F
{
    int num1;
    int num2;
    int gcd;
    static double num = 100;

    public D2F(double num1) {
//        this.num2 = 100;
        int temp = String.valueOf(num1).split("\\.")[1].length();
        this.num1 = (int)(num1*(int) Math.pow(10, temp));

//        int length = num1.substring(num1.indexOf(".")+1).length();
        this.num2 = (int) Math.pow(10, temp);
        gcd = 1;
    }

    public void GCD()
    {
        System.out.println("GCD: " + gcd(num1,num2));
        System.out.println("Integer Fraction: a/b");
        System.out.println("a: " + num1/gcd(num1,num2));
        System.out.println("b: " + num2/gcd(num1,num2));
    }
    public int gcd(int m, int n)
    {
        if (n == 0)
            return (m);
        else if (n > m)
            return (gcd(n, m));
        else
            return (gcd(n, m % n));
    }
}

public class P16_Dec_Frac {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 16");
        System.out.println("------------");
    }
    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        double decimalNumber = Math.abs(input.nextDouble());

        D2F num1 = new D2F(decimalNumber);
        num1.GCD();

        double value= 19.2345658;
//      System.out.println(String.valueOf(value).split("\\.")[1].length());
        System.out.println("If You have Entered -ve Number then consider answer in Negative ");

    }
}

//        Enter a decimal number: 3.25 ↵Enter
//        The fraction number is 13/4

//Refer: 13.9 Rational Class_Liang