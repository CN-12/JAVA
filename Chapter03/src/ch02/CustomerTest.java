package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer choi = new Customer("choi");
		VIPCustomer kim = new VIPCustomer("kim");
		
		System.out.println("1000��¥�� ���� ���� : "+choi.calcPrice(1000)+" �� ������");
		System.out.println("1000��¥�� ���� ���� : "+kim.calcPrice(1000)+" �� ������");
	}

}
