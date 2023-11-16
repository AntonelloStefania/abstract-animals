package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante {
	static final String VERSO = "kleeek";
	static final String CIBO= "piccoli animali";
	public Aquila(String specie) {
		super(specie);
		
	}

	@Override
	public void setSpecie(String specie) {
		
		super.setSpecie(specie);
	}
	
	@Override
	public void verso() {
		System.out.println("l'aquila fa: " + VERSO);
		
	}

	@Override
	public void mangia() {
		System.out.println("l'aquila mangia: " + CIBO);
		
	}

	@Override
	public void vola() {
		System.out.println(getSpecie() + " dice: sto volando");
		
	}

	
	
}
