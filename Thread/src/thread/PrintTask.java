package thread;
import java.util.*;
public class PrintTask implements Runnable {

    private  String task_name;
    private  int sleep_time;
    private Random generator=new Random();
    public PrintTask(String task_name)
    {
        this.task_name=task_name;
        sleep_time=generator.nextInt(3000);
    }
    @Override
    public  void run() {
        try
        {
            System.out.println(sleep_time);
            Thread.sleep(sleep_time);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
