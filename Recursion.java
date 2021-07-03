import java.io.*; 

public class Palindrome { // Begin of Class
 private boolean isPalindrome(String word) {
  return false;
 } 
 String fileName = "www.gutenberg.org/files/11/11-0.txt";
 String line = null; { 
 
 try {
  FileReader fileReader = 
    new FileReader(fileName); 
  
  BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        } 
        bufferedReader.close();
 }
 }
 
 catch(FileNotFoundException ex) {
   System.out.println("Unable to open file " + fileName + ".");
 } 
 catch(IOException ex) {
   System.out.println("Error reading file " + fileName + ".");                  
      }
   public FileReader (String fileName) { 
   throw FileNotFoundException; 
 } 
 System.out.println(isPalindrome);
 
 private void findAllPalindromes(String fileName) {
  
 }
 
 public static boolean isTextPalindrome(String text) {
   if (text == null) {
    return false; 
   }
   int left = 0;
   int right = text.length()-1;
   while (left < right) {
     if (text.charAt(left++) != text.charAt(right--)) {
      return false; 
     }
   }
   return true;
 } 
 
 recursiveFunction(N) {
   if (base case) {
    Return; 
   }
   else {
    return recursiveFunction(N-1); 
   }
 
  if (isPalindrome("racecar")) {
      System.out.print("pass");
  }
  else {
    System.out.print("Fail");
  }
  if (isPalindrome("mom")) {
     System.out.print("pass");
     }
  else {
    System.out.print("Fail");
  }
  if (isPalindrome("noon")) {
     System.out.print("pass");
     }
  else {
    System.out.print("Fail");
  }
    
   }

 public static void main(String[] args) { // Begin of Main Method
  new Palindrome();

 } // Begin of Main Method
} // End of Class