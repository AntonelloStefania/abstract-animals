package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante{
	final static String VERSO="ekk-ekk";
	final static String CIBO="pesce e calamari";
	public Delfino(String specie) {
		super(specie);
		
	}
	
	public void nuota() {
		System.out.println(getSpecie() + " dice: sto nuotando!");
	}
	
	@Override
	public  void  setSpecie(String specie) {
		
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

	@Override
	public void faiNuotare() {
		nuota();
		
	}

}
