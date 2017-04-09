
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root  = null;
		root = insert(root, 8);
		root = insert(root, 5);
		root = insert(root, 6);
		root = insert(root, 7);
		root = insert(root, 10);
		root = insert(root, 2);
		printTree(root);
		//System.out.println(getHeight(root));
		
	}
	
	
	public static int getHeight(Node root){
		
		int left,right=0;
		
		if(root==null){
			
			return -1;
		}else{
			System.out.println(root.data);
			left = getHeight(root.left) + 1;
			right = getHeight(root.right) +1;
		}
		System.out.println(left+" "+right);
		return left>right?left:right;
	}
	
	
	
	public static void printTree(Node root){
		
		if(root!=null){
			
			System.out.println(root.data);
			printTree(root.left);
			printTree(root.right);
		}
		
	}
	
	
	public static Node insert(Node root, int data){ 
		if(root == null){
			return new Node(data);
		}else{
			Node cur;
			if(root.data < data){
				cur = insert(root.right, data);
				root.right = cur;
			}else{
				//System.out.println("Before>> "+root.data);
				cur = insert(root.left, data);
				//System.out.println("After>> "+cur.data);
				root.left = cur;
			}
			return root;
		}
		
	}
	
}

class Node{
	
	int data;
	Node left, right;
	
	Node(int data){
		
		this.data = data;
		left=right=null;
	}

}
