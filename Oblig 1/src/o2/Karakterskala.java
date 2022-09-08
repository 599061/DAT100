package o2;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class Karakterskala {

	public static void main(String[] args) {
		int n = 1;
		int k = 10;

		for (int i = n; i <= k; i++) {
			 int poeng = parseInt(showInputDialog("Poengsum:"));
			if (poeng >= 0 && poeng <= 39) {
				System.out.println(poeng + " / 100 = Karakter F");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println(poeng + " / 100 = Karakter E");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println(poeng + " / 100 = Karakter D");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println(poeng + " / 100 = Karakter C");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println(poeng + " / 100 = Karakter B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println(poeng + " / 100 = Karakter A");
			} else if (poeng < 0 || poeng > 100) {
				System.out.println("Obs! " + poeng + " er ikke en gyldig poengsum" + "\n" + "Gyldige verdier: [0-100]"
						+ "\n" + "Vennligst prøv igjen");
				i--;
			}
		}

	}
}
