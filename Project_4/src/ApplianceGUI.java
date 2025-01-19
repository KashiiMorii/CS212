//Property of Devindra A. Ramcharan CSCI 212 111B
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;
import java.awt.*;

/**
 * The ApplianceGUI class represents the GUI for displaying the appliance serial numbers.
 * This class extends JFrame and sets a File menu for the GUI. 
 * Three text areas are created in the GUI, one for Refrigerator, Dishwasher, and Microwave serial numbers.
 */

public class ApplianceGUI extends JFrame{
	
	protected JMenuBar menuBar = new JMenuBar();
	static Container cPane;
	static TextArea R, D, M; //R = Refrigerator, D = Dishwasher, M = Microwave
	
	 /**
     * Constructs an ApplianceGUI with the specified title, height, and width.
     * Creates the text areas for refrigerator, dishwasher, and microwave serial numbers.
     * Sets up the layout for the serial numbers and creates the file menu.
     *
     * @param title The title that displays in the window's title bar.
     * @param height The height of the window.
     * @param width The width of the window.
     */
	
	public ApplianceGUI(String title, int height, int width) {
		R = new TextArea(); //Creates new text Area for Refrigerator Serial Numbers
		D = new TextArea(); //Creates new text Area for Dishwasher Serial Numbers
		M = new TextArea(); //Creates new text Area for Microwave Serial Numbers
		
		setTitle(title); //Title of the GUI
		setSize(height,width); //Size
		setLocation(200,200); //Where it appears
		createFileMenu(); //Creates the File Menu on the GUI
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Closes GUI when exiting it

		cPane = getContentPane();
		setLayout(new GridLayout(1,3));
		cPane.add(R, BorderLayout.WEST); //Refrigerator Serial Numbers appear on the left side
		cPane.add(D, BorderLayout.CENTER); //Dishwasher Serial Numbers appear in the center
		cPane.add(M, BorderLayout.EAST); //Microwave Serial Numbers appear on the right side
		
		setVisible(true);
	} //Method ApplianceGUI
	
	/**
     * Creates the "File menu for the GUI, and includes the options to open a file, 
     * search through the file, and quit the application.
     */
	
	private void createFileMenu() {
	    JMenuItem item;
	    JMenu fileMenu = new JMenu("File");
	    FileMenuHandler fmh = new FileMenuHandler(this);

	    item = new JMenuItem("Open");	//Creates an open option when clicking on File
	    item.addActionListener(fmh);
	    fileMenu.add(item);
	    
	    fileMenu.addSeparator();		 //add a horizontal separator line

	    item = new JMenuItem("Search");	//Creates a search option when clicking on File
	    item.addActionListener(fmh);
	    fileMenu.add(item);

	    fileMenu.addSeparator();	    //add a horizontal separator line

	    item = new JMenuItem("Quit");	//Creates a quit option when clicking on File
	    item.addActionListener(fmh);
	    fileMenu.add(item);

	    setJMenuBar(menuBar);
	    menuBar.add(fileMenu);
	} //Method createFileMenu

}