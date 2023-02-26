import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            Client client = new Client();
            Server server = new Server();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}