//Practical: 2
//Solve Equation using Cramer's Rule

package Practicals;
import java.util.Date;
import java.text.SimpleDateFormat;

public class P2_Cramers_Rule {

    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 1");
        System.out.println("------------");
    }
    static float cramers_Rule_X(float a, float b, float c, float d, float e, float f)
    {
        float X;
        X = (e*d-b*f)/(a*d-b*c);
        return X;
    }
    static float cramers_Rule_Y(float a, float b, float c, float d, float e, float f)
    {
        float Y;
        Y = (a*f-e*c)/(a*d-b*c);
        return Y;
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 2");
        System.out.println("------------");

        //---------------------------------//

        //Driver code
        float x, y;
        x = cramers_Rule_X(3.4f, 50.2f, 2.1f, 0.55f, 44.5f, 5.9f);
        y = cramers_Rule_Y(3.4f, 50.2f, 2.1f, 0.55f, 44.5f, 5.9f);
        System.out.println(x);
        System.out.println(y);
    }
}
