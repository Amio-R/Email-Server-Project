public class TestingTree {
    public static void main(String [] args){
	Tree tree = new Tree();
	TNode p = new TNode("AB", 16, null, null, null);
	tree.insertNode(p);
	
	p = new TNode("CD", 7, null, null, null);
	tree.insertNode(p);
	
	p = new TNode("EF", 4, null, null, null);
	tree.insertNode(p);
	
	tree.breadthFirstPrint();
    }
}
