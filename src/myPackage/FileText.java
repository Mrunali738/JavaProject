package myPackage;

import java.io.File;
import java.io.IOException;

public class FileText {

	public static void main(String[] args) throws IOException {
		
		//Create TextFile
		File fileobj = new File("C:/Users/sac/Desktop/Myexcel.xls");
		fileobj.createNewFile();
		//fileobj.delete();
		
		/* Delete a Text File
	public static void main (String [] args) throws IOException{
	File fileObject = new File(“C:/Users/sac/Desktop/UFT.txt”);
	fileObject.delete();
	}*/
	}
}
