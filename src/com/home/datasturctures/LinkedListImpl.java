package com.home.datasturctures;

public class LinkedListImpl<T> {

	Node head;
	
	class Node {
		T  data;
		Node next;
		
		Node(T d){
			data = d;
			next = null;
		}
	}
	
	public void insert(T data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(this.head == null) {
			this.head = new_node;
		}else {
			Node last = this.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	
	public void printList() {
		Node currNode = this.head;
		System.out.println("LinkedList:: ");
		
		while(currNode != null) {
			System.out.print(currNode.data.toString() + " ");
			currNode = currNode.next;
		}
		System.out.println("\n");
	}
	
	public void deleteByKey(T key) {
		Node currNode = this.head;
		Node prev = null;
		
		if(currNode !=null && currNode.data.equals(key)) {
			this.head = currNode.next;
			System.out.println(key + " found and deleted");
			return;
		}
		
		while(currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		if(currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found in middle and deleted");
		}
		
		if(currNode == null) {
			System.out.println(key + " not found");
		}
	}
	
	public void deleteAtPosition(int index) {
		Node currNode = this.head, prev = null;
		
		if(index == 0 && currNode != null) {
			this.head = currNode.next;
			System.out.println(index + " position element deleted");
			return;
		}
		
		int counter = 0;
		
		while(currNode != null) {
			if(counter == index) {
				prev.next = currNode.next;
				System.out.println(index + " position element deleted");
				break;
			}else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		
		if(currNode == null) {
			System.out.println(index + " position element not found");
		}
	}
	
	public static void main(String[] args) {
		LinkedListImpl<String> listString = new LinkedListImpl<>();
		listString.insert("Mobin");
		listString.insert("Fareena");
		listString.insert("Nibras");
		listString.insert("Muneer");
		listString.insert("Mujeeb");
		listString.insert("Muqthar");
		
		listString.printList();
		
		listString.deleteByKey("Nibras");
		listString.printList();
		
		listString.deleteAtPosition(2);
		listString.printList();
	}
	
}
