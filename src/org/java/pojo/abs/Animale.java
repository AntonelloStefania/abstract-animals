package org.java.pojo.abs;

public abstract class Animale {
	private String specie;
	
	
	public Animale(String specie) {
		setSpecie(specie);
	}
	public  abstract void verso();
	public abstract void mangia();
	
	public String getSpecie() {
		return specie;
	}
	
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	public void dormi() {
		System.out.println(getSpecie() + ", quando dorme fa: Zzzz");
	}
	
	@Override
	public String toString() {
		
		return getSpecie() + "\n";
	}
		
	
}
