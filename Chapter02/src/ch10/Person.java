package ch10;

public class Person {

	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeSubway(Subway subway) {
		money -= 1300;
		subway.take(1300);
	}
	public void takeBus(Bus bus) {
		money -= 200;
		bus.take(200);
	}
	public takeCar() {
		
	}
	public showInfo() {
		System.out.println(name+"???? ???? ?ܾ???"+money+"?Դϴ?.");
	}
}
