package ch10;

public class TakeTest {

	public static void main(String[] args) {
		Person p1 = new Person("yesterday", 5000);
		Person p2 = new Person("today", 20000);
		
		Subway brown = new Subway(3);
		
		p1.takeSubway(brown);
		p1.takeBus(bus7_2);
		
		p1.showInfo();
		p2.showInfo();
	}
	
}
