package ch05;

public class CarTest {
	public static void main(String[] args) {
		Car ai = new AICar();
		Car manual = new ManualCar();
		ai.run();
		manual.run();
	}
}
