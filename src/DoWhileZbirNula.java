
public class DoWhileZbirNula {
	public static void main(String[] args) {// upisuj dva broja koja ce se sabrati sve dok oba broja ne budu nula
	
	int a, b; //napravimo varijable
	
	do { //radi ovo dok ne dobijes ono sto je u while
		System.out.println("Unesi prvi broj "); // ovdje unosim vrijednost varijable 1
		a = TextIO.getInt();
		
		System.out.println("Unesi drugi broj "); // ovdje unosim vrijednost varijable 2
		b = TextIO.getInt();
		
		int suma = a + b;
		System.out.println("suma " + suma);
	}while (a != 0 && b != 0);
		
	}
}