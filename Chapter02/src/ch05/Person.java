package ch05;

public class Person {
	String name;
	int age;
	int height;
	int weight;
	String gender;
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		
	}
	public void showstudentInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "인 " + gender +"이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
}
