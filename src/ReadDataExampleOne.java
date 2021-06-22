import java.io.FileInputStream;

public class ReadDataExampleOne {

	public static void main(String[] args) throws Exception {

		//here we will read the contents of the file demo.txt
		
		//step-1 (open a stream)
		//FileInputStream fis=new FileInputStream("e:/data/demo.txt");
		FileInputStream fis=new FileInputStream("e:/prog430/Demo.java");
		
		//step-2 (read the data from stream)
		while(true) {
			int n=fis.read();
			if(n==-1)break;
			System.out.print((char)n);
		}
				
		
		//step-3 (close the stream)
		fis.close();
	}

}
