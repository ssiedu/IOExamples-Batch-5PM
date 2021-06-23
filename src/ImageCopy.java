import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args) throws Exception {
		
		//here we are reading a image file (binary data) and creating its copy
		
		FileInputStream fis=new FileInputStream("e:/images/mobile.png");
		int size=fis.available();
		byte b[]=new byte[size];
		fis.read(b);
		fis.close();
		
		//the data we have read from mobile.png , we will write it to some other file.
		
		FileOutputStream fos=new FileOutputStream("e:/data/mobilecopy.png");
		fos.write(b);
		fos.close();
		System.out.println("Data Copied...");
	}

}
