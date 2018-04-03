public class DeletingNodeCases{
    public static void main(String [] args){
	Tree t = new Tree();
	
	// //Case 1 (a)
	// TNode p = new TNode("013", null, null, null);
	// t.insertNode(p);
	// t.printTree(0);
	// t.deleteNode(p);
	// t.printTree(0);
	
	// 
	// //Case 1 (b)
	TNode q = new TNode("013", null, null, null, 0);
	TNode a = new TNode("012", null, null, null, 1);
	TNode s = new TNode("011", null, null, null, 2);
	TNode w = new TNode("014", null, null, null, 3);
	TNode d = new TNode("015", null, null, null, 4);
	t.insertNode(q);
	t.insertNode(a);
	t.insertNode(s);
	t.insertNode(w);
	t.insertNode(d);
	t.printTree(0);
	System.out.println();
	t.deleteNode(d);
	t.printTree(0);
	
	//Case 2 (a)
	// TNode o = new TNode("129", null, null, null);
	// TNode i = new TNode("121", null, null, null);
	// t.insertNode(o);
	// t.insertNode(i);
	// t.printTree(0);
	// t.deleteNode(o);
	// t.printTree(0);
	
	//Case 2 (b)
	// t.insertNode(new TNode("022", null, null, null));
	// t.insertNode(new TNode("021", null, null, null));
	// t.insertNode(new TNode("020", null, null, null));
	// t.insertNode(new TNode("023", null, null, null));
	// t.printTree(0);
	// System.out.println();
	// t.deleteNode(t.findNode("021"));
	// t.printTree(0);
	
	//Case 3 (a)
	// t.insertNode(new TNode("022", null, null, null));
	// t.insertNode(new TNode("039", null, null, null));
	// t.printTree(0);
	// System.out.println();
	// t.deleteNode(t.findNode("022"));
	// t.printTree(0);
	
	//Case 3 (b)
	// t.insertNode(new TNode("022", null, null, null));
	// t.insertNode(new TNode("021", null, null, null));
	// t.insertNode(new TNode("023", null, null, null));
	// t.insertNode(new TNode("024", null, null, null));
	// t.printTree(0);
	// System.out.println();
	// t.deleteNode(t.findNode("023"));
	// t.printTree(0);

    }
}
