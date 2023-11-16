package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale{
	final static String VERSO = "bau";
	final static String CIBO = "tutto";
		
	public Cane(String specie) {
		super(specie);
		
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

}
