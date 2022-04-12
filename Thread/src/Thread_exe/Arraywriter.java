package Thread_exe;

import java.net.PortUnreachableException;

public class Arraywriter implements Runnable{

    private  final SimpleArray array;
    private final int value;
    public  Arraywriter(int value,SimpleArray array)
    {
          this.array=array;
          this.value=value;
    }
    @Override
    public void run() {
        for (int i=value;i<value+3;i++)
            array.add(i);
    }
}
