package o1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {

		int brutto = parseInt(showInputDialog("Bruttoinntekt:"));
		int trinn0 = brutto * 0;
		double trinn1 = brutto * 0.017;
		double trinn2 = brutto * 0.040;
		double trinn3 = brutto * 0.134;
		double trinn4 = brutto * 0.164;
		double trinn5 = brutto * 0.174;

		// trinn 0
		if (brutto <= 190349) {
			System.out.print("Skatt:\n" + trinn0);
		}
		// trinn 1
		else if (brutto > 190349 && brutto <= 267899) {
			System.out.print("Skatt:\n" + "Trinn 1: kr " + trinn1);
		}
		// trinn 2
		else if (brutto > 267899 && brutto <= 643799) {
			System.out.print("Skatt:\n" + "Trinn 2: kr " + trinn2);
		}
		// trinn 3
		else if (brutto > 643799 && brutto <= 969199) {
			System.out.print("Skatt:\n" + "Trinn 3: kr " + trinn3);
		}
		// trinn 4
		else if (brutto > 969199 && brutto <= 1999999) {
			System.out.print("Skatt:\n" + "Trinn 4: kr " + trinn4);
		}
		// trinn 5
		else if (brutto > 1999999) {
			System.out.print("Skatt:\n" + "Trinn 5: kr " + trinn5);
		}

	}

}
