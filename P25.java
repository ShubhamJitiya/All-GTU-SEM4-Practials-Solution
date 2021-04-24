package Practicals;

/*
 * Program - 25
 * Write a program that reads words from a
 * text file and displays all the non-duplicate
 * words in descending order. The text file is
 * passed as a command-line argument.
 */

import java.io.*;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.*;

public class P25
{ static void DateTime() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
    Date date = new Date();
    System.out.println(dateFormat.format(date));
    System.out.println("En: 190130107043");
    System.out.println("Practical: 25");
    System.out.println("------------");
}
    public static void main(String[] args) throws FileNotFoundException
    {
        DateTime();
        if (args.length != 1)
            throw new InvalidParameterException("Usage: fullFilePathName");

        File file = new File(args[0]);

        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file.");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 10000))
        {
            String inputS;
            StringBuilder sb = new StringBuilder(10000);
            while ((inputS = in.readLine()) != null)
                sb.append(inputS);

            String[] words = sb.toString().split("\\s+");

            TreeSet<String> ndWords = new TreeSet<>(Arrays.asList(words));

            Iterator<String> itr = ndWords.descendingIterator();
            String s;
            while (itr.hasNext())
            {
                s = itr.next();
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(0);
        }

    }
}