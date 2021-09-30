//Practical: 10
// Reverse 10 Numbers

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P10_Reverse{

    private static int[] arr = new int[10];

    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 10");
        System.out.println("------------");
    }
//    public int [] arr = new int[10];

    //Reading Values
    static void setArr() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
    }

    //Reversing array
    static void swap()
    {
        for (int i = 0; i<(arr.length)/2;i++)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    //Printing reverse number
    static void printInReverse(){
        System.out.println("Elements after reversing: ");
//        for (int i = 0; i<arr.length;i++)
//            System.out.print(arr[i]+", ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();

        System.out.println("Enter 10 integers: ");
        setArr();
//        swap();
        printInReverse();
    }
}
