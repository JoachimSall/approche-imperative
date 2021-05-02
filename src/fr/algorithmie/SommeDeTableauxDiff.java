package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		//on initialise la taille de array3 comme étant celle du tableau le plus grand
		int[] array3 = new int[array.length];
		//on additionne les chacune des valeurs du array avec celle du array2 jusqu'à ce qu'il n'y est plus de valeurs du array2 à additionner
		for(int i = 0; i < array2.length; i++) {
			array3[i] = array2[i] + array[i];
			System.out.println(array3[i]);
		}
		//on ajoute les valeurs restantes du array dans les cases restantes du array3
		for(int i = array2.length; i < array.length; i++) {
			array3[i] = array[i];
			System.out.println(array3[i]);
		}
	}

}
