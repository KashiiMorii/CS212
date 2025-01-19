//Property of Devindra A. Ramcharan CSCI 212 111B
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File.*;
public class FileMenuHandler implements ActionListener {
	
   JFrame jframe;
   protected File f;
   static TextFileInput infile;
   static String inFileName;
   public FileMenuHandler (JFrame jf) {
      jframe = jf;  
   }
   
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
    	  JFileChooser fd = new JFileChooser();
    	  fd.setFileSelectionMode(JFileChooser.FILES_ONLY); 
          fd.showOpenDialog(null);
          f = fd.getSelectedFile();
          System.out.print(""+f.getAbsolutePath()+"\n");
          inFileName = f.getAbsolutePath();
          inputFromFile(inFileName);
          
      } //Opens the JFileChooser when Open is selected, allowing you to select a file. Also prints the where the file is located into the console.
   
      else if (menuName.equals("Quit"))
          System.exit(0); //Exits the GUI if Quit is pressed
      
   } //Method actionPerformed, which sets the actions for each option on under the File Menu
   
   protected static void inputFromFile(String filename){
	   
		SortedApplianceList R_Serial = new SortedApplianceList(); //Creates a list of only Refrigerator Serial Numbers
		SortedApplianceList D_Serial = new SortedApplianceList(); //Creates a list of only Dishwasher Serial Numbers
		SortedApplianceList M_Serial = new SortedApplianceList(); //Creates a list of only Microwave Serial Numbers
		infile = new TextFileInput(filename); //Reads from file
		String line = infile.readLine(); 

		while (line != null) {
			java.util.StringTokenizer Segments = new java.util.StringTokenizer(line,","); //Separates data of each segment
			String SerialNum = Segments.nextToken(); 
			float price = Float.parseFloat(Segments.nextToken());
			String Unique_Value = Segments.nextToken();
			Appliance appliance = null; //Creates a null appliance variable so that it can be assigned later
			if(IllegalApplianceException.isValid(SerialNum)==false) { //Checks if the appliance is Valid
				System.out.println("Illegal Appliance: "+SerialNum);
			}
			
			if(SerialNum.charAt(0) == 'R') {
				if(IllegalApplianceException.isValid(SerialNum)==true) {
					int cubicFeet = Integer.parseInt(Unique_Value);
					appliance = new Refrigerator();
					appliance.setAppliance(SerialNum);
					appliance.setPrice(price);
					((Refrigerator)appliance).setcubicFeet(cubicFeet);
					R_Serial.add(appliance);
				}
			} //Adds Refrigerator data that is valid to the node
			
			else if(SerialNum.charAt(0) == 'D') {
				if(IllegalApplianceException.isValid(SerialNum)==true) {
					boolean IsUnderCounter = Unique_Value.equals("Y");
					appliance = new Dishwasher();
					appliance.setAppliance(SerialNum);
					appliance.setPrice(price);
					((Dishwasher)appliance).setIsUnderCounter(IsUnderCounter);
					D_Serial.add(appliance);
				}
			} //Adds Dishwasher data that is valid to the node
			
			else if(SerialNum.charAt(0) == 'M') {
				if(IllegalApplianceException.isValid(SerialNum)==true) {
					int watts = Integer.parseInt(Unique_Value);
					appliance = new Microwave();
					appliance.setAppliance(SerialNum);
					appliance.setPrice(price);
					((Microwave)appliance).setWatts(watts);;
					M_Serial.add(appliance);
				}
			} //Adds Microwave data that is valid to the node
			line= infile.readLine();
			
	}//End of while loop
		
		for(int i=0; i<R_Serial.length; i++) {
			ApplianceGUI.R.append(R_Serial.get(i).toString()+"\n");
		} //Prints the Refrigerator data in the GUI
		
		for(int i=0; i<D_Serial.length; i++) {
			ApplianceGUI.D.append(D_Serial.get(i).toString()+"\n");
		} //Prints the Dishwasher data in the GUI
		
		for(int i=0; i<M_Serial.length; i++) {
			ApplianceGUI.M.append(M_Serial.get(i).toString()+"\n");
		} //Prints the Microwave data in the GUI
		
	}//Method inputFromFile
   
}