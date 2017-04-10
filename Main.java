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
   
    //public method moveStackToStack takes Stack inputStack and then pushes values to Stack duplicate 
    public static Stack moveStackToStack(Stack inputStack) {
       Stack duplicateStack = new Stack(); 
       String [] stringArray = new String [inputStack.getLength()];
      
       Stack.Node pushingNode2 = inputStack.top;
      
       int arrayLocation = 0; 
       
       while(pushingNode2 != null) {
           stringArray[arrayLocation] = pushingNode2.value; 
           arrayLocation++; 
           pushingNode2 = pushingNode2.next; 
       }
      for (int x = stringArray.length - 1; x >= 0 ; x--) {
           duplicateStack.push(stringArray[x]);
       }
      
       return duplicateStack; 
   }
    
     public static void main(String [] args){
     
       Stack list = new Stack(); 
       Queue qlist = new Queue(); 
  
       //testing Stack Class
       System.out.println("The Stack includes the following: ");
       list.push("5");
       list.push("4");
       list.push("3");
       list.push("2");
       list.push("1");
       list.traverseForwardAndPrint();
      
       String data = list.pop();
        System.out.println("\nPopped: " + data);
        System.out.println("Now since we popped from the top of the list, our Stack includes the following: ");
        list.traverseForwardAndPrint();
      
        System.out.println("Peeked: " + list.peek());
  
       //testing Queue Class
       System.out.println("\nThe Queue class includes the following: ");
       qlist.enqueue("2");
       qlist.enqueue("4");
       qlist.enqueue("6");
       qlist.enqueue("8");
       qlist.enqueue("10");
       qlist.traverseFrontAndPrint();
      
        String data2 = qlist.dequeue();
        System.out.println("\nDequeued: " + data2);
        System.out.println("We dequeue from the end of the list, our Queue includes the following: ");
        qlist.traverseFrontAndPrint();
      
        System.out.println("Peeked: " + qlist.peek());
      
     //Initiaizing our second set of stack and queue
       Stack list2 = new Stack(); 
       Queue qlist2 = new Queue(); 
      
       System.out.println("\nThis is our second Stack");
       list2.push("One");
       list2.push("Two");
       list2.push("Three");
       list2.push("Four");
       list2.push("Five");
       list2.traverseForwardAndPrint();
      
       System.out.println("This is our second Queue");
       qlist2.enqueue("One");
       qlist2.enqueue("Two");
       qlist2.enqueue("Three");
       qlist2.enqueue("Four");
       qlist2.enqueue("Five");
       qlist2.traverseFrontAndPrint();
      
       System.out.println();

      //testing moveStackToQueue method
       System.out.println("Testing the moveStackToQueue method: ");
       Queue testQueue3 = new Queue();
      
       testQueue3 = moveStackToQueue(list2);
       System.out.println("The Original Stack: ");
       list2.traverseForwardAndPrint();
       System.out.println("\nThe Queue after moving StackToQueue: ");
       testQueue3.traverseFrontAndPrint();
      
       System.out.println();
       
       //testing moveQueueToStack method
       System.out.println("Testing the moveQueueToStack method: ");
       Stack testStack3 = new Stack();
      
       testStack3 = moveQueueToStack(qlist2);
       System.out.println("The Original Queue: ");
       qlist2.traverseFrontAndPrint();
       System.out.println("\nThe Stack after moving QueueToStack: ");
       testStack3.traverseForwardAndPrint();
      
       System.out.println();
     }}
       
  
        