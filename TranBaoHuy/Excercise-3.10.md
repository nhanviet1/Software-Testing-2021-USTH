#Excercise 3.10
--- 

The list is different after we remove then add an element because itsposition is not the same anymore. Therefore, the resulting theory is invalid.
There is only one of three test cases can pass the test.

```java 
import org.junit.*;
import org.junit.runner.RunWith;	
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

import java.util.*;

@RunWith (Theories.class)
public class ListTheoryTest
{
   @DataPoints
   public static String[] string = {"chair", "table", "desk", "pen"};

   @DataPoints
   public static List[] lists = {
      Arrays.asList ("chair", "desk", "table"),
      Arrays.asList ("pen", "desk", "ruler"),
      Arrays.asList ("table")
   };


   @Theory
   public void removeThenAddDoesNotChangeList
                   (List<String> list, String string)
   {
      assumeTrue (list != null);
      assumeTrue (list.contains (string));
      List<String> copy = new ArrayList<String>(list);
      copy.remove (string);                       
      copy.add (string);
      assertTrue (list.equals (copy));
    }
}
```