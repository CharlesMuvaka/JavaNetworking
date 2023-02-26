import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    //Steps to connecting to a server
    // 1. The server creates a server Socket specifying the port on which communication will take place in
    // 2. The server invokes accept() method that waits until a connection is made

    int port = 1234;


    public Server() throws IOException {
        writeData();
    }

    public void writeData(){
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            //This class is overloaded and takes in more parameters
            //ServerSocket newSocket = new ServerSocket(int port, int backlog); - A port and the number of devices to be in the queue during connection
            //  ServerSocket serverSocket2 = new ServerSocket(int port, int backlog, InetAddress address ); - The address to connect to in case the server has many ports


            Socket socket = serverSocket.accept(); // waiting for a device to connect

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());// used to read data from the socket
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());// used to write data to the socket

            outputStream.writeChars("Enter your name");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
