import java.util.Scanner;
public class First{
	public static void main(String[] args){
		int s;
		Scanner From_User = new Scanner(System.in);
		System.out.print("\n Enter : ");
		s = From_User.nextInt();

		for (int i=1; i!= 13; ++i)
			System.out.println("\t--> "+i+" x "+s+" = "+(i*s)+" <--");
	}
}