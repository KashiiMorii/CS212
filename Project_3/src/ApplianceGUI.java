//Property of Devindra A. Ramcharan CSCI 212 111B
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;
import java.awt.*;

public class ApplianceGUI extends JFrame{
	protected JMenuBar menuBar = new JMenuBar();
	static Container cPane;
	static TextArea R, D, M; //R = Refrigerator, D = Dishwasher, M = Microwave
	
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
	} //Method GUI
	
	private void createFileMenu( ) {
		  JMenuItem item;
	      JMenu fileMenu = new JMenu("File");
	      FileMenuHandler fmh  = new FileMenuHandler(this);

	      item = new JMenuItem("Open");    //Creates an open option when clicking on File
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      fileMenu.addSeparator();           //add a horizontal separator line
	    
	      item = new JMenuItem("Quit");       //Creates a quit option when clicking on File
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	    
	   } //Method createFileMenu, which creates a File menu for the GUI
	}