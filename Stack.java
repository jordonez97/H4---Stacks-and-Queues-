/* 
 * Joseph Ordonez 
 * H4 - Stack and Queue 
 * Lab Section: M 10:25a - 11:25a 
 * */

public class Stack {
   
  //private Node class
  class Node {
       //Variables 
       String value; 
       Node next; 
      
       //Constructor 
       Node(String val, Node n){
         value = val;
         next = n;
       }
       Node(String val){
         this(val, null);
       }
  }
   //Node top to null
   Node top = null; 
  
   //Boolean method isEmpty
   public boolean isEmpty(){
       return top == null; 
   }
  
   //Gets length of stack
   public int getLength() 
   {
       int size = 0;
       Node lengthNode = top;
      
       while(lengthNode != null) {
           size++;
           lengthNode = lengthNode.next; 
       }
       return size; 
   }
}
  