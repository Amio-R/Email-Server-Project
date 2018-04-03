import hsa.*;
import java.io.*;
public class Test6{
    public static void main(String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if (code == Globals.PROCESS_OK) {
	    Record rec = new Record();
	    for (int recordNumber = 0; recordNumber < Globals.totalRecordsInMessageFile; recordNumber++) {
		code = rec.readFromMessagesFile(recordNumber);
		System.out.println(rec.toString());
	    }
	    code = FileIO.closeMessagesFile();
	}
	
    }
}
