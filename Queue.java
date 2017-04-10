/* 
 * Joseph Ordonez 
 * H4 - Stack and Queue 
 * Lab Section: M 10:25a - 11:25a 
 * */

public class Queue {
  
//private Node class
  class Node {
       //variables
       String value; 
       Node next; 
       
       //Constructor
       Node(String val, Node n) {
            value = val;
            next = n;
       }
       
       Node(String val) {
           this(val, null); 
       }  
   }
}
  