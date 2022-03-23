package ch06;

public class Order {
	
	String h1;
	String h2;
	String h3;
	String h4;
	String h5;
	String h6;
	String h7;
	String h8;
	public Order(String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8) {
		
		this.h1 = h1;
		this.h2 = h2;
		this.h3 = h3;
		this.h4 = h4;
		this.h5 = h5;
		this.h6 = h6;
		this.h7 = h7;
		this.h8 = h8;
	}
	public void showOrderInfo() {
		System.out.println(h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8);
	}
}
