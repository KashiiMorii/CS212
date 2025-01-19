//Property of Devindra A. Ramcharan CSCI 212 111B
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 * The FileMenuHandler class handles the actions related to the File menu in the ApplianceGUI.
 * It supports opening a file in order to load appliance data, searching for appliances based on its type,
 * and price, and quitting the application.
 */


public class FileMenuHandler implements ActionListener {
    JFrame jframe;
    protected File f;
    static TextFileInput infile;
    static String inFileName;

    static TreeMap<String, Appliance> R_Serial = new TreeMap<>(new SerialNumberComparator()); //Creates a tree map of Refrigerator Serial Numbers and compares them
    static TreeMap<String, Appliance> D_Serial = new TreeMap<>(new SerialNumberComparator()); //Creates a tree map of Dishwasher Serial Numbers and compares them
    static TreeMap<String, Appliance> M_Serial = new TreeMap<>(new SerialNumberComparator()); //Creates a tree map of Microwave Serial Numbers and compares them

    /**
     * Constructs a new FileMenuHandler.
     * 
     * @param jf The JFrame for the GUI that this handler will interact with.
     */
    
    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    } 

    /**
     * Handles the action performed for each menu item in the File menu.
     * 
     * @param event The action event triggered by a menu item selection.
     */
    
    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) {
            JFileChooser fd = new JFileChooser();
            fd.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fd.showOpenDialog(null);
            f = fd.getSelectedFile();
            inFileName = f.getAbsolutePath();
            inputFromFile(inFileName);
        } //Opens the JFileChooser when Open is selected, allowing you to select a file. 
        
        else if (menuName.equals("Search")) {
            searchAppliance();
        } //Allows the user to search through the file to find the proper appliance with a price equal to or less than the price provided
        
        else if (menuName.equals("Quit"))
            System.exit(0); //Exits the GUI if Quit is pressed
        
    } //Method actionPerformed

    /**
     * Reads appliance data from a specified file and adds data to the corresponding TreeMaps.
     * The file should contain appliance information, such as the serial number, price, and its unique value
     * 
     * @param filename The path of the file to read from.
     */
    
    protected static void inputFromFile(String filename) {
        infile = new TextFileInput(filename); //Reads from file
        String line = infile.readLine();

        while (line != null) {
            java.util.StringTokenizer segments = new java.util.StringTokenizer(line, ",");
            String serialNum = segments.nextToken();
            float price = Float.parseFloat(segments.nextToken());
            String uniqueValue = segments.nextToken();
            Appliance appliance = null;  //Creates a null appliance variable so that it can be assigned later

            if (!IllegalApplianceException.isValid(serialNum)) {
                System.out.println("Illegal Appliance: " + serialNum);
            }  //Checks if the appliance is Valid
            
            else if (serialNum.charAt(0) == 'R') {
                int cubicFeet = Integer.parseInt(uniqueValue);
                appliance = new Refrigerator();
                appliance.setAppliance(serialNum);
                appliance.setPrice(price);
                ((Refrigerator) appliance).setcubicFeet(cubicFeet);
                R_Serial.put(serialNum, appliance);
            } //Adds Refrigerator data 
            
            else if (serialNum.charAt(0) == 'D') {
                boolean isUnderCounter = uniqueValue.equals("Y");
                appliance = new Dishwasher();
                appliance.setAppliance(serialNum);
                appliance.setPrice(price);
                ((Dishwasher) appliance).setIsUnderCounter(isUnderCounter);
                D_Serial.put(serialNum, appliance);
            } //Adds Dishwasher data
            
            else if (serialNum.charAt(0) == 'M') {
                int watts = Integer.parseInt(uniqueValue);
                appliance = new Microwave();
                appliance.setAppliance(serialNum);
                appliance.setPrice(price);
                ((Microwave) appliance).setWatts(watts);
                M_Serial.put(serialNum, appliance);
            } //Adds Microwave data
            
            line = infile.readLine();
        } //End of while loop

        displayAppliances();
    } //Method inputFromFile

    /**
     * Displays the appliance data in the GUI.
     * The data for refrigerators, dishwashers, and microwaves are displayed in separate areas.
     */
    
    private static void displayAppliances() {
        ApplianceGUI.R.setText(""); // Clear existing text for Refrigerator Serial Numbers
        ApplianceGUI.D.setText(""); // Clear existing text for Dishwasher Serial Numbers
        ApplianceGUI.M.setText(""); // Clear existing text for Microwave Serial Numbers

        
        List<Appliance> RList = new ArrayList<>(R_Serial.values());
        for (int i = 0; i < RList.size(); i++) {
            ApplianceGUI.R.append(RList.get(i).toString() + "\n");
        } //Prints the Refrigerator data in the GUI

        
        List<Appliance> DList = new ArrayList<>(D_Serial.values());
        for (int i = 0; i < DList.size(); i++) {
            ApplianceGUI.D.append(DList.get(i).toString() + "\n");
        } //Prints the Dishwasher data in the GUI

        
        List<Appliance> MList = new ArrayList<>(M_Serial.values());
        for (int i = 0; i < MList.size(); i++) {
            ApplianceGUI.M.append(MList.get(i).toString() + "\n");
        } //Prints the Microwave data in the GUI
        
    }//Method displayAppliances

    /**
     * Allows the user to search for appliances by type and price.
     * The user inputs an appliance type and a price, and the program displays appliances
     * of the specified type with a price less than or equal to the given price.
     */
    
    private void searchAppliance() {
        String input = JOptionPane.showInputDialog(null, "Enter search criteria (format: Appliance Type, Price):", "Search Appliance", JOptionPane.QUESTION_MESSAGE);

        if (input != null && !input.isBlank()) {
            String[] parts = input.split(",");
            if (parts.length == 2) {
                char type = parts[0].charAt(0);
                float price = Float.parseFloat(parts[1]);
                TreeMap<String, Appliance> targetMap = null;

                if (type == 'R') targetMap = R_Serial; //Uses the Refrigerator Tree Map if R is the specified Appliance Type
                
                
                else if (type == 'D') targetMap = D_Serial; //Uses the Dishwasher Tree Map if D is the specified Appliance Type
                
                
                else if (type == 'M') targetMap = M_Serial; //Uses the Microwave Tree Map if M is the specified Appliance Type
                

                if (targetMap != null) {
                    System.out.println("Appliances with price <= " + price + ":");
                    for (Appliance appliance : targetMap.values()) {
                        if (appliance.getPrice() <= price) {
                            System.out.println(appliance);
                        }
                    } 
                } //Prints the Specified Appliances with the price that is equal to or less than the price given into the console
                else System.out.println("Invalid Appliance");
                
            }
            else System.out.println("Invalid input format. Please only insert Appliance type and price.");
        }
    } //Method searchAppliance
}
