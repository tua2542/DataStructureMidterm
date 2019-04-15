/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetest;

/**
 *
 * @author User
 */
public class QueueTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		MyQueue list = new MyQueue(30);
		list.enqueue(0);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(7);
        list.enqueue(8);
        list.enqueue(9);
        System.out.println(list.dequeue());
        list.enqueue(10);
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println("----------------------------------");
		
		// TODO code application logic here
	}
	
}
