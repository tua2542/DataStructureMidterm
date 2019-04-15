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
public class DoublyLinkedList {
	DLLNode head;
	DLLNode tail;
   
	public  DoublyLinkedList(){
	   head = null;
	   tail = null;
	}
	public void addToHead(int value){
		DLLNode newNode = new DLLNode(value, null, null);
		if(head == null){
			head = tail = newNode;
		} else {
			head.prev =  newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	public void addToTail(int value){
		DLLNode newNode = new DLLNode(value, null, null);
		if (head == null) {
			head = tail = newNode;
		} else {
	 	     tail.next = newNode;
			  newNode.prev = tail;
			  tail = tail.next;
			 
		}
		
	}
	public void deleteFromHead(){
		if(head == tail){
			head = tail = null;
		} else {
			DLLNode temp = head;
			temp.next = head;
			head.prev = null;
		}
	}
	public void deleteFromTail(){
		if(head == tail){
		   head = tail = null;
		} else {
			DLLNode temp = head;
			while(temp.next != tail){
				temp = temp.next;
			}
			temp.next = tail ;
			tail.prev.next = null;
			tail = tail.prev;
		}
	}
	public void addAti(int value , int i){
		DLLNode newNode = new DLLNode(value, null, null);
		if(i <= 1){
			addToHead(value);
		} else {
			DLLNode temp = head;
			for (int j = 1; temp != null && j < i-1 ; j++) {
				temp = temp.next;
			}
			if(temp == null){
				addToTail(value);
			}else {
				temp.next = newNode.next;
				newNode.prev = temp.prev;
				
				
			}
			   
		}
		
	}
	public void deleteAti(int i){
		if(i <= 1){
			deleteFromHead();
		}else{
			DLLNode temp = head;
			for (int j = 0; temp != null && j < i-1; j++) {
				temp = temp.next;
			}
			if(temp == null){
				deleteFromTail();
			} else {
				temp.next.next = temp.next;
				temp.prev = temp.next.next;
			}
		}
	}
	
	
	public void printALLNodeForward(){
		DLLNode p = head;
		if(head == null){
			System.out.println("Sorry no node !!!");
			
		} else {
			while(p != tail){
				System.out.print(p.getData()+"->");
				p = p.next;
			}
			System.out.println(p.getData());
			
		}
		
	}
	
	public void printAllNodeBackWard(){
		DLLNode p = tail;
		if(tail == null){
			System.out.println("Sorry no node!!!");
		}else{
			while(p.prev != null){
				System.out.print(p.getData()+"->");
				p = p.prev;
			}
			System.out.print(p.getData());
		}
	}
	public int countNodeForward(){
		int count = 1;
		DLLNode p = head;
		while(p != tail){
			p = p.next;
			count++;
		}
		return count;
	}
	public int countNodeBackward(){
		int count = 0;
		DLLNode p = tail;
		while(p != null){
			p = p.prev;
			count++;
		}
		return count;
	}
	
}
