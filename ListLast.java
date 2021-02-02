//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas Oh
//Date - 02/02

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    //Initialize boolean value called lastValue and set it to false
    boolean lastValue = false;
    //Create a for loop with initialization x, that loops through all the elements of the array, except for the last one
    for(int x = 0; x < ray.size() - 1; x++)
    {
      //Create an if statement that looks if the elements of the ArrayList is greater than 0 AND if the value at the last index of the ArrayList is equal to the value of the element in the ArrayList at position x
      if(ray.get(x) == ray.get(ray.size() - 1) && ray.size() > 1)
      {
        //Return true if it passes through the if-statement
        lastValue = true;
        //Exit if-statement
      }
      //Exit for loop
      

    }
    //Return lastValue and enclose method
    return lastValue;
    
    
	}
}