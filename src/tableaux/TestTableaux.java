package tableaux;

public class TestTableaux {

	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 2, 5, 3 };
		String[] tableauChaines = new String[5];
		int nbchaines = 0;

		System.out.println(tableauEntiers);
		for (int i = 0; i < tableauChaines.length; i++) {
			int entier = tableauEntiers[i];
			System.out.println(entier);
			if (i < tableauChaines.length - 1) {
				System.out.println(",");

			}

		}

		for (String chaine : tableauChaines) {
			System.out.println(chaine + "");

		}

		tableauChaines[nbchaines] = "Hello";
		nbchaines++;
		tableauChaines[nbchaines] = "world";
		nbchaines++;

		for (int i = 0; i < nbchaines; i++) {
			System.out.println(tableauChaines[i] + " ");
		}

	}

}
