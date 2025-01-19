import java.io.File;
import javax.swing.*;
public class ListFiles {

	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        
        fd.setFileSelectionMode(JFileChooser.FILES_ONLY); //Shows only directories in file chooser
        //fd.setFileSelectionMode(JFileChooser.FILES_ONLY); //Shows only files in file chooser - needed for project 3
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f,"");
		ListLargestFile(f);

	}
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			System.out.print(indent+f2.getName()); //Prints out name
			//System.out.print(indent+f2.getAbsolutePath()); //Prints absolute path - needed for project 3
			System.out.print("...");
			System.out.print(f2.lastModified()); //Prints out last modified
			System.out.print("...");
			System.out.print(f2.length()); //Prints out size
			System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
	}
	public static File ListLargestFile(File directory) {
		File largestFile = null;
		
		File[] files = directory.listFiles();
		for (int i = 0; i<files.length; i++) {
			if(files[i].isFile()) {
				if(largestFile == null || files[i].length() > largestFile.length()) {
					largestFile = files[i];
				}
			}
			else if(files[i].isDirectory()) {
				File largestInSubDir = ListLargestFile(files[i]);
				if(largestInSubDir != null && (largestFile == null || largestInSubDir.length()>largestFile.length())) {
					largestFile = largestInSubDir;
				}
			}
		}
		return largestFile;
	}
}

