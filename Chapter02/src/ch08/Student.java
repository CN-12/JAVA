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
		System.out.println("�л��� �й��� " + stduentNumber + "�̰�, �̸��� " + studentName + "�̸�, �г��� " + grade + "�г� �Դϴ�.");
	}
}