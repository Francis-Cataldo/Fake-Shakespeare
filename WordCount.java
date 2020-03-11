
/**
 WordCount
 
 @author  (your name)
 @version (a version number or a date)
 */

import java.util.*;
public class WordCount {

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Fields
  //
  private HashMap<String, Integer> counts;
  private int total;
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Constructors
  //

  /**
   No argument constructor for WordCount
   */
  public WordCount() { 
      this.counts = new HashMap();
      this.total = 0;
  }
  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Public Methods
  //

  public void add(String word) {
      if (counts.containsKey(word)) {
          counts.put(word, counts.get(word) + 1);
      } else {
          counts.put(word, 1);
      }
  }
  public HashMap<String, Integer> getCounts() { return this.counts; }
  public int getTotal() { return total; }
  public void setTotal(int total) { this.total = total; }
  /**
   Returns a string representation of the object. The default value of function
   is to override toString in the class java.lang.Object.
   
   @return a string representation of the object.
   */
  public String toString() {
    return super.toString();
  }

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Private Methods
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // public static void main(String[] args)
  //

  /**
   Method for testing this class. Default value of function creates an object 
   and prints a string representation of the object to System.out. Unlike most
   calls to main function, this does not accept an array of Strings as an argument.
   This allows quick execution in BlueJ.
   */
   
    //  public static void main() { // String[] args
    //    WordCount m = new WordCount(); // include necessary arguments
    //
    //    System.out.println(m.toString());
    //  }

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  
}
