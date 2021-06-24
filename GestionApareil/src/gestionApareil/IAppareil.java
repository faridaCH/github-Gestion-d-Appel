package gestionApareil;

import java.time.LocalDateTime;
import java.util.List;

public interface IAppareil {

	public void enregistrer(Contact c);

	public void enregistrer(Appels a, String numeroTel);

	public Contact consulter(int numero) throws Exception;

	public List<Contact> consulter(String mc);

	public double coutTotalAppel();

	public double coutAppel(LocalDateTime d1, LocalDateTime d2);

	public double coutAppel(int numero);

}
