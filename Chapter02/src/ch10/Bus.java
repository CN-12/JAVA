package ch10;

public class Bus {
	
	String number;
	int moeny;
	int passengerCount;
	
	public Bus(String number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
	}

}
