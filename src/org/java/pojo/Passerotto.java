package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Passerotto extends Animale {
	
	final static String VERSO = "cip-cip";
	final static String CIBO = "semi";
	
	public Passerotto(String specie) {
		super(specie);
		
	}

	@Override
	public void setSpecie(String specie) {
		
		super.setSpecie(specie);
	}
	
	@Override
	public void verso() {
		System.out.println("il passerotto fa: " + VERSO);
		
	}

	@Override
	public void mangia() {
		System.out.println("il passerotto mangia: " + CIBO);
	}
}
