package ch02;

import ch01.MyLinkedList;
import ch01.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{
	
	private MyListNode front;
	private MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()){
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = new MyListNode(data);
			rear.next = newNode;
			rear = newNode;
		}
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.print("현재 큐가 비어있습니다.");
			return null;
		}
		
		String data = front.getData();
		front = front.next;
		if(front.next == null) {
			rear = null;
		}
		return data;
	}

	@Override
	public void printAll() {
		MyListNode temp = front;
		while(temp != null) {
			System.out.print(temp.getData());
			if(temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
		System.out.println("");
	}

}
