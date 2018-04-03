import java.io.*;
public class Test{
    public static void main (String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if(code == Globals.PROCESS_OK){
	    String message = "Hello how are you?";
	    Record rec = new Record();
	    rec.setData(message, Globals.END_OF_MESSAGE);
	    rec.tempDump();
	    code = FileIO.closeMessagesFile();
	}
    }
}
