import java.io.FileInputStream;

public class ReadDataExampleTwo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("e:/data/test.txt");
		
		//find the number of bytes in stream
		int n=fis.available();
		
		//creating an byte array to store the data taken from stream
		byte b[]=new byte[n];
		
		fis.read(b);
		
		String s=new String(b);	//we are converting an byte array to String.
		System.out.println(s);
		
		fis.close();
	}

}
