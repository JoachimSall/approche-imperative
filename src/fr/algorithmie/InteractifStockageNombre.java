package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] tab = new int[0];
		int taille = 0;
		boolean vartest = true;
			while(vartest == true) {
				System.out.println("Choisissez une option dans le menu :\n\n1. Ajouter un nombre\n2. Afficher les nombres existants");
				int selection = scanner.nextInt();
				if(selection == 1) {
					System.out.println("Ajoutez un nombre au tableau (appuyez sur entrée pour valider)");
					int nb = scanner.nextInt();
					taille++;
					int[] tab2 = new int[taille];
					if (taille == 1) {
						tab2[0] = nb;
					} else{
						for (int i = 0; i < tab.length; i++) {
							tab2[i] = tab[i];
						}
					}
					tab = tab2;
					tab[tab.length - 1] = nb;
					System.out.println("Le nombre " + nb + " a été ajouté au tableau\n");
				} if(selection == 2) {
					if(tab.length != 0) {
						String tableau = "Voici le contenu du tableau : [";
						for (int i = 0; i < tab.length - 1; i++) {
							tableau = tableau + tab[i] + ", ";
						}
						System.out.println(tableau + tab[tab.length - 1] + "]" );
					} else {
						System.out.println("Le tableau est vide !\n");
					}
				}
			}
	}
}


