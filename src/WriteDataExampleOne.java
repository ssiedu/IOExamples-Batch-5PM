import java.io.FileOutputStream;

public class WriteDataExampleOne {

	public static void main(String[] args) throws Exception {
		
		//here we will write the data to a file.
		
		//open a stream
			//FileOutputStream fos=new FileOutputStream("e:/data/info.txt");
			//FileOutputStream fos=new FileOutputStream("e:/data/information.txt");
			FileOutputStream fos=new FileOutputStream("e:/data/information.txt",true);
		//write the data on stream
			fos.write(101); fos.write(102); fos.write(103); fos.write(104); 
		//close the stream
			fos.close();
			
			System.out.println("Data Successfully Stored....!");

	}

}
