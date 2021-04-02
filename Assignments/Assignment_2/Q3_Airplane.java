/*
    The Airplane class has three subclasses named B747, B757, and B767.
    Each plane type can transport different no. of passengers.
    Each airplane object has a unique serial no.
    Write an application that declares this class hierarchy.
    Instantiate several types of airplanes and display them.
    Override the toString() method of object to return a string with the type, serial no. and capacity.
*/

package Assignments.Assignment_2;

abstract class Airplane
{
    public String serialNo;
    public int passengers_Capacity;
    public String model;

    @Override
    public abstract String toString();
}



class B747 extends Airplane{
    public B747() {

        serialNo = "B747";
        passengers_Capacity = 500;
        model = "Boeing B747";
    }

    @Override
    public String toString() {
        return "Serial No: " + serialNo + " | Passengers Capacity: " + passengers_Capacity + " | Model: " + model;
    }
}

class B757 extends Airplane{
    public B757() {
        this.serialNo = "B757";
        this.passengers_Capacity = 100;
        this.model = "Boeing B757";
    }

    @Override
    public String toString() {
        return "Serial No: " + serialNo + " | Passengers Capacity: " + passengers_Capacity + " | Model: " + model;
    }
}

class B767 extends Airplane{
    public B767() {
        this.serialNo = "B767";
        this.passengers_Capacity = 50;
        this.model = "Boeing B767";
    }

    @Override
    public String toString() {
        return "Serial No: " + serialNo + " | Passengers Capacity: " + passengers_Capacity + "  | Model: " + model;
    }
}

public class Q3_Airplane {
    public static void main(String[] args) {
        Airplane plane_1 = new B747();
        Airplane plane_2 = new B757();
        Airplane plane_3 = new B767();

        System.out.println("Plane 1: " + plane_1.toString());
        System.out.println("Plane 2: " + plane_2.toString());
        System.out.println("Plane 3: " + plane_3.toString());

    }
}
