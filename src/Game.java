import java.io.Serializable;
import java.util.Scanner;

public class Game implements Serializable {
	private int xPos;
	private int yPos;
	
	public void play() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Current Position => X : "+xPos+", yPos : "+yPos);
		while(true) {
			System.out.println("How Much Horizontal Movement  ? ");
			int h=sc.nextInt();
			System.out.println("How Much Vertical Movement ? ");
			int v=sc.nextInt();
			xPos=xPos+h;
			yPos=yPos+v;
			System.out.println("New Position => X : "+xPos+", yPos : "+yPos);
			System.out.println("Do you want to exit press 0 : ");
			int ch=sc.nextInt();
			if(ch==0)break;
		}

	}
}
