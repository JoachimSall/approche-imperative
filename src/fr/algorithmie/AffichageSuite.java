package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombres de 1 à 10 for");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		System.out.println("Nombres pairs de 0 à 10 for");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		System.out.println("Nombres impairs de 0 à 9 for");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}
		System.out.println("Nombres de 1 à 10 while");
		int i = 0;
		while(i < 10) {
			System.out.println(i+1);
			i++;
		}
		System.out.println("Nombres pairs de 0 à 10 while");
		i = 0;
		while(i < 11) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
		System.out.println("Nombres impairs de 0 à 9 while");
		i = 0;
		while(i < 10) {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		}

	}

}
