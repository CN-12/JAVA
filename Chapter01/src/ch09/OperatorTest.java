package ch09;

public class OperatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((num2 = num2 + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(num2);
	}

}
