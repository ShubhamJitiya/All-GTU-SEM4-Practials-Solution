/*
Practical 15:
 Write the bin2Dec (string binary String) method to convert a binary string into a
decimal number. Implement the bin2Dec method to throw
NumberFormatException if the string is not a binary string
*/


package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class conversion2{
    int power;
    int decimal;
    String binary;

    conversion2()
    {
        power = binary.length()-1;
        decimal = 0;
    }

    public conversion2(String binary) {
        power = binary.length()-1;
        this.decimal = 0;
        this.binary = binary;
    }

    public int bin2dec() throws NumberFormatException
    {
        if (!isBinary(binary))
            throw new NumberFormatException(binary + " is not a Binary Number");
        for(int i = 0; i<=binary.length() -1;i++)
        {
            if (binary.charAt(i) == '1')
            {
                decimal+=Math.pow(2,power);
            }
            power --;
        }
        return decimal;
    }

    public boolean isBinary(String binary)
    {
        for (char ch: binary.toCharArray())
        {
            if(ch!='1' && ch!='0')
                return false;
        }
        return true;
    }
}


public class P15_Bin2Dec {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 15");
        System.out.println("------------");
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        String binary = new String(input.nextLine());

        conversion2 c1 = new conversion2(binary);

        System.out.println("Binary: "+binary);
        System.out.println("Decimal: " +  c1.bin2dec());

        //Other method for Bin2Dec
            //0b__binaryNumber or 0B__BN




    }
}
