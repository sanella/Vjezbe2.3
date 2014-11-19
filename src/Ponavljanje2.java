import java.util.Scanner;


public class Ponavljanje2 {
	public static void main(String[] args) {
		System.out.println("Unesi ");
		int a = TextIO.getInt();
		
		Scanner in = new Scanner(System.in);
		String ime = in.nextLine();
		
		while (a != 0) {
			a--;
		System.out.println("Hello " + ime);}
		
}
}