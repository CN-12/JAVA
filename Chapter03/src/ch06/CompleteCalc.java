package ch06;

public class CompleteCalc extends Calculator {

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

}
