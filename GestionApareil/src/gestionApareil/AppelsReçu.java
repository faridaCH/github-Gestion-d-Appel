package gestionApareil;

import java.time.LocalDateTime;

public class AppelsRe�u extends Appels {

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0;
	}

	public AppelsRe�u() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelsRe�u(int numero, LocalDateTime dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}

	public AppelsRe�u(int numero, LocalDateTime dateAppel, double dureeAppel, Contact contact) {
		super(numero, dateAppel, dureeAppel, contact);
		// TODO Auto-generated constructor stub
	}

}
