
public class Vjezbe23 {
	public static void main(String[] args) {
		double g = 9.81 ;
		System.out.println("Unesi vrijeme u minutama");
		double t = TextIO.getDouble();
		double h = (g * t * t) / 2 ;
		System.out.println("visina s koje tijelo pada: " + h) ;
		
	}
}
