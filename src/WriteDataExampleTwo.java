import java.io.FileOutputStream;

public class WriteDataExampleTwo {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("e:/data/trial.txt");
		
		String s="hello user, this information will be stored to a file...!";

		byte b[]=s.getBytes();	//converting string to byte[]
		
		//fos.write(b);	//will write the complete byte array
		
		fos.write(b, 6, 25);	//will write the part of array (6-start, 25-no-of-bytes)
		
		fos.close();
		
		System.out.println("Data Stored...!");
		
	}

}
