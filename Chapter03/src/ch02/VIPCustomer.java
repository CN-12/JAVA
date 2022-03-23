package ch02;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	public VIPCustomer(String name) {
		super(name);
		super.name = name;
		super.customerNumber = super.number++;
		super.grade = "vip";
		super.bonusRatio = 0.05;
		
		this.saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
//		bonusPoint = (int) (price * bonusRatio);
//		return bonusPoint;
		
		bonusPoint = (int) (price * bonusRatio);
		return price-(int)(price*saleRatio);
	}
}
