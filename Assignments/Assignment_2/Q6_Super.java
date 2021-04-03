/*
    Write an application that illustrates how a method can invoke a super class method.
    Class I2 is extended by J2.
    Class J2 is extended by K2.
    Each of these class defines a getDescription() method that returns a string.
    That String includes a description of the class plus descriptions of each super class.
    Instantiate each object of these classes and invoke the getDescription () method
 */
package Assignments.Assignment_2;
class K2{

    String SC;

    public K2() {
        this.SC = "K2";
    }

    public String getDescription()
    {
        return "I'm from K2 Class\nSuper Class: "+SC;
    }
}

class J2 extends K2{

    public J2() {
        this.SC = "K2";
    }

    public String getDescription()
    {
        return "I'm from J2 Class\nSuper Class: "+ SC;
    }
}

class I2 extends J2{

    public I2() {
        this.SC = "J2";
    }

    public String getDescription()
    {
        return "I'm from I2 Class\nSuper Class: "+ SC;
    }
}
public class Q6_Super {
    public static void main(String[] args) {
        K2 obj1 = new K2();
        J2 obj2 = new J2();
        I2 obj3 = new I2();

        System.out.println(obj1.getDescription() + "\n");
        System.out.println(obj2.getDescription()+ "\n");
        System.out.println(obj3.getDescription()+ "\n");

    }
}
