package Generics_slide;

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray) {
        // display array elements
        for(E element :  inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
/*   by object
    public static void printArray(  Object[] inputArray) {
        // display array elements
        for( Object element :  inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
*/
    public static void main(String args[])
    {
        //create arrays of Integer, Double and Float
        Integer [] integerArray={1,2,3,4,5,6};
        Double [] doubleArray={1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray={'H','E','L','L','O'};
        System.out.println("Array integerArray contains : ");
        printArray(integerArray);
        System.out.println("\nArray doubleArray contains : ");
        printArray(doubleArray);
        System.out.println("\nArray characterArray contains : ");
        printArray(characterArray);
    }
}
