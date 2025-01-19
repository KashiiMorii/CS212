//Property of Devindra A. Ramcharan CSCI 212 111B
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Project1 {
	static TextFileInput infile;
	static String inFileName = "Project1.txt";
	static JFrame myFrame;
	static Container cPane;
	static TextArea R, D, M; //R = Refrigerator, D = Dishwasher, M = Microwave

	public static void main(String[] args) {
		GUI();
		inputFromFile(inFileName);
	} //Main



	private static void GUI() {
		R = new TextArea(); //Creates new text Area for Refrigerator Serial Numbers
		D = new TextArea(); //Creates new text Area for Dishwasher Serial Numbers
		M = new TextArea(); //Creates new text Area for Microwave Serial Numbers
		myFrame = new JFrame();
		myFrame.setSize(400,400); //Size
		myFrame.setLocation(200,200); //Where it appears
		myFrame.setTitle("Appliances"); //Title of the GUI
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cPane = myFrame.getContentPane();
		myFrame.setLayout(new GridLayout(1,3));
		cPane.add(R, BorderLayout.EAST); //Refrigerator Serial Numbers appear on the left side
		cPane.add(D, BorderLayout.CENTER); //Dishwasher Serial Numbers appear in the center
		cPane.add(M, BorderLayout.WEST); //Microwave Serial Numbers appear on the right side
    
		myFrame.setVisible(true);
	} //Method GUI

	private static void inputFromFile(String filename){
		ArrayList<Appliance> R_serial = new ArrayList<>(); //Creates a list of only Refrigerator Serial Numbers
		ArrayList<Appliance> D_Serial = new ArrayList<>(); //Creates a list of only Dishwasher Serial Numbers
		ArrayList<Appliance> M_Serial = new ArrayList<>(); //Creates a list of only Microwave Serial Numbers
		infile = new TextFileInput(filename); //Reads from file
		String line = infile.readLine(); 

		while (line != null) {
			Appliance appliance = new Appliance(line);
    
			if(appliance.getType() == 'R') {
				R_serial.add(appliance);
			}else if(appliance.getType() == 'D'){
				D_Serial.add(appliance);
			}else if(appliance.getType() == 'M') {
				M_Serial.add(appliance);
			}
			line = infile.readLine();
		} //End of while loop, sorts through which Serial Number belongs to which device
		
		SelectionSort(R_serial); //Sorts through Refrigerator Serial Numbers
		SelectionSort(D_Serial); //Sorts through Dishwasher Serial Numbers
		SelectionSort(M_Serial); //Sorts through Microwave Serial Numbers
    
		for(int i = 0; i < R_serial.size(); i++) {
			R.append(R_serial.get(i) + "\n");
		} //Prints Refrigerator Serial Number
		
		for(int i = 0; i < D_Serial.size(); i++) {
			D.append(D_Serial.get(i) + "\n");
		} //Prints Dishwasher Serial Number
		
		for(int i = 0; i < M_Serial.size(); i++) {
			M.append(M_Serial.get(i) + "\n");
		} //Prints Microwave Serial Number
		
    
	}//Method inputFromFile
	
	public static void SelectionSort(ArrayList<Appliance> list){

		for(int i = 0; i < list.size() - 1; i++) {
			int indexLowest = i;
			for(int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(j).getserialNum().compareTo(list.get(indexLowest).getserialNum()) < 0) {
                	indexLowest = j;
                }
			}
			if(indexLowest != i) {
				Appliance temp = list.get(i);
				list.set(i, list.get(indexLowest));
				list.set(indexLowest, temp);
			}
		}//Sorts through which serial number should go on top
	} //Method SelectionSort
} //End of Project 1