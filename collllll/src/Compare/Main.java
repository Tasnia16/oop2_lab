package Compare;
import java.util.*;
public class Main
		{
            	   public void printElements()
           {
        	      List< Time2 > list = new ArrayList< Time2 >(); // create List

               list.add(new Time2(6, 24, 34))
               list.add( new Time2( 18, 14, 58 ) );
        	      list.add( new Time2(  6, 05, 34 ) );
        	      list.add( new Time2( 12, 14, 58 ) );
        	      list.add( new Time2(  6, 24, 22 ) );
               	      System.out.printf( "Unsorted array elements:\n%s\n", list );

               	      // sort in order using a comparator
               	      Collections.sort( list, new Timecopare() );

               	      // output List elements
               	      System.out.printf( "Sorted list elements:\n%s\n", list );
               	   } // end method printElements

            	   public static void main( String args[] )
		   {
            	      Main sort3 = new Main();
            	      sort3.printElements();
            	   }
		}



