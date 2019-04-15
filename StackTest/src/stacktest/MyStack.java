/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;

/**
 *
 * @author User
 */
public class MyStack {
    private int top;
    private int[] data;
	public MyStack(int size){
		data = new int[size];
		
	 }
	public void push(int value){
		if(!isFull()){
			data[top] = value;
			top++;
		}else { 
			System.out.println("Stack is full!!!");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			top--;
			return  data[top];
			
		}else { 
			System.out.println("Nothing to pop!!");
			return Integer.MAX_VALUE;
	   }
	}
	public int top() { 
		if(!isEmpty()){
         return data[top-1];
      } else {
            System.out.println("Nothing to peek at stack!");
            return Integer.MAX_VALUE;
        }
		
	}
	public int peek(){
		if(!isEmpty()){
		return data[top-1];
	} else {
		System.out.println("Nothing to peek at stack!");
		 return Integer.MAX_VALUE;
		}
}
	public boolean isEmpty(){
		return top == 0;
	}
	public boolean isFull(){
		return top == data.length;
	}
	public void clear(){
		top = 0;
	}
	public int size(){
		return top;
	}
}
