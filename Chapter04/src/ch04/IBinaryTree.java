package ch04;

public interface IBinaryTree {
	
	public void addElemment(Student number);
	public String remove(int number);
	public void selectElement(int number);
	
	public void preOrder(MyTreeNode node);
	public void inOrder(MyTreeNode node);
	public void postOrder(MyTreeNode node);

}
