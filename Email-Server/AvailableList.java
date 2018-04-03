public class AvailableList{
    private Available head = null;
    private Available tail = null;
    
    public AvailableList(){
	head = null;
	tail = null;
    }
    
    public Available getHead(){
	return head;
    }
    
    public Available getTail(){
	return tail;
    }
    
    public void setHead(Available p){
	head = p;
    }
    
    public void setTail(Available q){
	tail = q;
    }
    
    // p contains variable address
    public void addRecord(int recordNumber){
	if(head == null){
	    head = new Available(recordNumber);
	    tail = head;
	}
	else{
	    Available p = new Available(recordNumber);
	    tail.setNext(p);
	    tail = p;
	}
    }
    
    //gets rid of the available object and updates it 
    public int getNextRecord(){
	int r = Globals.EMPTY_AVAILABLE_LIST;
	if(head != null){
	    r = head.getRecordNumber();
	    if (head == tail){
		head = null;
		tail = null;
	    }
	    else{ 
		head = head.getNext();
	    }
	}
	return r;
    }
   
    public String toString(){
	String s = "";
	for(Available p = head; p != null; p = p.getNext()){
	    s = s + "node: " + p.getRecordNumber() + "\n";
	}
	return s.equals(Globals.STR_NULL)? "empty": s;
    }
}
