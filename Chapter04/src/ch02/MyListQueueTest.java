package ch02;

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue qList = new MyListQueue();
		qList.enQueue("A");
		qList.enQueue("B");
		qList.enQueue("C");
		qList.enQueue("D");
		qList.enQueue("E");
		
		qList.printAll();
		
		System.out.print(qList.deQueue() + "����\n");
		System.out.print(qList.deQueue() + "����\n");
		qList.printAll();
	}

}
