package fr.algorithmie;

import java.io.InputStream;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println("Affichage des éléments du tableau");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Affichage des éléments du tableau dans l'ordre inverse");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		int[] arrayCopy = array;
	}

}
