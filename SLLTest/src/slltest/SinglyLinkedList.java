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
public class SinglyLinkedList {
	SLLNode head;
	SLLNode tail;
	public SinglyLinkedList(){
	      tail =null;
		  head = null;
	}
	public void addToHead(int value){
		SLLNode newNode = new SLLNode(value, null);
		if(head == null){
			head = tail = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		
	}
	public void addToTail(int value){
		SLLNode newNode = new SLLNode(value, null);
		if(head == null){
			head = tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void deleteFromHead(){
		if(head == tail){
			head = tail = null;
		} else {
			head.next = head;
		}
	}
	public void deleteFromTail(){
		SLLNode temp = head;
		if(head == tail ){
			head = tail = null;
		} else {
			while(temp.next != tail){
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			
		}
	}
	public void addAti(int value , int i){
		SLLNode newNode = new SLLNode(value, null);
		if(i <= 1){
			addToHead(value);
		}else{
			SLLNode temp = head;
			for (int j = 1;temp != null && j < i-1  ; j++) {
				temp = temp.next;
				
			}
			if(temp == null){
				addToTail(value);
			}else{
				tail.next = temp.next;
				temp.next = newNode;
			}
		}
	}
	public void deleteAti(int i){
		if(i <= 1){
			deleteFromHead();
		}else{
			SLLNode temp = head;
			for (int j = 1;temp != null && j < i-1 ; j++) {
				temp = temp.next;
			}
			if(temp == null || temp.next == null){
				deleteFromTail();
			}else{
				temp.next = temp.next.next;
				
			}
		}
	}
	
	public void printAllNode(){
		 //                                    p
        SLLNode p = head;
        if (head == null) {
            System.out.println("Sorry No node!!!!");
        }else{
        while (p != tail) {
            System.out.print(p.getData() + "->");
            p = p.next;  //move p to the next node
        }
			System.out.println(p.getData());
    }
	    }
	public void printAllNodeReverse(){
		 //                                    p
        SLLNode p = head;
        if (head == null) {
            System.out.println("Sorry No node!!!!");
        }else{
        while (p != tail) {
            System.out.print(p.getData() + "<-");
            p = p.next;  //move p to the next node
        }
			System.out.println(p.getData());
    }
	    }
	public int countNode(){
		int count = 0;
		SLLNode p = head;
		while(p != tail){
			p = p.next;
			count++;
		}
		return count; 
	}
	}
	

