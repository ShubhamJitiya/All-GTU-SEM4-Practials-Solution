//Practical: 6
//Check Vowel or Consonant

package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6_Check_Vowel_Constant {

    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 6");
        System.out.println("------------");
    }

//Function to check Vowel or Consonant
   static void vowel(char Ch){
        if (Ch == 'a'||Ch == 'e'||Ch == 'i'||Ch == 'o'||Ch == 'u')
            System.out.println("Vowel");
        else if (Ch == 'A'||Ch == 'E'||Ch == 'I'||Ch == 'O'||Ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        Scanner scan = new Scanner(System.in);

/*
        //Method:1 to input a character
        System.out.print("Enter a letter: ");
        String str = scan.next();
        char readCh = str.charAt(0);
        System.out.println("Method: 1 ->" + readCh);

 */
        //Method:2 to input a character
        System.out.print("Enter a letter: ");
        char readCh = scan.next().charAt(0);
        vowel(readCh);



    }
}
