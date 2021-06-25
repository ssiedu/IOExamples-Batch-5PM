import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PlayGame {

	public static void main(String[] args) throws Exception {
		
		//here we are starting a new game.
		Game g=new Game();
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
