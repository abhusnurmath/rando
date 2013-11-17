package binarytree;

public class BinaryTree {
	
	Node root;
    
	public BinaryTree(){
		root = null;
	}
	
	public static void main(String[] args){
		BinaryTree bt = new BinaryTree();
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(10);
		bt.addNode(15);
		bt.addNode(4);
		bt.traverse(bt.getRoot());
	}
	
	public void traverse(Node n){
		System.out.println(n.getData());
		if (n.getLeft() != null){
			traverse(n.getLeft());
		}
		if (n.getRight() != null){
			traverse(n.getRight());
		}
	}
	
	public void addNode(int data){
		if (root == null){
			root = new Node(data);
			return;
		}
		//create node for data
		Node newNode = new Node(data);
		this.addToSpecificNode(root, newNode);
	}
	
	public void addToSpecificNode(Node parentNode, Node newNode){
		if ((newNode.getData() < parentNode.getData()) && (parentNode.getLeft() == null)){
			parentNode.setLeft(newNode);
			return;
		}
		if ((newNode.getData() > parentNode.getData()) && (parentNode.getRight() == null)){
			parentNode.setRight(newNode);
			return;
		}
		else{
			if (newNode.getData() < parentNode.getData()){
				addToSpecificNode(parentNode.getLeft(), new Node(7));
			}
			else{
				addToSpecificNode(parentNode.getRight(), newNode);
			}
		}
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
