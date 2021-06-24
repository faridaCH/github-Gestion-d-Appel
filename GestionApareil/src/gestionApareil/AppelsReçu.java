package gestionApareil;

import java.time.LocalDateTime;

public class AppelsReçu extends Appels {

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0;
	}

	public AppelsReçu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelsReçu(int numero, LocalDateTime dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}

	public AppelsReçu(int numero, LocalDateTime dateAppel, double dureeAppel, Contact contact) {
		super(numero, dateAppel, dureeAppel, contact);
		// TODO Auto-generated constructor stub
	}

}
