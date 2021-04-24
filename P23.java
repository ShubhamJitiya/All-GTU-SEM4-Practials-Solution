/*
 * Program - 23
 * Write a generic method that returns the minimum
 * elements in a two-dimensional array.
 */
package Practicals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P23
{
    static void DateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 23");
        System.out.println("------------");
    }
    public static void main(String[] args)
    {
        DateTime();

        Integer[][] list = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }
        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0];
        for (E[] elements : list)
        {
            for (E element : elements)
            {
                if (element.compareTo(max) > 0)
                {
                    max = element;
                }
            }
        }
        return max;
    }
}