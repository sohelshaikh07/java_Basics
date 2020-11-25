//Array(string) Sorting in java using ArrayList.
//i/p A a Z z G
//o/p A G Z a z

import java.util.*; 
  
public class GFG { 
    public static void main(String args[]) 
    { 
  
        // Get the ArrayList 
        ArrayList<String> 
            list = new ArrayList<String>(); 
  
        // Populate the ArrayList 
        list.add("A"); 
        list.add("a"); 
        list.add("Z"); 
        list.add("z"); 
        list.add("G"); 
  
        // Print the unsorted ArrayList 
        System.out.println("Unsorted ArrayList: "
                           + list); 
  
        // Sorting ArrayList in ascending Order 
        // using Collection.sort() method 
        Collections.sort(list); 
  
        // Print the sorted ArrayList 
        System.out.println("Sorted ArrayList "
                           + "in Ascending order : "
                           + list); 
    } 
} 