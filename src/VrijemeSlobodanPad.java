
public class VrijemeSlobodanPad {
	public static void main(String[] args) {
		double g = 9.81 ;
		System.out.println("Unesi visinu ");
		double h = TextIO.getDouble();
		System.out.println("unesi vrijeme pada ");
		double tZadano = TextIO.getDouble();
		double hIzracunato = (g * tZadano * tZadano) / 2;
		System.out.println("uvredjeni put pada je  " + hIzracunato);
		if (hIzracunato < h) {
			double hRazlika =  h - hIzracunato ;
			double tDodatno = Math.sqrt(2 * hRazlika / g) ;
			System.out.println("tijelo ce padati jos " + tDodatno);
		}	else {
			System.out.println("unesi vrijeme manje ");
		}
	
	}
}
