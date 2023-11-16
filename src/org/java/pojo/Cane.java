package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante{
	final static String VERSO = "bau";
	final static String CIBO = "tutto";
		
	public Cane(String specie) {
		super(specie);
		
	}
	public void nuota() {
		System.out.println(getSpecie() + " dice: sto nuotando!");
	}
	
	@Override
		public void setSpecie(String specie) {
			
			super.setSpecie(specie);
		}
	@Override
	public void verso() {
		System.out.println("il cane fa: " + VERSO);
		
	}

	@Override
	public void mangia() {
		System.out.println("il cane mangia: " + CIBO);
		
	}
	@Override
	public void faiNuotare() {
		nuota();
		
	}

}
