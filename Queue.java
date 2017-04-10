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
    //initializes Node front and rear to null 
    Node front = null; 
    Node rear = null; 
    
    //boolean method isEmpty
    public boolean isEmpty() {
       return front == null; 
    }
  
   //gets Length of queue
   public int getLength(){
       int size = 0; 
       Node lengthNode = front;
      
       while(lengthNode != null) {
           size++;
           lengthNode = lengthNode.next;
       }
  return size; 
   }
   
   //Add item to the front of the list
    public void enqueue(String data) {
       if(rear != null) {
           rear.next = new Node(data, null);
           rear = rear.next;
       }
       else {
           rear = new Node(data, null);
           front = rear;
       }
    }
  
    //remove item from the end of the queue
    public String dequeue()
    {
       if(isEmpty()){
           System.out.println("The Queue is empty.");
           return null;
       }
       else {
         String dequeuedValue = front.value; 
           front = front.next; 
          
        if (front == null) {
               rear = null;
           }
          
        return dequeuedValue; 
       }
    }

}
  