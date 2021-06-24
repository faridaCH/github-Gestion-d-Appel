package gestionApareil;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Appareil appareil = new Appareil();
		appareil.enregistrer(new Contact(1, "c1", "0629815634"));
		appareil.enregistrer(new Contact(2, "c2", "0729800034"));
		appareil.enregistrer(new AppelsEmis(1, LocalDateTime.now(), 66),  "0629815634");
		appareil.enregistrer(new AppelsEmis(2, LocalDateTime.now(), 125), "0729800034");
		appareil.enregistrer(new AppelsEmis(3, LocalDateTime.now(), 122), "0929800034");
		appareil.enregistrer(new AppelsReçu(4, LocalDateTime.now(), 98),  "0629815634");
		
		System.out.println("***********************************");
		System.out.println(" consulter les contacts par numero");
		
		
		try {
			Contact c=appareil.consulter(1);
			System.out.println(" numero :"+c.getNumero());
			System.out.println("----- nom : "+c.getNom());
			System.out.println(" ----- numeroTel : "+c.getNumeroTel());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("**************************************");
		System.out.println(" consulter les contacts par mot clef");
		List<Contact> contacts=appareil.consulter("c");
		for(Contact c: contacts) {
			System.out.println("************************************");
			System.out.println("Nom: "+c.getNom());
			System.out.println(" Tel  : "+c.getNumeroTel());
			System.out.println("******************************");
			System.out.println(" consulter le couts d'appels d'un contact");
			System.out.println(" cout  : "+ appareil.coutAppel(1));
	System.out.println(" Partie couts à tester ");
		}
	}

}
