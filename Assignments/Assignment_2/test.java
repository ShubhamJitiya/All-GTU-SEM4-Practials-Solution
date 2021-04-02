package Assignments.Assignment_2;

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
        System.out.println("Integer: " + num1/gcd(num1,num2));
        System.out.println("Fraction: " + num2/gcd(num1,num2));
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

public  class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        double decimalNumber = Math.abs(input.nextDouble());

        D2F num1 = new D2F(decimalNumber);
        num1.GCD();

        double value= 19.2345658;
//        System.out.println(String.valueOf(value).split("\\.")[1].length());
        System.out.println("If You have Entered -ve Number then consider answer in Negative ");

    }
}