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
		System.out.println("Ű�� " + height + "�̰� �����԰� " + weight + "�� " + gender +"�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}
}
