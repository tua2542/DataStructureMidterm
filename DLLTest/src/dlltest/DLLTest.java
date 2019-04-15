/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlltest;

/**
 *
 * @author User
 */
public class DLLTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToHead(22);
		list.addAti(32, 1);
		list.addAti(40, 4);
		list.deleteAti(4);
		list.addToHead(42);
		list.addToHead(223);
		list.addToTail(50);
		System.out.println("--------Forward--------");
		list.printALLNodeForward();
		System.out.println("--------Backward--------");
		list.printAllNodeBackWard();
		System.out.println();
		System.out.println("--------CountForward--------");
		System.out.print(list.countNodeForward()+ " node");
		System.out.println();
		System.out.println("--------CountBackward--------");
		System.out.print(list.countNodeBackward()+ " node");
		System.out.println();
	
		// TODO code application logic here
	}
	
}
