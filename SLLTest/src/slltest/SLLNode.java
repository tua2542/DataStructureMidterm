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
public class SLLNode {
	private int data;
	SLLNode next;

	public SLLNode(int data, SLLNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode next) {
		this.next = next;
	}
	
}
