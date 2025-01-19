//Property of Devindra A. Ramcharan CSCI 212 111B
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;

public class ApplianceGUI{
	static TextFileInput infile;
	static String inFileName = "p2input.txt";
	static JFrame myFrame;
	static Container cPane;
	static TextArea R, D, M; //R = Refrigerator, D = Dishwasher, M = Microwave
	
	protected static void GUI() {
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
		cPane.add(R, BorderLayout.WEST); //Refrigerator Serial Numbers appear on the left side
		cPane.add(D, BorderLayout.CENTER); //Dishwasher Serial Numbers appear in the center
		cPane.add(M, BorderLayout.EAST); //Microwave Serial Numbers appear on the right side
    
		myFrame.setVisible(true);
	} //Method GUI
}