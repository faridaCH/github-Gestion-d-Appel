package gestionApareil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements IAppareil {
	private List<Contact> contacts = new ArrayList<Contact>();
	private Map<Integer, Appels> appels = new HashMap<Integer, Appels>();

	@Override
	public void enregistrer(Contact c) {
		contacts.add(c);

	}

	@Override
	public void enregistrer(Appels a, String numeroTel) {
		Contact c1 = null;
		for (Contact c : contacts)
			if (c.getNumeroTel().equals(numeroTel)) {
				c1 = c;
				break;
			}
		a.setContact(c1);
		appels.put(a.getNumero(), a);

	}

	@Override
	public Contact consulter(int numero) throws Exception {

		for (Contact c : contacts)
			if (c.getNumero() == numero)

				return c;
		throw new Exception("Contact" + numero + " introuvable");
	}

	@Override
	public List<Contact> consulter(String mc) {
		List<Contact> cts = new ArrayList<Contact>();
		for (Contact c : contacts)
			if (c.getNom().contains(mc))
				cts.add(c);
		return cts;
	}

	@Override
	public double coutTotalAppel() {
		double total = 0;
		for (Appels a : appels.values()) {
			total = total + a.cout();
		}
		return total;
	}

	@Override
	public double coutAppel(LocalDateTime d1, LocalDateTime d2) {
		double total = 0;
		for (Appels a : appels.values()) {
			if ((a.getDateAppel().isAfter(d1)) && (a.getDateAppel().isBefore(d2))) {
				total = total + a.cout();
			}}
		return total;
	}

	@Override
	public double coutAppel(int numero) {
		double total = 0;
		for (Appels a : appels.values()) {
			if (a.getContact().getNumero()==numero) {
				total = total + a.cout();
			}}
		return 0;
	}

}
