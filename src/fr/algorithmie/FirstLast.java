package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 3} ;
		boolean valeur = false;
		if (array.length >= 1 && array[0] == array[array.length - 1]) {
			valeur = true;
		}
		System.out.println(valeur);
	}

}
