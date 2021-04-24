/*
Write a test program that prompts the user to enter an integer and display its product.

 */
package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P22_2
{
    static void DateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 22_2");
        System.out.println("------------");
    }
    public static void main(String[] args)
    {
        DateTime();
        Scanner input = new Scanner(System.in);
        int product=1;
        System.out.print("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
            product *= list[i];
        }
        System.out.println("The Product of elements is " + product);
    }
}