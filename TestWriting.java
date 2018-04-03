public class TestWriting{
    public static void main(String [] args){
	FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	String s = "";
	
	Message message = new Message();
	int error = FileIO.retrieveAvailableList(Globals.AVAILABLE_LIST_FILE);

	// s = "C123456789abcdefgi11111111+Hello Delila~Would";
	// message.setMessage(s);
	// message.writeToMessagesFile();
	
	//Case 2
	// s = "C000000000abcdefgi88888888+MOvie Night~I am going to the movie tonight with nobody since I am a loner";
	
	//Case 3
	//s = "C000000000abcdefgi88888888+MOvie Night~I am going to the movie tonight with nobody since I am a loner";
	
	//Case 5
	//s = "CAAABBBCCC00AAA88822222222+Testing~Hello hello";
	
	s = "C123456789ABCDEFGHI88888888+Subject~YOYOYOYOYOYOYOYOYOYOYEYEYEYEYEYEYEYEYEYEYEYEYEYEYYEYEOYOYOYOYOYOYEYEYEYEYYEYEYE";
	message.setMessage(s);
	message.writeToMessagesFile();
	System.out.println(Globals.availableList);
	FileIO.saveAvailableList(Globals.AVAILABLE_LIST_FILE);
	
	FileIO.closeMessagesFile();
    }
}
