/*
    Write a recursive method that returns the smallest integer in an array.
 */
package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P22_1
{
    static void DateTime(){
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
    Date date = new Date();
    System.out.println(dateFormat.format(date));
    System.out.println("En: 190130107043");
    System.out.println("Practical: 22_1");
    System.out.println("------------");
}
    public static void main(String[] args)
    {
        //Prints Date, Time Practical Number
        DateTime();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers: ");

        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }

        System.out.println("The smallest element is " + min(list));
    }


    public static int min(int[] list)
    {
        int min = list[list.length - 1];
        int index = list.length - 1;
        return min(list, index, min);
    }

    private static int min(int[] list, int index, int min)
    {
        if (index < 0)
        {
            return min;
        }
        else if (list[index] < min)
        {
            return min(list, index - 1, list[index]);
        }
        else
        {
            return min(list, index - 1, min);
        }
    }
}