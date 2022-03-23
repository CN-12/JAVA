package ch08;

public class StudentTest {

	public static void main(String[] args) {

		Student studentChoi = new Student();
		
		studentChoi.setGrade(1);
		studentChoi.setStduentNumber(100);
		studentChoi.setStudentName("choi");
		
		studentChoi.showStudentInfo();
	}

}	