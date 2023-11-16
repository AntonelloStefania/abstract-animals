package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Delfino extends Animale{
	final static String VERSO="ekk-ekk";
	final static String CIBO="pesce e calamari";
	public Delfino(String specie) {
		super(specie);
		
	}
	
	@Override
	public void setSpecie(String specie) {
		
		super.setSpecie(specie);
	}
	
	@Override
	public void verso() {
		System.out.println("il delfino fa: " + VERSO);
		
	}

	@Override
	public void mangia() {
		System.out.println("il delfino mangia: " + CIBO);
		
	}

}
