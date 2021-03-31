package Practicals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class checkMatrix {
    Scanner input = new Scanner(System.in);
    int rows = 6;
    int columns = 6;
    int count;
    int invalidRowIndex;
    int invalidColumnIndex;
    int [] invalidRow = new int[rows];
    int [] invalidColumn = new int[columns];
    boolean finalValidator = true;
    int[][] Matrix = new int[rows][columns];

    /*
****** DOUBT ******
   public checkMatrix(int rows, int columns) {
       this.rows = rows;
       this.columns = columns;
   }

   public checkMatrix()
   {
       this.rows = 3;
       this.columns = 3;
   }
****** DOUBT ******
*/
    public void readMatrix() {
        System.out.println("Enter Elements (0 or 1) for " + rows + " X " + columns + " Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Matrix[i][j] = input.nextInt();
            }
        }
    }

    public void Display() {
        System.out.println("\nYour Entered " + rows + " X " + columns + " Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
//                System.out.println(rows + " " + columns);
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    boolean oddValidator() {
        if (count % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public void checkRows() {
        invalidRowIndex=0;
        for (int i = 0; i < rows; i++) {
            count = 0;
            for (int j = 0; j < columns; j++) {
                if (Matrix[i][j] == 1)
                    count++;
            }
            if (oddValidator())
                System.out.println("Row " + (i+1) + " : " + " Valid");
            else {
                System.out.println("Row " + (i + 1) + " : " +" Invalid");
                invalidRow[invalidRowIndex] = (i+1);
                invalidRowIndex++;
                finalValidator = false;
            }
        }
    }
    public void checkColumns() {
        invalidColumnIndex=0;
        for (int i = 0; i < rows; i++) {
            count = 0;
            for (int j = 0; j < columns; j++) {
                if (Matrix[j][i] == 1)
                    count++;
            }
            if (oddValidator())
                System.out.println("Column " + (i+1) + " : " + " Valid");
            else {
                System.out.println("Column " + (i + 1) + " : " +" Invalid");
                invalidColumn[invalidColumnIndex] = (i+1);
                invalidColumnIndex++;
                finalValidator = false;
            }
        }
    }
    void getInvalidRow()
    {
        if (invalidRowIndex == 0)
            System.out.println("No Invalid Rows Found");
        else {
            System.out.print("Invalid Rows are: ");
            for (int i = 0; i < invalidRowIndex; i++)
                System.out.print(" " + invalidRow[i]);
        }
    }
    void getInvalidColumn()
    {
        if (invalidColumnIndex == 0)
            System.out.println("No Invalid Columns Found");
        else {
            System.out.print("\nInvalid Columns are: ");
            for (int i = 0; i < invalidColumnIndex; i++)
                System.out.print(" " + invalidColumn[i]);
        }
    }
    void finalValidator()
    {
        if (finalValidator)
            System.out.println("VALID MATRIX");
        else
            System.out.println("INVALID MATRIX");
    }

//    public void checkColumns() {
//        for (int i = 0; i < rows; i++) {
//            count = 0;
//            for (int j = 0; j < columns; j++) {
//                if (Matrix[j][i] == 1)
//                    count++;
//            }
//            if (oddValidator())
//                System.out.println("Column: " + (i+1) + " : " + " Valid");
//            else {
//                System.out.println("Column: " + (i + 1) + " : " + " Invalid");
//                finalValidator = false;
//            }
//        }
//    }
}
public class P11_CheckMatrix {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 11");
        System.out.println("En: 190130107043");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prints Date, Time Practical Number
        DateTime();
//        System.out.println("Enter size of Matrix: ");

//        System.out.print("Rows: ");
//        int rows = input.nextInt();
//
//        System.out.print("Columns: ");
//        int columns = input.nextInt();

        checkMatrix matrix1 = new checkMatrix();

        matrix1.readMatrix();
        matrix1.Display();
        System.out.println("****************");
        matrix1.checkRows();
        System.out.println("****************");
        matrix1.checkColumns();
        System.out.println("---------------");
        matrix1.finalValidator();
        matrix1.getInvalidRow();
        matrix1.getInvalidColumn();
    }
}

/*
Approach:
    Read Matrix
    Display Matrix
    Count number of 1's
    Check Row
    Check Column
    Check Matrix
*/
