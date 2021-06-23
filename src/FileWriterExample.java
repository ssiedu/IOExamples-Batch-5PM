import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {

		//here we will use a character based stream (FileWriter isstead of FileOutputStream)
		
		FileWriter fw=new FileWriter("e:/data/mydata.txt");
		fw.write("hello user ");
		fw.write("writing this data using writer...!");
		fw.close();
		System.out.println("Data Stored...!");
	}

}
