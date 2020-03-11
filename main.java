
//
// advanced placement computer science
//

import java.io.*;
import java.util.*;
/**
  s18p02_shakespeare_cataldo_francis is the root class of a solution to a programming problem. this class should
  contain only calls to System.out and methods of other classes. it should not contain
  a significant amount of other coding.
 
  @author  (your name)
  @version December 09, 2019, 12:49:54 PM
*/
public class s18p02_shakespeare_cataldo_francis {  
  public static void main() { // main(String[] args) throws Exception
    String description = "\n" + "s18p02_shakespeare_cataldo_francis" + "\n";
    System.out.println(description);
      
    //
    // your code goes here
    
    FakeShakespeare fs = new FakeShakespeare();
    fs.readShakespeare();
    Scanner sc = new Scanner(System.in);
    boolean sentinel = true; 
    System.out.println("---FakeShakespeare---");
    
    while(sentinel) {
        System.out.println("Enter a phrase to start your fake Shakespeare with ('x' to stop)");
        String input = sc.nextLine();
        if(!(input.equals("x"))) {
            
            System.out.println(fs.generateRandomPhrase(input, 100));
        } else {
            sentinel = false;
        }
    }
    
    /*
    
    String text = "";
    HashMap<String, Integer> map = new HashMap();
    
    try {
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
          text += sc.nextLine();
    
    } catch(Exception e) {
    
    }
    
    String[] words = text.split(" ");
    
    System.out.println("DONE");
    for(int i = 0; i < words.length; i++) {
        if (map.containsKey(words[i])) {
            map.put(words[i], map.get(words[i]) + 1);
        } else {
            map.put(words[i], 1);
        }
    }
    for(Map.Entry mapElement : map.entrySet()) {
        String key = (String)(mapElement.getKey());
        int count = ((int)mapElement.getValue());
        System.out.println(key + " : " + count);
    }
    */
    /*
    HashMap<String, Integer> map = new HashMap();
  
    String src = "working together on assignments is both permitted and encouraged in this course. this " +
     "means that each is an equal contributor to the work done for the assignment. looking " + 
     "at the documentation for methods is permitted; searching the web for solutions to a " +
     "problem is not.";
     
    String[] words = src.split(" ");
    
    for(int i = 0; i < words.length; i++) {
        if (map.containsKey(words[i])) {
            map.put(words[i], map.get(words[i]) + 1);
        } else {
            map.put(words[i], 1);
        }
    }
    System.out.println(map);
    for(Map.Entry mapElement : map.entrySet()) {
        String key = (String)(mapElement.getKey());
        int count = ((int)mapElement.getValue());
        System.out.println(key + " : " + count);
    }
    System.out.println("DONE");
    */
    
    //
    // signature: 
    //
     
    // System.exit(0); // seems to disrupt execution on a Macintosh
  }
}
