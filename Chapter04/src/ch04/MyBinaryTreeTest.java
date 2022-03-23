package ch04;

public class MyBinaryTreeTest {
	public static void main(String[] args) {
		MyBinaryTree bTree = new MyBinaryTree();
		
		bTree.addElemment(new Student(10, "ÀÇÀÚ¿Õ"));
		bTree.addElemment(new Student(5, "°×µå"));
		bTree.addElemment(new Student(1, "¼º¼ö"));
		bTree.addElemment(new Student(7, "±×..."));
		bTree.addElemment(new Student(12, "¹Î¼®Äï"));
		bTree.addElemment(new Student(14, "¾Ö¶õÀÌ"));
		
		bTree.preOrder(bTree.getRoot());
	}
}
