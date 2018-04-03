public class ReadingTest {
    public static void main (String [] args){
	int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	//System.out.println(Globals.RECORD_LEN);
	if(error == Globals.PROCESS_OK){
	    Message message = new Message();
	    message.printFromMessagesFile(0);
	    System.out.println();
	    message.printFromMessagesFile(1);
	    System.out.println();
	    message.printFromMessagesFile(2); // two records
	    System.out.println();
	    message.printFromMessagesFile(4); // many records
	    System.out.println();
	    FileIO.closeMessagesFile();
	}
	else{
	    System.out.println("Cannot open _messsages.txt file");
	}
    }
}
