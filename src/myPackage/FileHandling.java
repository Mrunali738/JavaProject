package myPackage;
import java.io.File;

public class FileHandling {
	public static void main(String[] args) {
		//Create Folder
		
		File fileobject = new File("C://Users//sac//Desktop//Selenium"); 
		fileobject.mkdir();
		
		//Check the existence of Selenium Folder.
		boolean a = fileobject.exists();
		if(a==true) {
			System.out.println("Folder is Exist");
		}
		else {
			System.out.println("Folder doesn't Exist");
		}
		
		//Delete Folder
		fileobject.delete();
		
	}

}
