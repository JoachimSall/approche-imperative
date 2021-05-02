package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {0, 1, 2, 3};
		int[] tab2 = new int[tab.length];
		for (int i = 1; i < tab.length; i++) {
			tab2[0] = tab[tab.length - 1];
			tab2[i] = tab[i -1];
		}
		for (int i = 0; i < tab.length; i++) {
			tab[i] = tab2[i];
			System.out.println(tab[i]);
		}
	}

}
