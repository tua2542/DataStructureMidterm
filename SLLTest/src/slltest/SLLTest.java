/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slltest;

/**
 *
 * @author User
 */
public class SLLTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addToHead(100);
		list.addAti(106,3);
		list.addToTail(102);
	   list.printAllNode();
	   System.out.println("------------------------");
	   list.printAllNodeReverse();
	    System.out.println("------------------------");
       list.addToTail(103);
        list.addAti(104,0);
        list.printAllNode();
		 System.out.println("------------------------");
		list.printAllNodeReverse();
		 System.out.println("------------------------");
		list.addAti(32, 1);
		  list.printAllNode();
		 System.out.println("------------------------");
		 list.printAllNodeReverse();
		 
		 System.out.println(list.countNode());
		// TODO code application logic here
	}
	
}
