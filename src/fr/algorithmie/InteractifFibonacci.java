package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean encours = true;
		while (encours = true) {
			System.out.println("Saisissez un rang (appuyez sur entrée pour valider)");
			int n = scanner.nextInt();
			int[] nb = new int[n + 1];
			nb[0] = 0;
			if (n >= 1) {
				nb[1] = 1;
				if (n > 1) {
					for (int i = 2; i < nb.length; i++ ) {
						nb[i] = nb[i - 1] + nb[i - 2];
					}
				}
			}
			System.out.println("Le nombre de rang " + n + " est " + nb[n] + "\n");
		}
	}

}
