package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",16);
		
		
		System.out.println(asterix);
		
		
		asterix.parler("Bonjour obelix");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");
		
		
		Romain minus = new Romain("Minus",6);
		System.out.println("Dans la for�t" +asterix +"et" + obelix +
				"tombent nez � nez sur le romain Minus."+ minus.getNom()+".");
		
		for(int i=0; i<3 ; i++) {
			asterix.frapper(minus);
			
			
		}
		
		
	}

}
