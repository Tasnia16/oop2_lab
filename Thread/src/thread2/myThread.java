package thread2;
import java.util.*;
import java.lang.*;
public class myThread {
    public  static void main(String args[]) throws InterruptedException {
            Thread t=new Thread(new Print1("esha.pdf",10));
            Thread t2=new Thread(new Print1("efad.pdf",2));
            t.start();
         t.join();
            t2.start();

    }
}
