import java.net.Socket;

public class Client {
    //Network programming entails writing programs that execute across multiple devices
    //Socket Programming
    //They enable connection between a client and a server over a Transmission Control Protocol

    Socket socket = new Socket("localhost", 1234);
    //takes in two parameters
    // 1. The server name being connected to
    // 2. the port of the server connecting to.
}
