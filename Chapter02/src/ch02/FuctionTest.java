package ch02;


public class FuctionTest {
	//두 수를 입력받아 더한 결과 값을 반환
	public static int add(int num1, int num2) {
		return (num1 + num2);
	}
	//이름을 입력받아 이름+hello를 출력하세요
	public static void sayHello(String name) {
		System.out.println(name + " Hello~");
	}
	public static int calcSum() {
		int i,sum = 0;
		for(i=1;i<=100;i++)
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
		
		sum = add(num1, num2);
		System.out.println(sum);
		sayHello("mrchoi");
		sum = calcSum();
		System.out.println(sum);
	}

}
