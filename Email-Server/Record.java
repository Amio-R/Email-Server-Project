import java.io.*;
import hsa.*;
public class Record {
    private byte [] data = new byte [Globals.RECORD_DATA_LEN];
    private int next = Globals.END_OF_MESSAGE;
    
    public Record(){
	for(int i = 0; i < Globals.RECORD_DATA_LEN; i++){
	    data[i] = (byte) Globals.BLANK;
	}
	next = Globals.END_OF_MESSAGE;
    }       
    
    public Record(String s, int nextRECORD){
	setData(s, nextRECORD);    
    }
    
    public String getData(){
	String dData = "";
	for(int i = 0; i < Globals.RECORD_DATA_LEN; i++){
	    dData = dData + (char) data[i];
	}
	return dData;
    }
    
    public void setData(String txt, int nextRecord){
	for(int i = 0; i < txt.length(); i ++){
	    data[i] = (byte) (txt.charAt(i));
	}
	for(int i = txt.length(); i < Globals.RECORD_DATA_LEN; i++){
	    data[i] = (byte) Globals.BLANK;
	}
	
	next = nextRecord;
    }
    
    public int getNext(){
	return next;
    }
    
    public int readFromMessagesFile(int recordNumber){
	try{
	    Globals.msg.seek(recordNumber*Globals.RECORD_LEN);
	    int bytes = Globals.msg.read(data);
	    next = Globals.msg.readInt();
	    return Globals.PROCESS_OK;
	}
	catch(IOException e){
	    return Globals.PROCESS_ERROR;
	}
    }
	
    public int writeToMessagesFile(int recordNumber, int mode){
	try{
	    Globals.msg.seek(recordNumber*Globals.RECORD_LEN);
	    Globals.msg.write(data);
	    Globals.msg.writeInt(next);
	    if(mode == Globals.APPEND){
		Globals.totalRecordsInMessageFile += 1;
	    }
	    return Globals.PROCESS_OK;
	}
	catch(IOException e){
	    return Globals.PROCESS_ERROR;       
	}
    }
   
    public String toString(){
	return getData() + next;
    }

    public void tempDump(){
	for(int i = 0; i < data.length; i++){
	    if(data[i] == (byte) Globals.BLANK){
		System.out.println(i + " " + "%");
	    }
	    else{
		System.out.println(i + " " + (char) data[i]);
	    }
	} 
    }
    
    public void deleteFromMessagesFile(int recordNumber){
	int error = readFromMessagesFile(recordNumber);
	if(error == Globals.PROCESS_ERROR){
	    data[0] = (byte) Globals.DELETED;
	    error = writeToMessagesFile(recordNumber, Globals.MODIFY);
	    if(error == Globals.PROCESS_OK){
		Globals.availableList.addRecord(recordNumber);
	    }
	    else{
		System.out.println("Error writing record in deletefromMessages()");
	    }
	}
	else {
	    System.out.println("Error reading record in deleteFromMessages()");
	}
    }
   
}
