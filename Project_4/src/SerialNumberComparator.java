//Property of Devindra A. Ramcharan CSCI 212 111B
import java.util.Comparator;

/**
 * The SerialNumberComparator class implements the Comparator interface to compare two strings, 
 * which are the serial numbers.
 * It is used for sorting appliance serial numbers.
 */
public class SerialNumberComparator implements Comparator<String> {
	
	 /**
     * Compares two serial numbers
     * 
     * @param s1 The first serial number to compare.
     * @param s2 The second serial number to compare.
     * @return A value that determines if the first serial number is less than, equal to, or greater than the second serial number.
     */
	
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    } //Method compare
}
