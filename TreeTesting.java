public class TreeTesting{
public static void main(String [] args){
	Tree t = new Tree();
	//Practice
	// t.insertNode(new TNode("034", null, null, null));
	// t.insertNode(new TNode("023", null, null, null));
	// t.insertNode(new TNode("164", null, null, null));
	// t.insertNode(new TNode("115", null, null, null));
	// t.insertNode(new TNode("137", null, null, null));
	// t.insertNode(new TNode("004", null, null, null));
	// t.insertNode(new TNode("151", null, null, null));
	// t.insertNode(new TNode("128", null, null, null));
	// t.insertNode(new TNode("172", null, null, null));
	// t.insertNode(new TNode("170", null, null, null));
	// t.insertNode(new TNode("120", null, null, null));
	
	//Execise 4
	// t.insertNode(new TNode("046", null, null, null));
	// t.insertNode(new TNode("031", null, null, null));
	// t.insertNode(new TNode("022", null, null, null));
	// t.insertNode(new TNode("038", null, null, null));
	// t.insertNode(new TNode("034", null, null, null));
	// t.insertNode(new TNode("041", null, null, null));
	// t.insertNode(new TNode("039", null, null, null));
	// t.insertNode(new TNode("043", null, null, null));
	// t.insertNode(new TNode("076", null, null, null));
	// t.insertNode(new TNode("057", null, null, null));
	// t.insertNode(new TNode("086", null, null, null));
	
	// Exercise 5
	// t.insertNode(new TNode("039", null, null, null));
	// t.insertNode(new TNode("033", null, null, null));
	// t.insertNode(new TNode("028", null, null, null));
	// t.insertNode(new TNode("027", null, null, null));
	// t.insertNode(new TNode("030", null, null, null));
	// t.insertNode(new TNode("034", null, null, null));
	// t.insertNode(new TNode("031", null, null, null));
	// t.insertNode(new TNode("035", null, null, null));
	// t.insertNode(new TNode("045", null, null, null));
	// t.insertNode(new TNode("041", null, null, null));
	// t.insertNode(new TNode("040", null, null, null));
	// t.insertNode(new TNode("042", null, null, null));
	// t.insertNode(new TNode("052", null, null, null));
	// t.insertNode(new TNode("051", null, null, null));
	// t.insertNode(new TNode("064", null, null, null));
	// t.printTree(0);
	
	//Exercise 6
	t.insertNode(new TNode("001",2, null, null, null));
	t.insertNode(new TNode("002",3, null, null, null));
	t.insertNode(new TNode("003",4, null, null, null));
	t.insertNode(new TNode("004",5, null, null, null));
	t.insertNode(new TNode("005",6, null, null, null));
	t.insertNode(new TNode("006",7, null, null, null));
	t.insertNode(new TNode("007",8, null, null, null));
	t.insertNode(new TNode("008",9, null, null, null));
	t.deleteNode(t.findNode("001"));
	t.printTree(0);
    }
}
