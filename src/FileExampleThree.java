import java.io.File;
import java.io.IOException;

public class FileExampleThree {

	public static void main(String[] args) throws IOException {
		
		File f=new File("e:/data/demo.txt");
		boolean res=f.createNewFile();
		if(res) {
			System.out.println("File Created...!");
		}else {
			System.out.println("Cant Create File...!");
		}
	}

}
/*
 	boolean createNewFile()
*/
