import hsa.*;
import java.io.*;
public class Test2{
    public static void main(String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if(code == Globals.PROCESS_OK){
	    String message = "Hello how are you";
	    Record rec = new Record(message, Globals.END_OF_MESSAGE);
	    code = rec.writeToMessagesFile(0, Globals.APPEND);
	    code = FileIO.closeMessagesFile();
	}
    }
}
