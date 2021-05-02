package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		int nb = s.nextInt();
		int somme = 0;
		int[] tab = new int[nb];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
			somme = tab[i] + somme;
		}
		System.out.println("La somme des nombres entiers compris entre 1 et "  + nb + " inclus est de " + somme);
	}

}
