package fr.algorithmie;

import java.io.InputStream;
import java.util.Scanner;

public class AffichageIdentite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quel est votre prénom ?");
		Scanner s = new Scanner(System.in);
		String prenom = s.nextLine();
		System.out.println("Quel est votre nom ?");
		String nom = s.nextLine();
		System.out.println("Quel est votre age ?");
		int age = s.nextInt();
		for(int i = 0; i < 10; i++ ) {
			System.out.println("Vous êtes "+ prenom + " " + nom + " et vous avez " + age + " ans");
		}

	}

}
