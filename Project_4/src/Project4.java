//Property of Devindra A. Ramcharan CSCI 212 111B
import java.io.File;
/**
 * The Project4 class is the main class for the application.
 * It initializes the GUI to display the appliance data
 */

public class Project4{
	static ApplianceGUI GUI;
	
	/**
     * The main method of the application.
     * It initializes the GUI window with a title and predefined size.
     *
     * @param args Command-line arguments.
     */
	
	public static void main(String[] args) {
		GUI = new ApplianceGUI("Appliances",400,400); 
	}
}