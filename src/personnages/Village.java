package personnages;

public class Village {
	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbvillageois = 0;

	public Gaulois getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public Village(String nom, Gaulois chef, int maxVillageois) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);

		villageois = new Gaulois[maxVillageois];
		// villageois.length donnera la taille

	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbvillageois < villageois.length) {
			villageois[nbvillageois] = gaulois;
			gaulois.setVillage(this);
			nbvillageois++;

		} else {
			System.out.println();
		}

	}

	public Gaulois trouverVillageois(int num) {
		if (num > 0 && num <= nbvillageois) {
			return villageois[num - 1];

		} else {
			System.out.println();
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef \" + chef.getNom() + "
				+ "\" vivent les légendaires gaulois :\"");
		for (int i = 0; i < villageois.length; i++) {
			System.out.println();

		}

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);

		System.out.println();
		village.afficherVillageois();

	}
}
