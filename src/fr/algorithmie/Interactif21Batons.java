package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean mon_tour = true;
		boolean fin = false;
		int batons = 21;
		while( fin == false) {
			System.out.println("Nombre de batons : " + batons);
			System.out.println("Saisissez 1, 2 ou 3 en fonction du nombre de bâtons que vous souhaitez retirer (appuyez sur entrée pour valider votre choix)");
			int nb_batons = scanner.nextInt();
			if (nb_batons >= 1 && nb_batons <= 3) {
				if ( (batons - nb_batons) > 0) {
					batons = batons - nb_batons;
					System.out.println("Vous avez retirez " + nb_batons + " bâtons");
					mon_tour = false;
				} else if( (batons - nb_batons) == 0) {
					System.out.println("Vous avez perdu !");
					fin = true;
				} else {
					System.out.println("Veuillez ne pas retirer plus de " + batons + " batons !");
				}
			} else {
				System.out.println("Vous devez retirez 1, 2 ou 3 bâtons !");
			}
			while(mon_tour == false) {
				int batons_ordi = (int) (1 + Math.random() * 3);
				if ((batons - batons_ordi) > 0) {
					batons = batons - batons_ordi;
					System.out.println("La machine a retiré " + batons_ordi + " batons");
					mon_tour = true;
				} else if ((batons - batons_ordi) == 0) {
					System.out.println("Vous avez gagnez !");
					mon_tour = true;
					fin = true;
				} else {
					batons_ordi = (int) (Math.random() * 3);
				}
			}
		}
	}

}
