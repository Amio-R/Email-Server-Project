import hsa.*;
import java.io.*;
public class Test4{
    public static void main(String [] args){
	int code = FileIO.openMessagesFile("_messages.txt");
	if(code == Globals.PROCESS_OK){
	    Record rec = new Record("Today is very cold", 0);
	    rec.writeToMessagesFile(0, Globals.APPEND);
	    Record tec = new Record("I think I will go to lunch", 1);
	    tec.writeToMessagesFile(1, Globals.APPEND);
	    Record wec = new Record("Hello Suzie: I think my mark in ICS is getting better", 2);
	    wec.writeToMessagesFile(2, Globals.APPEND);
	    code = FileIO.closeMessagesFile();
	}
    }
}
