//Practical: 3
//Program to convert meter to feet

package Practicals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Convert{
    double Meter;
    public double meterToFeet()
    {
        return Meter*3.28084;
    }
}
public class P3_Convert_m_f {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 3");
        System.out.println("------------");
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        Scanner scan = new Scanner(System.in);
        Convert Conversion_1 = new Convert();
        double toFeet;

        System.out.println("Enter meter to convert in feet: ");
        Conversion_1.Meter = scan.nextDouble();

        toFeet = Conversion_1.meterToFeet();
        System.out.println(Conversion_1.Meter+" meter = "+ toFeet + " feet");
    }
}
