/*
       Write a program to demonstrate the use of array of Objects and static variable
 */

package Assignments.Assignment_2;

class Students{
    String sname;
    int rollno;
    static String HOD;

    static{
        HOD = " Prof. ABC";
    }

    public Students(String sname, int rollno)
    {
        this.sname = sname;
        this.rollno = rollno;
    }

    public String toString()
    {
        return "Student Name: " + sname
                        +  "| Roll Number: "  + rollno
                        +  " | HOD: "          + HOD;
    }
}

public class Q1_ArrayOfObjects {
    public static void main(String[] args) {
        Students s1 = new Students("Shubham", 43);
        Students s2 = new Students("Shyam  ", 44);
        Students s3 = new Students("Manthan", 45);
        Students s4 = new Students("Devansh", 46);

        //Array of Objects - Array of References
        Students[] Stud = new Students[4];

        Stud[0] = s1;
        Stud[1] = s2;
        Stud[2] = s3;
        Stud[3] = s4;

        for (Students s: Stud) {
            System.out.println(s);
        }
    }
}
