/* 
 * Joseph Ordonez 
 * H4 - Stack and Queue 
 * Lab Section: M 10:25a - 11:25a 
 * */
public class Main {
  
  //Public method moveStackToQueue takes a Stack inputStack enqueues to a Queue then returns
   public static Queue moveStackToQueue(Stack inputStack){
       Queue newQueue = new Queue();
      
       Stack.Node queueingNode = inputStack.top; 
      
       while(queueingNode != null) 
       {
           newQueue.enqueue(queueingNode.value); 
           queueingNode = queueingNode.next; 
       }
      return newQueue; 
   }
}
  
  
        