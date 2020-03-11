
/**
 FakeShakespeare
 
 @author  (your name)
 @version (a version number or a date)
 */

import java.util.*;
import java.io.*;
public class FakeShakespeare {

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Fields
  //
  private String[] words;
  private int total;
  private HashMap<String, WordCount> analysis;
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Constructors
  //

  /**
   No argument constructor for FakeShakespeare
   */
  public FakeShakespeare() { 
      this.analysis = new HashMap();
  }
  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Public Methods
  //
  
  public void readShakespeare() {
    File file = new File("shakespeare.txt");
    String text = "";  
    StringBuffer output = new StringBuffer();
    
    System.out.println("starting reading Shakespeare...");
    
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int lines = 0;
        while(((line = br.readLine()) != null)) {
            // text+=st + "\n"; 
            //if ((!(((String)line).equals((String)line.toUpperCase())))) {
                output.append(line);
                output.append("\n");
            //}
            
            lines+=1;
        }
    } catch(Exception e) {
      e.printStackTrace();
    }
    // this.words = text.split(" ");
    this.total = output.toString().length();
    
    System.out.print("...finished reading Shakespeare.");
    System.out.println(" " + output.toString().length() + " letters read.");
    
    this.words = output.toString().split("\\s+");
    
    buildAnalysis();
  }
  public void buildAnalysis() {
      for (int i = 1; i < words.length-1; i++) {
          if (analysis.containsKey(words[i])) {
              
          } else {
              analysis.put(words[i], new WordCount());
          }
          if (!(analysis.get(words[i]).getCounts().containsKey(words[i+1]))) {
              analysis.get(words[i]).getCounts().put(words[i+1], 1);
              analysis.get(words[i]).setTotal(analysis.get(words[i]).getTotal()+1);
          } else {
              HashMap count = analysis.get(words[i]).getCounts();  
              count.put(words[i+1], (int)count.get(words[i+1])+1);
              analysis.get(words[i]).setTotal(analysis.get(words[i]).getTotal()+1);
              
              //analysis.put(words[i], analysis.get(words[i]).getCounts().put(words[i+1],analysis.get(words[i]).getCounts().get(words[i+1])+1));
          }
      }
  }
  public String generateRandomWord(String word) {
      WordCount prob = analysis.get(word);
      try {
          prob.getTotal();
      } catch (NullPointerException e) {
          return "No possible outcomes"; 
      }
      
      int possibilities = prob.getTotal();
      int randomNum = (int)(Math.random() * possibilities); 
      
      for (Map.Entry mapElement : prob.getCounts().entrySet()) {
          randomNum -= (int)mapElement.getValue();
          if(randomNum < 1) {
              return (String)mapElement.getKey();
          }
      }
      return "";
  }
  public String generateRandomPhrase(String word, int phraseLength) {
    if (phraseLength < 1) {
        return "";
    }
    String newWord = "";
    String phrase = "";
    phrase += word + " ";
    
    for(int i = 0; i < phraseLength; i++) {
        newWord = (generateRandomWord(word));
        if (newWord.equals("No possible outcomes")) {
            phrase = "No possible outcomes";
            break;
        }
        phrase += newWord + " ";
        if (i % 10 == 8) {
            phrase += "\n";
        }
        word = newWord; 
    }
    return phrase;
  }
  
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
    //    FakeShakespeare m = new FakeShakespeare(); // include necessary arguments
    //
    //    System.out.println(m.toString());
    //  }

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  
}
