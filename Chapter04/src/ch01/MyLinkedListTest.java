package ch01;

public class MyLinkedList {

	private MyListNode head;
	private int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	//끝에 추가
	public MyListNode addElement(String data) {
		MyListNode newNode = new MyListNode(data);;
		if(head == null) {
			head = newNode;
		}
		else {
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	//해당 위치에 추가
	public MyListNode insertElement(int position, String data) {
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			System.out.println("추가 할 위치 오류입니다. 현재 리스트 개수는 "+ count + "개 입니다.");
			return null;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	//위치 노드 삭제
	public MyListNode removeElement(int position) {
		MyListNode tempNode = head;
		
		if(position < 0 || position > count) {
			System.out.println("삭제할 위치 오류입니다. 현재 리스트 개수는" + count + "개 입니다.");
			return null;
		}
		if(position == 0) {
			head = tempNode.next;
		}
		else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public MyListNode getElement(int position) {
		MyListNode tempNode = head;
		
		if(position < 0 || position > count ) {
			System.out.println("검색할 위치 오류입니다. 현재 리스트 개수는" + count + "개 입니다.");
			return null;
		}
		if(position == 0) {
			return head;
		}

		for(int i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
}