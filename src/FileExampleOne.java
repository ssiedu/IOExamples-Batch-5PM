import java.io.File;
import java.util.Scanner;

public class FileExampleOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Folder Name : ");
		String name=sc.next();
		File f=new File(name);
		String items[]=f.list();
		for(String item:items) {
			System.out.println(item);
		}
		/*
		File f=new File("e:/data/trial.txt");
		long v=f.lastModified();	//no of milliseconds passed from 1 jan 1970 00:00:00 
		System.out.println(v);
		java.util.Date dt=new java.util.Date(v);
		System.out.println(dt);
		*/
		//boolean b=f.isHidden();
		//boolean b=f.canWrite();
		//boolean b=f.isDirectory();
		//boolean b=f.isFile();
		//System.out.println(b);
		/*
		boolean b=f.exists();
		System.out.println(b);
		
		long n=f.length();
		System.out.println("Size : "+n);
		*/
	}

}
/*
 	Non-Static (Needs to be called on File object)
 
 	boolean isFile()		//true=> its a file
 	boolean isDirectory()	//true=> its a folder
 	boolean exists()
	long length()	
	boolean isHidden()
	boolean canWrite()
	long lastModified()
	String[] list()			//retuns an String-array (elements of a folder)
	
	
	
*/