import java.io.File;

public class FileExampleTwo {
	public static void main(String args[]) {
		//File f=new File("e:/data/sample.txt");
		//boolean res=f.delete();
		//boolean res=f.mkdir();
		
		File f1=new File("e:/batch12/text.txt");
		File f2=new File("e:/data/test.txt");
		boolean res=f1.renameTo(f2);
		
		if(res==true) {
			System.out.println("Operation Success...!");
		}else {
			System.out.println("Operation Failed...!");
		}
	}
}
/*
	boolean mkdir()			to create a directory(folder)
	boolean delete()		to delete a file/folder(empty)
	boolean renameTo(File)	to rename a file/folder
	boolean createNewFile()	to create a new file

*/
