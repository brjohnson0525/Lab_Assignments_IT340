import java.io.*;
import java.util.*;

class Lab3_Hashing {
 public static void main(String args[])
 {
  Hashtable<Integer, String> hash_table = 
    new Hashtable<Integer, String>();
  
  hash_table.put(0, "the");
  hash_table.put(1, "of");
  hash_table.put(2, "and");
  hash_table.put(3, "to");
  hash_table.put(4, "a");
  hash_table.put(5, "in");
  hash_table.put(6, "for");
  hash_table.put(7, "is");
  hash_table.put(8, "on");
  hash_table.put(9, "that");
  hash_table.put(10, "by");
  
  System.out.println("Initial Table Is: " + hash_table);
 }
}
