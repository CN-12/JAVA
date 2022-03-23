package ch10;

public class Subway {
	
	int number;
	int money;
	int passengerCount;
	
	public Subway(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
	}
}
