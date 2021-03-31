package Practicals;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String set1 = """
                1 3 5 7
                9 11 13 15
                17 19 21 23
                25 27 29 31
                """;
        String set2 = """
                2 3 6 7
                10 11 14 15
                18 19 22 23
                26 27 30 31
                """;
        String set3 = """
                4 5 6 7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """;
        String set4 = """
                8 9 10 11
                12 13 14 15
                24 25 26 27
                28 29 30 31
                """;
        String set5 = """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """;
        int day = 0;

        System.out.println("\nIs your birthday in Set-1?");
        System.out.println(set1);
        System.out.print("Enter N for no and Y for yes: ");
        char answer = input.next().charAt(0);

        if(answer == 'Y')
            day += 1;

        System.out.println("\nIs your birthday in Set-2?");
        System.out.println(set2);
        System.out.print("Enter N for no and Y for yes: ");
        answer = input.next().charAt(0);

        if(answer == 'Y')
            day += 2;

        System.out.println("\nIs your birthday in Set-3?");
        System.out.println(set3);
        System.out.print("Enter N for no and Y for yes: ");
        answer = input.next().charAt(0);

        if(answer == 'Y')
            day += 4;

        System.out.println("\nIs your birthday in Set-4?");
        System.out.println(set4);
        System.out.print("Enter N for no and Y for yes: ");
        answer = input.next().charAt(0);

        if(answer == 'Y')
            day += 8;

        System.out.println("\nIs your birthday in Set-5?");
        System.out.println(set5);
        System.out.print("Enter N for no and Y for yes: ");
        answer = input.next().charAt(0);

        if(answer == 'Y')
            day += 16;

        System.out.println("\nYour birthdate is " + day);
    }
}