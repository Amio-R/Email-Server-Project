public class TNode{
    private String id    = "";
    private TNode left   = null;
    private TNode right  = null;
    private TNode parent = null;
    private int recordNumber = -1;
    
    public TNode(){
	id = "";
	left = null;
	right = null;
	parent = null;
	recordNumber = -1;
    }
    
    public TNode(String i, int rn, TNode l, TNode r, TNode p){
	id = i;
	left = l;
	right = r;
	parent = p;
	recordNumber = rn;
    }
    
    public String getId(){
	return id;
    }
    
    public int getRecordNumber(){
	return recordNumber;
    }
    
    public TNode getLeft(){
	return left;
    }
    
    public TNode getRight(){
	return right;
    }
    
    public TNode getParent(){
	return parent;
    }
    
    public void setId(String i){
	id = i;
    }
    
    public void setRecordNumber(int r){
	recordNumber = r;
    }
    
    public void setLeft(TNode l){
	left = l;
    }
    
    public void setRight(TNode r){
	right = r;
    }
    
    public void setParent(TNode p){
	parent = p;
    }
    
    public String toString(){
	if(this == null){
	    return null;
	}
	else{
	    return "Id: " + id;
	}
    }
}
