package jeu_de_la_vie;

public class Jeu_de_la_vie {
	// déclaration du tableau bidimensionnel qui représente notre grille
	public static boolean[][] grille = new boolean[6][6];

	// initialisation de cellules vivantes via le constructeur
	public Jeu_de_la_vie() {
		Jeu_de_la_vie.grille[1][2] = true;
		Jeu_de_la_vie.grille[5][4] = true;
		Jeu_de_la_vie.grille[2][2] = true;
		Jeu_de_la_vie.grille[3][1] = true;
	}

	// methode premettant de compter les voisins de la cellule actuelle
	public static int compterVoisins(int x, int y) {
		int compte = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0)
					continue; // ignorer la cellule elle-même
				int nx = x + i;
				int ny = y + j;
				if (nx >= 0 && nx < grille.length && ny >= 0 && ny < grille[0].length && grille[nx][ny]) {
					compte++;
				}
			}
		}
		return compte;
	}

	// methode permettant la generation d'une nouvelle grille si dans la precedente
	// toutes les cellules n'etait ni toute morte ni toute vivante
	public static boolean[][] prochaineGeneration() {
		boolean[][] nouvelleGrille = new boolean[grille.length][grille[0].length];
		for (int x = 0; x < grille.length; x++) {
			for (int y = 0; y < grille[0].length; y++) {
				int voisins = compterVoisins(x, y);
				if (grille[x][y]) { // cellule vivante
					nouvelleGrille[x][y] = (voisins == 2 || voisins == 3);
				} else { // cellule morte
					nouvelleGrille[x][y] = (voisins == 3);
				}
			}
		}
		return nouvelleGrille;
	}

	// methode premettant l'affichage dans la console
	public static void afficher() {
		for (int x = 0; x < grille.length; x++) {
			for (int y = 0; y < grille[0].length; y++) {
				System.out.print(grille[x][y] ? "X " : ". ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// methode permettant de determiner si toutes les cellule sont vivants
	public static boolean toutesVivantes() {
		for (int x = 0; x < grille.length; x++) {
			for (int y = 0; y < grille[0].length; y++) {
				if (!grille[x][y])
					return false; // si on trouve une morte → pas toutes vivantes
			}
		}
		return true;
	}

	// methode permettant de determiner si toute les cellules sont morte
	public static boolean toutesMortes() {
		for (int x = 0; x < grille.length; x++) {
			for (int y = 0; y < grille[0].length; y++) {
				if (grille[x][y])
					return false; // si on trouve une vivante → pas toutes mortes
			}
		}
		return true;
	}

	public static void main(String[] args) throws InterruptedException {
		new Jeu_de_la_vie(); // initialisation

		while (true) {
			afficher();

			// Vérifier conditions d’arrêt
			if (toutesVivantes() || toutesMortes()) {
				System.out.println("Fin du jeu !");
				break; // on sort de la boucle
			}

			grille = prochaineGeneration();
			Thread.sleep(500);
		}
	}

}
