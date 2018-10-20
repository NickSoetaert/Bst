public class Node {
    Node left, right;
    int value;

    public Node(int v) {
	this.value = v;
    }

    public void insert (int v) {
	if(v < this.value){
	    if(left == null) left = new Node(v);
	    else left.insert(v);
	}
	else{
	    if(right == null) right = new Node(v);
	    else right.insert(v);
	}
    }

    public void inOrder(){
	if(left != null) left.inOrder();
	System.out.println(value);
	if(right != null) right.inOrder();
    }

    public void preOrder(){	
	System.out.println(value);
	if(left != null) left.preOrder();
	if(right != null) right.preOrder();
    }

    public void postOrder(){
	if(left != null) left.postOrder();
	if(right != null) right.postOrder();
	System.out.println(value);
    }

}
