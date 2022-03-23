package ch07;

public class Student {
	
	int number;
	String name;
	Subject korean;
	Subject math;
	
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanScore() {
		
		korean.score = score;
	}
	
	public void setmathScore() {
		math.score = score;
	}
	
	public void showStudentScore() {
		int sum = korean.score + math.score;
		System.out.println(name + "학생의 총점은 " +sum+"입니다." );
	}
}
