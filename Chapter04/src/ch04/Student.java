package ch04;

public class Student {
	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("?й?" + number + " ?̸?:"+name);
	}
	
	public int getNumber() {
		return number;
	}
}
