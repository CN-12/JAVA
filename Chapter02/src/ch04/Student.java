package ch04;

public class Student {
	int number;
	String name;
	int grade;
	
	public Student() {}
	
	public Student(int number, String name, int grade) {
		this.number = number;
		this.grade = grade;
		this.name = name;
		
	}
	
	public void showStudentInfo() {
		System.out.println("�й� " + number +"�̰� �̸��� "+name+"�̸� �г��� "+grade+"�Դϴ�.");
	}
}
