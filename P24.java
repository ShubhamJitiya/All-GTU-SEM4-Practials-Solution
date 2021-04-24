package Practicals;
/*
 * Program - 24
 * Define  MYPriorityQueue class that extends
 * Priority Queue to implement the  Cloneable
 * interface and implement the clone() method
 * to clone a priority queue.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;

public class P24
{
    static void DateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 24");
        System.out.println("------------");
    }
    public static void main(String[] args)
    {
        DateTime();
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("10");
        queue.offer("20");
        queue.offer("30");

        MyPriorityQueue<String> queue1 = null;
        try
        {
            queue1 = (MyPriorityQueue<String>)(queue.clone());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.print(queue1);
    }

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable
    {
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }

    }
}