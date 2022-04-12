package thread2;

public class Print2 {

    public synchronized void print_doc(int copy,String name)
    {
        for (int i=0;i<copy;i++)
        {
            System.out.println("printing"+name);
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
