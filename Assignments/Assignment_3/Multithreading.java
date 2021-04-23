package Assignments.Assignment_3;

public class Multithreading {
    public static void main(String[] args) {

        Thread t3 = new Thread(()->
        {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi .."); //Print hi 5 times
                try {
                    Thread.sleep(500); //TAKE PAUSE
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(()->
        {
            for (int i = 0; i<=5; i++)
            {
                System.out.println("Hello .."); //Print hello 5 times
                try {
                    Thread.sleep(500); //TAKE PAUSE
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t3.start();
        try{ Thread.sleep(10); }catch(Exception e){}; //To overcome from clashes of hi hello
        t4.start();
    }
}
//Thread thread = new Thread(Runnable_obj)
//Runnable ->Functional Interface -> Lambda expression