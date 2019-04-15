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
public class StackTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		MyStack list = new MyStack(5);
		list.push(30);
		list.push(50);
		list.push(30);
		list.push(50);	
		list.push(120);
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		// TODO code application logic here
	}
	
}
