package ch04;

public class MyTreeNode {
	private Student student;
	public MyTreeNode left;
	public MyTreeNode right;
	
	public MyTreeNode() {
		student=null;
		left=null;
		right=null;
	}
	
	public MyTreeNode(Student student) {
		this.student = student;
		this.left = left;
		this.right = right;
	}
	
	public Student getStudent() {
		return student;
	}
}
