package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class P12 {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 12");
        System.out.println("------------");
    }
    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();
        Random RanNum1 = new Random(1000);

        for (int i = 0; i<100; i++)
        {
            if(i%20==0)
                System.out.println(" ");
            System.out.print(RanNum1.nextInt(50) + ", ");
        }
        System.out.println();
        for (int i = 0; i<100; i++)
        {
            if(i%10==0)
                System.out.println(" ");
            System.out.print(RanNum1.nextInt(50) + ", ");
        }


//        Random RanNum2 = new Random(1000);
//        System.out.println();
//            System.out.print((int)(0+Math.random()*3) + " ");
//        for (int i = 0; i<10; i++)
//        {
////            System.out.print((int)(0+Math.random()*3) + " ");
//            System.out.print(RanNum2.nextInt(1000) + " ");
//        }
//        System.out.print(RanNum.nextInt(5) + " ");
//        System.out.print(RanNum.nextInt(5) + " ");
//        System.out.print(RanNum.nextInt(5) + " ");

    }
}
