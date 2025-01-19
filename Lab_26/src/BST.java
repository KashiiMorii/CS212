public class BST{
	public Node insert(int val, Node n) {
		if(n==null) return new Node(val);
		if(val<n.key) {
			n.left = insert(val, n.left);
		} else if(val>n.key) {
			n.right = insert(val, n.right);
		}
		return n;
	}
	
	public boolean contains(int val, Node n) {
		if(n==null) return false;
		if(val==n.key) return false;
		if(val<n.key) return contains(val, n.left);
		return contains (val, n.right);
		
	}
	
	public int getMinimum(Node n) {
		if(n==null) throw new IllegalArgumentException("Tree is empty");
		if(n.left==null) return n.key;
		return getMinimum(n.left);
	}
	public void preoderTraversal(Node n) {
		if(n==null) return;
		System.out.println(n.key);
		preoderTraversal(n.left);
		preoderTraversal(n.right);
	}
	
	public static void main(String[] args) {
		BST tree = new BST();
		Node root = null;
		root = tree.insert(5,root);
		root = tree.insert(3,root);
		root = tree.insert(7,root);
		root = tree.insert(22,root);
		root = tree.insert(13,root);
		root = tree.insert(2,root);
		root = tree.insert(1,root);
		
		System.out.println(tree.contains(7,root));
		System.out.println(tree.contains(4, root));
		System.out.println(tree.getMinimum(root));
		tree.preoderTraversal(root);
		
	}
}