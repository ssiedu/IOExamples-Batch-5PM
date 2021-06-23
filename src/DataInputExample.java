import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExample {

	public static void main(String[] args) throws Exception {
		//here we will read the values from empinfo.txt (data stored using DataOutputStream)

		FileInputStream fis=new FileInputStream("e:/data/empinfo.txt");
		DataInputStream dis=new DataInputStream(fis);
		int v1=dis.readInt();	// to read eno
		double v2=dis.readDouble(); //to read sal
		boolean v3=dis.readBoolean(); //to read marital status
		dis.close();
		fis.close();
		System.out.println("Emp No. : "+v1);
		System.out.println("Salary  : "+v2);
		System.out.println("Married : "+v3);
		
	}

}
