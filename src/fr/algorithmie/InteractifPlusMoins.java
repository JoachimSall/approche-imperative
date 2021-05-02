package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb = (int) Math.round(Math.random() * 100);
		Scanner s = new Scanner(System.in);
		System.out.println("Devinez le nombre mystère");
		int proposition = s.nextInt();
		while (proposition != nb) {
			System.out.println("Raté ! Essayez encore !");
			proposition = s.nextInt();
		}
		System.out.println("Bravo ! vous avez touvez le nombre mystère : " + nb);
	}

}
