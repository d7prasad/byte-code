
public class LinkedListDemo {

	public static void main(String[] args) {
		
		Nod root = null;
		for(int i = 1; i<=5; i++){
			root = insert(root, i);			
		}
		print(root);
	
	}
	
	public static void print(Nod root){
		
		if(root!=null){
			print(root.next);
			System.out.println(root.data);
			
		}
		
	}
	
	public static Nod insert(Nod root, int data){
		if(root==null){
			root = new Nod(data);
			return root;
		}else{
			Nod node = insert(root.next, data);
			root.next = node;
			node.prev = root;
			return root;
		}
		
	}

}


class Nod{
	
	int data;
	Nod prev, next;
	
	Nod(int data){
		
		this.data = data;
		next = null;
		prev = null;
	}
	
}
