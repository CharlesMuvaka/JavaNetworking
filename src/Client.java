import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public Client() throws IOException {
        writeData();
    }

    // inputStream instance will be used to read data from the socket
    public void writeData(){
        try{
            //Network programming entails writing programs that execute across multiple devices
            //Socket Programming
            //They enable connection between a client and a server over a Transmission Control Protocol

            Socket socket = new Socket("localhost", 1234);
            //takes in two parameters
            // 1. The server name being connected to
            // 2. the port of the server connecting to.

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            String text = inputStream.readUTF();
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
