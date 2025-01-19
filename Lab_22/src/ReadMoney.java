
import java.io.*;
import java.util.Date;

public class ReadMoney {

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Money m = (Money) ois.readObject();
    System.out.println("The money is: "+m);
    ois.close();
    fis.close();
  }
}