/*
Bonus: 
Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
(push): method for adding items to stack, the push operation adds items to the top of the list
(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
In the case of overflow the user should be informed with a message
In the case of underflow, the user should be informed with a message & a value of zero is returned.

Assumptions: The stack will hold up to 10 integer values.
*/


public class Stack {
	public final int maxSize = 10;
	private int top;
	private int[] arr;
	
	public Stack(int maxSize){
		   arr = new int[maxSize];
		   top = -1;
	   }
       public int pop(){
    	   if(top == -1){
    		   System.out.println("the Stack is empty");
           return 0;
    	   }
    	   return arr[top--]; 
       }
    	   
       public void push(int num){
    	 if(top > maxSize - 1){
    		 System.out.println("out of bounds");
    	 }
    	   arr[++top] = num;
       }
}

