import java.io.FileReader;

public class FileReaderExample {
	public static void main(String args[]) throws Exception {
		FileReader fr=new FileReader("e:/data/mydata.txt");
		char ch[]=new char[25];
		fr.read(ch);
		for(char tmp:ch) {
			System.out.print(tmp);
		}
		fr.close();
	}
}
			