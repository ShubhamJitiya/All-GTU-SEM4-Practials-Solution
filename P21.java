
/*
 * Program - 21
 * Write a program to create a file name 123.txt,
 * if it does not exist. Append a new data to it if it already exists.
 * Write  150  integers created randomly into the file using Text  I/O.
 * Integers are separated by space.
 */
package Practicals;

import java.io.*;
        import java.util.Scanner;

public class P21
{
    public static void main(String[] args)
    {

        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("newFile.txt"), true));
        ) {
            for (int i = 0; i < 150; i++)
            {
                pw.print((int)(Math.random() * 150) + " ");
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Cannot create the file.");
            fnfe.printStackTrace();
        }
    }
}

//--module-path "C:\Program Files\openjfx-16_windows-x64_bin-sdk\javafx-sdk-16\lib" --add-modules javafx.controls,javafx.fxml