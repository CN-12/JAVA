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
		System.out.println("학번 " + number +"이고 이름은 "+name+"이며 학년은 "+grade+"입니다.");
	}
}
