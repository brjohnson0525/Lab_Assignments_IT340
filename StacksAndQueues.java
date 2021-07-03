import java.util.ArrayList;

public class StacksAndQueues { // Begin of Class
 ArrayList<String> fruit = new ArrayList<String>(); 
 ArrayList<String> q = new ArrayList<String>();

 public class Stack {
  
  public void push(String node) {
   fruit.add(node);
  }
  
  public String pop() {
   if(!isEmpty()) {
   String value = fruit.get(fruit.size()-1);
   fruit.remove(fruit.size()-1);
   return value;
   }
   else {
    System.out.println("There is nothing to pop");
    return null;
   }
  }
  public boolean isEmpty() {
   return fruit.size()==0;   
  }
  public void printStack() {
 System.out.println("---Stack----");

  }
  
  public Stack() {
     int i = fruit.size();
     Stack = stacks.get(0);
     for (int i = 1; i < len; i++) { // Begin of "for loop"
       if (fruit.get(i).getSize() > stacks.getSize()) { // Begin of "if"
        stacks = fruit.get(i); 
       } // End of "if"
     } // End of "for" Loop
     return stacks;
    
  }

 }
 
 public class Queue{
  
  
  public void enqueue(String node) {

  }
  
  
  public String dequeue() {
   if (isString()) {
      System.out.print("True");
  }
  else {
    System.out.print("False");
  }

  }
  public boolean isEmpty() {
  
  }
  public void printQueue() {

  }
  
  public Queue() {
   
  }
 }
 
 public StacksAndQueues() {
  Stack fruit= new Stack();
  fruit.pop();
  fruit.push("Apple");
  fruit.push("Banana");
  fruit.pop();
  fruit.push("Canned Yams");
  fruit.push("Durian");
  fruit.printStack();
  fruit.pop();
  fruit.pop();
  fruit.printStack();
  
  Queue q = new Queue();
  q.enqueue("Job 1");
  q.enqueue("Job 2");
  q.enqueue("Job 3");
  q.printQueue();
  q.dequeue();
  q.dequeue();
  q.printQueue();
         
 }
 
 
 public static void main(String[] args) {
  new StacksAndQueues();

 }
} // End of Class
