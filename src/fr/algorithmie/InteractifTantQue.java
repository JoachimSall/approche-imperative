package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Entrez un nomnbre entre 1 et 10");
		int nb = s.nextInt();
		while (nb < 1 || nb > 10) {
			System.out.println("Entrez un nomnbre entre 1 et 10");
			nb = s.nextInt();
		}
		System.out.println(nb);
		
	}

}
