package ch04;

public class MyBinaryTree implements IBinaryTree {
	private MyTreeNode root;
	private int count;
	
	public MyBinaryTree() {
		root = null;
		count = 0;
	}
	@Override
	public void addElemment(Student student) {
		MyTreeNode newNode = new MyTreeNode(student);
		if(root == null) {
			root = newNode;
			count++;
			return ;
		}
		MyTreeNode temp = root;
		while(true) {
			if(student.getNumber() > temp.getStudent().getNumber()) {
				if(temp.right == null) {
					temp.right = newNode;
					break;
				}
			temp = temp.right;
		}
			else {
				if(temp.left == null) {
					temp.left = newNode;
					break;
				}
				temp = temp.left;
			}
		count++;
		}
	}
	@Override
	public String remove(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectElement(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preOrder(MyTreeNode node) {
		if(node != null) {
			node.getStudent().showInfo();
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	@Override
	public void inOrder(MyTreeNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postOrder(MyTreeNode node) {
		// TODO Auto-generated method stub
		
	}
	public MyTreeNode getRoot() {
		return root;
	}
}
