package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Entrez 10 nombres (appuyez sur entrée après chaque nombre)");
		int[] tab = new int[10];
		int nbMax = 0;
		for (int i = 0; i < 10; i++) {
			tab[i] = s.nextInt();
			if (nbMax < tab[i]) {
				nbMax = tab[i];
			}
		}
		System.out.println("Le plus grand nombre entré est " + nbMax);
	}

}
