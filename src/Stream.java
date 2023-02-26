public class Stream {
    /* A stream is a sequence of data
    *  There are two types
        1. InputStream - Used to read data from a source.
        2. Output Stream - used to write data to a destination
        * A. Byte Streams
            Used to perform input and output operations for 8 bit bytes.
            * FileInputStream and FileOutputStream
            * DataInputStream and DataOutputStream
          B. Character Streams
            Used to perform operations on 16 Bit bytes
            * FileReader - Reads 16 bits
            * FileWriter - Writes 16 bits
          C. Standard Streams
            Java provides standard I/O support where a program can take data from the user using the keyboard
            * System.in - enables a program to receive input from a user using the keyboard
            * System.out - displays information from a program to the user.
        */

    /* Java Files
        The File class is used to instantiate a file Instance
        e.g File receipt = new File("you can provide the absolute path of the files storage")
        The class provides a bunch of methods that can be used
            createNewFile() - Returns true when a new file is created and returns false if the file exists
            exists() - Checks whether the file exists in a collection
            length() - returns the length of a file in bytes
        To write into a file a FileWriter is used while a FileReader is used to read a file.
        Example FileWriter receiptWriter = new FileWriter("receipt.txt")
        receiptWriter.write(Served)
    * */


}
