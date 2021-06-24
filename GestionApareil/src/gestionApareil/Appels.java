package gestionApareil;

import java.time.LocalDateTime;

public abstract class Appels {
	private int numero;
	private LocalDateTime dateAppel;
	private double dureeAppel;
	private Contact contact;

	public abstract double cout();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDateTime getDateAppel() {
		return dateAppel;
	}

	public void setDateAppel(LocalDateTime dateAppel) {
		this.dateAppel = dateAppel;
	}

	public double getDureeAppel() {
		return dureeAppel;
	}

	public void setDureeAppel(double duréeAppel) {
		this.dureeAppel = duréeAppel;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Appels(int numero, LocalDateTime dateAppel, double dureeAppel) {
		super();
		this.numero = numero;
		this.dateAppel = dateAppel;
		this.dureeAppel = dureeAppel;
	}
	

	public Appels(int numero, LocalDateTime dateAppel, double dureeAppel, Contact contact) {
		super();
		this.numero = numero;
		this.dateAppel = dateAppel;
		this.dureeAppel = dureeAppel;
		this.contact = contact;
	}

	public Appels() {
		super();
		// TODO Auto-generated constructor stub
	}

}
