import java.util.*;
public class ThreadNew implements Runnable {

        Thread t;
        int t1,t2;

    public ThreadNew( int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
        t.start();
    }
    @Override
    public void run() {
        System.out.println("add"+(t1+t2));
        System.out.println("sub"+(t1-t2));
        System.out.println("mul"+(t1*t2));

    }
}









//Create 3 threads named "ADD", "SUBTRACT", MULTIPLY
//When ADD thread runs it will add two given numbers
// When SUBTRACT thread runs it will subtract two given numbers
//and so on..