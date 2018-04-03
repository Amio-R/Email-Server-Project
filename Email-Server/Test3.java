import hsa.*;
import java.io.*;
public class Test3{
    public static void main(String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if(code == Globals.PROCESS_OK){
	    Record rec = new Record();
	    code = rec.readFromMessagesFile(0);
	    System.out.println(rec.toString());
	    code = FileIO.closeMessagesFile();
	}
    }
}
