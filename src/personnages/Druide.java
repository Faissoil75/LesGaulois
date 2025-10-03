package personnages;

public class Druide {
	private String nom;
	
	public void Druide (String nom) {
		this.nom = nom;
		
	}

	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le druide" + nom +":";
		
	}
	
	
	
	

}
