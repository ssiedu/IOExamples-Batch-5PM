import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PreviousGame {

	public static void main(String[] args) throws Exception {
		
		//here we want to resume the last game.
		//we will read the game instance from lastgame.txt
		FileInputStream fis=new FileInputStream("e:/data/lastgame.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Game g=(Game)ois.readObject();
		ois.close();
		fis.close();
		g.play();
		System.out.println("Saving Game...!");
		FileOutputStream fos=new FileOutputStream("e:/data/lastgame.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close();
		fos.close();
		System.out.println("Game Stored...!");
		System.out.println("Quit...!");
	}

}
