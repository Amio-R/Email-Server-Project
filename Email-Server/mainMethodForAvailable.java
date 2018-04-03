public class mainMethodForAvailable{
    public static void main(String [] args){
	//Available main method
	/*Available p = new Available(3);
	Available q = new Available(5);
	p.setNext(q);
	Available r = new Available(1);
	q.setNext(r);
	for(Available s = p; s != null; s = s.getNext()){
	    System.out.println(s);
	}*/
	
	//AvailableList main method
	AvailableList p = new AvailableList(); // empty list not null
	p.addRecord(18);
	p.addRecord(3);
	p.addRecord(64); 
	p.addRecord(23);
	
	System.out.println(p);
	System.out.println(p.getNextRecord());
	System.out.println();
	System.out.println(p);
    }
}
