import hsa.*;
import java.io.*;
public class Test7{
    public static void main(String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if (code == Globals.PROCESS_OK) {
	    Record rec = new Record();
	    int recordNumber = -1;
	    do{
	       recordNumber =(int) (Math.random() * 3); 
	       code = rec.readFromMessagesFile(recordNumber);
	       System.out.println(rec);
	    } while(true);
	}
	code = FileIO.closeMessagesFile();        
    }
}
