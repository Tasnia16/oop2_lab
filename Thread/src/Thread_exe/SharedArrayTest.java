package Thread_exe;
import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String args[]){
        SimpleArray shareSimpleArray=new SimpleArray(6);
        Arraywriter writer1=new Arraywriter(1,shareSimpleArray);
        Arraywriter writer2=new Arraywriter(11,shareSimpleArray);
        ExecutorService exe= Executors.newCachedThreadPool();
        exe.execute(writer1);
        exe.execute(writer2);
        exe.shutdown();


        try {
            boolean taskend=exe.awaitTermination(1, TimeUnit.MINUTES);
       if(taskend)
           System.out.println(shareSimpleArray);

       else
           System.out.println("time out");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
