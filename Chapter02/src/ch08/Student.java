package ch08;

public class Student {
	private int stduentNumber;
	private String studentName;
	private int grade;
	
	
	public int getStduentNumber() {
		return stduentNumber;
	}


	public void setStduentNumber(int stduentNumber) {
		this.stduentNumber = stduentNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void showStudentInfo() {
		System.out.println("학생의 학번은 " + stduentNumber + "이고, 이름은 " + studentName + "이며, 학년은 " + grade + "학년 입니다.");
	}
}