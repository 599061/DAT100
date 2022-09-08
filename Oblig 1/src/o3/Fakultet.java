package o3;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Fakultet {

	public static void main(String[] args) {

		
		int fak = 1;
		int num = parseInt(showInputDialog("Tall: "));
		
		if (num > 0) {
			for (int i = fak; i <= num; i++) {
				fak = fak * i;
			}
			System.out.println(num + "! = " + fak);
			
		} else if (num < 0) {
			System.out.println(num + "! = Undefined");
			
		} else
			System.out.println(num + "! = 1");

	}

}
