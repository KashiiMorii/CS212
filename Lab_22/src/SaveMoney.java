
import java.io.*;
import java.util.Date;

public class SaveMoney {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for(int i = 0; i<5; i++) {
	    Money m = new Quarter();
	    oos.writeObject(m);
	    oos.flush();
    }
    for(int i = 0; i<5; i++) {
	    Money m = new Penny();
	    oos.writeObject(m);
	    oos.flush();
    }
    for(int i = 0; i<5; i++) {
	    Money m = new Dime();
	    oos.writeObject(m);
	    oos.flush();
    }
    for(int i = 0; i<5; i++) {
	    Money m = new Nickel();
	    oos.writeObject(m);
	    oos.flush();
    }
   
    oos.close();
    fos.close();
  }
}