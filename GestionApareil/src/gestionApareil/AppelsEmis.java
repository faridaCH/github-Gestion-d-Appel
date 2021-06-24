package gestionApareil;

import java.time.LocalDateTime;

public class AppelsEmis extends Appels {

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return this.getDureeAppel();
	}

	public AppelsEmis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelsEmis(int numero, LocalDateTime dateAppel, double dureeAppel, Contact contact) {
		super(numero, dateAppel, dureeAppel, contact);
		// TODO Auto-generated constructor stub
	}

	public AppelsEmis(int numero, LocalDateTime dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}

}
