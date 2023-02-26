import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.text");
            out = new FileOutputStream("output.text");

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}
