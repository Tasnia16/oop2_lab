package Generics_slide;

public class StackTest2 {
    private Double[] doubleElements={1.1,2.2,3.3,4.4,5.5,6.6};
    private Integer[] integerElements={1,2,3,4,5,6,7,8,9,10,11};
    private Stack<Double>doubleStack;
    private Stack<Integer>integerStack;

    public void testStacks()
    {
        doubleStack=new Stack<Double>(5);
        integerStack=new Stack<Integer>(10);

        testPush("doubleStack",doubleStack,doubleElements);
        testPop("doubleStack",doubleStack);
        testPush("integerStack",integerStack,integerElements);
        testPop("integerStack",integerStack);
    }

    public <T> void testPush(String name,Stack<T>stack,T[] elememts)
    {
        try
        {
            System.out.printf("\nPushing elements into %s\n ", name);
            for (T element:elememts)
            {
                System.out.printf("%s\t\t",element);
                stack.push(element);
            }
        }
        catch (FullStackException fullStackException)
        {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    public <T>void testPop(String name,Stack<T>stack)
    {
        try
        {
            System.out.printf("\nPopping elements from %s\n ",name);
            T popValue;
            while (true)
            {
                popValue=stack.pop();
                System.out.printf("%s\t\t",popValue);
            }
        }
        catch (EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        StackTest2 application=new StackTest2();
        application.testStacks();
    }
}
