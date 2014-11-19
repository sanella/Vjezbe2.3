
public class zbirNula {
	public static void main(String[] args) {
		
		System.out.println("Unesi prvi broj ");
		int a = TextIO.getInt();
		System.out.println("Unesi drugi broj ");
		int b = TextIO.getInt();
		
		
		while (a != 0 && b != 0) {
			int suma = a + b;
			System.out.println("suma je " + suma);
			System.out.println("Unesi prvi broj ");
			a = TextIO.getInt(); //unosim ovo jer ne yelim da mi se ispisuje isti reyultat stalno nego da mogu ponovo unijeti broj
			System.out.println("Unesi drug i broj ");
			b = TextIO.getInt();
			
		}
		
		
	}
}
