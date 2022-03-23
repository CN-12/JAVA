package ch06;

public abstract class Calculator implements Calc {

	@Override
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}

}
