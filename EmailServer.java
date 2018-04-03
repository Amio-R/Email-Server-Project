import hsa.*;
public class EmailServer{
    public static void main(String [] args){
	Tree senderIndex = new Tree();    
	Message message = new Message();
	String identification = Globals.STR_NULL;
	int recordNumber = -1;
	TNode p = null;
	
	int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if (error == Globals.PROCESS_OK){
	    error = FileIO.retrieveAvailableList(Globals.AVAILABLE_LIST_FILE);
	    
	    if(error == Globals.PROCESS_OK){
		error = FileIO.saveAvailableList(Globals.AVAILABLE_LIST_FILE);
		int command = -1;
		do {
		    System.out.println("Available List: ");
		    System.out.println(Globals.availableList);
		    System.out.println("Server options: ");
		    System.out.println("1.  Add message");
		    System.out.println("2.  Delete message");
		    System.out.println("3.  Print all messages");
		    System.out.println("4.  Find Message (sender Id + receiver Id + dateTime");
		    System.out.println("5.  Find message (receiver Id + sender Id + dateTime");
		    System.out.println("6.  Find messages from partial identifications");
		    System.out.println("7.  Rebuild available list");
		    System.out.println("8.  Rebuild trees");
		    System.out.println("9.  Breadth-first print of trees");
		    System.out.println("99. Quit ");
		    System.out.println();
		    System.out.println("Option -> ");
		    command = Stdin.readInt();
		    
		    switch(command) {
			case 1 : 
			    System.out.print("Sender id: ");
			    String senderId = Stdin.readString();
			    
			    System.out.print("Receiver id: ");
			    String receiverId = Stdin.readString();
			    
			    System.out.print("Date(8 characters): ");
			    String dateTime = Stdin.readString();
			    
			    System.out.println("Subject: ");
			    String subject = Stdin.readLine();
			    
			    System.out.println("Message: ");
			    String text = Stdin.readLine();
			    
			    String entireMessage =  Globals.SEND_MESSAGE + senderId + receiverId +
						    dateTime + Globals.FIRST_RECORD_OF_MESSAGE +
						    subject + Globals.END_OF_SUBJECT_MARKER +
						    text;
						    
			    message.setMessage(entireMessage);
			    recordNumber = message.writeToMessagesFile();
			    identification = senderId + receiverId + dateTime;
			    
			    p = new TNode(identification, recordNumber, null, null, null);
			    senderIndex.insertNode(p);

			    break;
			    
		    case 4 : 
			System.out.println("Sender message identification (senderId + receiverId + dateTime): ");
			identification = Stdin.readString();
			
			p = senderIndex.findNode(identification);
			
			if (p != null){
			    recordNumber = p.getRecordNumber();
			    System.out.println("At record number: " + recordNumber);
			    message.printFromMessagesFile(recordNumber);
			}
			else{
			    System.out.println("***Identification not found***");
			}
		    }
		}while(command != 99);
	    }
	    else{
		System.out.println("Error: Unable to open available list file");
	    }
	    FileIO.closeMessagesFile();
	}
    }
}
