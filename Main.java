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
   
    //public method moveQueueToStack takes Queue inputQueue and then pushes values to Stack newStack
   public static Stack moveQueueToStack(Queue inputQueue) 
   {
       Stack newStack = new Stack();
       String [] stringArray = new String[inputQueue.getLength()]; 
      
       Queue.Node pushingNode = inputQueue.front;
      
       int arrayLocation = 0; 
       
       while(pushingNode != null) {
           stringArray[arrayLocation] = pushingNode.value;
           arrayLocation++;
           pushingNode = pushingNode.next; 
       }
      
       for (int x = stringArray.length - 1; x >= 0; x--) {
           newStack.push(stringArray[x]);
       }
      
       return newStack; 
   }
   
}
  
  
        