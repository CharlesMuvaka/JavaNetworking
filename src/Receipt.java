import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Receipt {
    public static void main(String[] args) {
        File receipt = new File("receipt.txt");
        String chefName = new String("Charles Muvaka");
        String customerName = new String("Charles Muvaka");
        try{
            receipt.createNewFile();
            FileWriter receiptWriter =  new FileWriter("receipt.txt");
            receiptWriter.write("Served By: " + chefName);
            LocalDate date = LocalDate.now();
            String cr = "\r";
            receiptWriter.write( cr + "Served on: " + date);
            receiptWriter.write( cr + "Customer Name: " + customerName);

            System.out.println("Your receipt has been written");
            receiptWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
