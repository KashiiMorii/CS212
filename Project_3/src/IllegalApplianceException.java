//Property of Devindra A. Ramcharan CSCI 212 111B
import java.util.regex.Pattern;

public class IllegalApplianceException extends IllegalArgumentException {
    public IllegalApplianceException(String message){
        super(message);
    }
    public static boolean isValid(String SerialInput) {

        String serialNumberFormat = "^[RDM][a-zA-Z0-9]{11}$";
        return Pattern.matches(serialNumberFormat, SerialInput);
    } /*
      Method isValid, which checks if an Appliance's Serial number is valid, i.e the Serial Number has a valid 
      appliance type, the Serial Number is only 11 characters long excluding the type, 
      and if the 11 characters are digits and/or letters.
      */
}