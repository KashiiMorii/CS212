//Property of Devindra A. Ramcharan CSCI 212 111B
import java.util.*;
public class Project2{
	static TextFileInput infile;
	static String inFileName = "p2input.txt";
	
	public static void main(String[] args) {
		ApplianceGUI.GUI();
		inputFromFile(inFileName);
	}
	
	protected static void inputFromFile(String filename){
		SortedApplianceList R_Serial = new SortedApplianceList(); //Creates a list of only Refrigerator Serial Numbers
		SortedApplianceList D_Serial = new SortedApplianceList(); //Creates a list of only Dishwasher Serial Numbers
		SortedApplianceList M_Serial = new SortedApplianceList(); //Creates a list of only Microwave Serial Numbers
		infile = new TextFileInput(filename); //Reads from file
		String line = infile.readLine(); 

		while (line != null) {
			StringTokenizer Segments = new StringTokenizer(line,","); //Separates data of each segment
			String SerialNum = Segments.nextToken(); 
			float price = Float.parseFloat(Segments.nextToken());
			String Unique_Value = Segments.nextToken();
			
			Appliance appliance = null; //Creates a null appliance variable so that it can be assigned later
			
			if(SerialNum.charAt(0) == 'R') {
				int cubicFeet = Integer.parseInt(Unique_Value);
				appliance = new Refrigerator();
				appliance.setAppliance(SerialNum);
				appliance.setPrice(price);
				((Refrigerator)appliance).setcubicFeet(cubicFeet);;
				R_Serial.add(appliance);
			} //Adds Refrigerator data to the node
			
			else if(SerialNum.charAt(0) == 'D') {
				boolean IsUnderCounter = Unique_Value.equals("Y");
				appliance = new Dishwasher();
				appliance.setAppliance(SerialNum);
				appliance.setPrice(price);
				((Dishwasher)appliance).setIsUnderCounter(IsUnderCounter);
				D_Serial.add(appliance);
			} //Adds Dishwasher data to the node
			
			else if(SerialNum.charAt(0) == 'M') {
				int watts = Integer.parseInt(Unique_Value);
				appliance = new Microwave();
				appliance.setAppliance(SerialNum);
				appliance.setPrice(price);
				((Microwave)appliance).setWatts(watts);;
				M_Serial.add(appliance);
			} //Adds Microwave data to the node
			
			line= infile.readLine();
		} //End of while loop
		
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
