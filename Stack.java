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
}