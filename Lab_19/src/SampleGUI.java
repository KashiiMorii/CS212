import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
	protected JMenuBar	menuBar = new JMenuBar();
      
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
	    createFileMenu();
	    createEditMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
    
   } //createMenu
   
   private void createEditMenu( ) {
	   JMenuItem item;
	   JMenu editMenu = new JMenu("Edit");
	   EditMenuHandler fmh = new EditMenuHandler(this);
	   
	   item = new JMenuItem("Find");
	   item.addActionListener(fmh);
	   editMenu.add(item);
	   
	   editMenu.addSeparator();  
	   
	   item = new JMenuItem("Replace");
	   item.addActionListener(fmh);
	   editMenu.add(item);
	   
	   setJMenuBar(menuBar);
	   menuBar.add(editMenu);
   }

} //SSNGUI
