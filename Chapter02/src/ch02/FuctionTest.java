package ch02;


public class FuctionTest {
	//�� ���� �Է¹޾� ���� ��� ���� ��ȯ
	public static int add(int num1, int num2) {
		return (num1 + num2);
	}
	//�̸��� �Է¹޾� �̸�+hello�� ����ϼ���
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
