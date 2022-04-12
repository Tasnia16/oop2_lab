package thread;
import java.util.*;
import java.lang.*;
public class ThreadCreator {
    public  static  void main (String args[])
    {
        Thread thread1=new Thread(new PrintTask("Task1"));
        thread1.start();
    }

}
