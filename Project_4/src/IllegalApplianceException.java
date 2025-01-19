//Property of Devindra A. Ramcharan CSCI 212 111B
import java.util.regex.Pattern;

/**
 * The IllegalApplianceException class extends IllegalArgumentException and is used to handle exceptions
 * related to invalid appliance serial numbers. It includes a method for validating serial numbers based on a specific format.
 */

public class IllegalApplianceException extends IllegalArgumentException {
	
	 /**
     * Constructs an IllegalApplianceException with a specified error message.
     * This constructor is used to create an exception when an invalid appliance serial number is encountered.
     *
     * @param message The error message to be associated with the exception.
     */
	
    public IllegalApplianceException(String message){
        super(message);
    }
    
    /**
     * Checks if a given appliance serial number is valid based on a predefined format.
     * The serial number must start with 'R', 'D', or 'M', followed by 11 characters that are either numbers or letters.
     *
     * @param SerialInput The serial number to be checked for validity.
     * @return true if the serial number matches the required format, false otherwise.
     */
    
    public static boolean isValid(String SerialInput) {

        String serialNumberFormat = "^[RDM][a-zA-Z0-9]{11}$";
        return Pattern.matches(serialNumberFormat, SerialInput);
    } //Method isValid
}