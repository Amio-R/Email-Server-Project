import java.io.*;
public class Globals{
    
    // 63 bytes but 59 bytes to write and 4 bytes for recordNumber   
    public static RandomAccessFile msg = null;
    
    public static final String MESSAGES_FILE = "_messages.dat";
    
    public static final int NEXT_RECORD_LEN = 4;
    
    public static final int PROCESS_OK = 0;
    
    public static final int PROCESS_ERROR = -1;
    
    public static final int END_OF_MESSAGE = -1;
    
    public static final char BLANK = 32;
    
    public static final int APPEND = 1;
    
    public static final int MODIFY = 2;
    
    public static final int EMPTY_AVAILABLE_LIST = -1;
    
    public static final char DELETED = '*';
    
    public static final char FIRST_RECORD_OF_MESSAGE = '+';
    
    public static final char SEND_MESSAGE = 'S';
    
    public static final String STR_NULL = "";
    
    public static final char NULL = '\0';
    
    public static final int COMMAND_POS = 0;
    
    public static final int COMMAND_LEN = 1;
    
    public static final int CLIENT_ID_LEN = 9;
    
    public static final int CLIENT_POS = COMMAND_POS + COMMAND_LEN;
    
    public static final int SENDER_POS = COMMAND_POS + COMMAND_LEN;
    
    public static final int SENDER_LEN = CLIENT_ID_LEN;
    
    public static final int RECEIVER_POS = SENDER_POS + SENDER_LEN;
    
    public static final int RECEIVER_LEN = CLIENT_ID_LEN;
    
    public static final int DATE_TIME_POS = RECEIVER_POS + RECEIVER_LEN;
    
    public static final int DATE_TIME_LEN = 8;
    
    public static final char END_OF_SUBJECT_MARKER = '~';
    
    public static final int END_OF_SUBJECT_MARKER_LEN = 1;
    
    public static final int TEXT_LEN = END_OF_SUBJECT_MARKER_LEN + 30;
    
    public static final int MARKER_POS = DATE_TIME_POS + DATE_TIME_LEN;
    
    public static final int MARKER_LEN = 1;
    
    public static final int IDENTIFICATION_LEN = SENDER_LEN + RECEIVER_LEN + DATE_TIME_LEN;
    
    public static final int INTEGER_LEN = 4;
    
    public static final int RECORD_DATA_LEN = COMMAND_LEN + SENDER_LEN + RECEIVER_LEN + DATE_TIME_LEN + MARKER_LEN + TEXT_LEN;
    
    public static final int RECORD_LEN = RECORD_DATA_LEN + NEXT_RECORD_LEN;
    
    public static final int AVAILABLE_NODE_RECORD_NUMBER_LEN = 4;
    
    public static final String AVAILABLE_LIST_FILE = "_available.dat";
    
    public static int totalRecordsInMessageFile = 0;
    
    public static AvailableList availableList = null;


}
