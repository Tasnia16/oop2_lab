package thread2;
import java.util.*;
import java.lang.*;
public class Print1 implements Runnable {
    private String name;
    private int copy;
    public Print1(String name, int copy)
    {
      this.name=name;
      this.copy=copy;
    }
    @Override
    public void run()
    {
      Print2 p=new Print2();
      p.print_doc(copy,name);
    }
}
