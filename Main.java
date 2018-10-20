public class Main{
    public static void main(String[] args){
	Node root = new Node(1);
	root.insert(2);
	root.insert(5);
	root.insert(3);
	root.insert(7);
	root.insert(8);
	root.insert(6);
	root.insert(4);

	System.out.println("~~~~ Inorder: ~~~~");
	root.inOrder();

	System.out.println("~~~~ Preorder: ~~~~");
	root.preOrder();

	System.out.println("~~~~ Postorder: ~~~~");
	root.postOrder();
    }
}
