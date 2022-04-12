package Thread_exe;
import java.util.Random;

            	public class SimpleArray // CAUTION: NOT THREAD SAFE!
		{
            	   private final int array[]; // the shared integer array
        	   private int writeIndex = 0; // index of next element to be written
        	   private final static Random generator = new Random();

        	   // construct a SimpleArray of a given size
        	   public SimpleArray( int size )
        	   {
        	      array = new int[ size ];
        	   } // end constructor

        	   // add a value to the shared array
        	   public void add( int value )
        	   {
        	      int position = writeIndex; // store the write index

        	      try
        	      {
        	         // put thread to sleep for 0-499 milliseconds
                Thread.sleep( generator.nextInt( 500 ) );
        	      } // end try
        	      catch ( InterruptedException ex )
        	      {
        	         ex.printStackTrace();
        	      } // end catch


                   	      array[ position ] = value;
                   	      System.out.printf( "%s wrote %2d to element %d.\n",
                       	         Thread.currentThread().getName(), value, position );

                   	      ++writeIndex; // increment index of element to be written next
                   	      System.out.printf( "Next write index: %d\n", writeIndex );
                   	   } // end method add

            	   // used for outputting the contents of the shared integer array
            	   public String toString()
		   {
            	      String arrayString = "\nContents of SimpleArray:\n";

            	      for ( int i = 0; i < array.length; i++ )
                	         arrayString += array[ i ] + " ";

            	      return arrayString;
            	   }
		}
