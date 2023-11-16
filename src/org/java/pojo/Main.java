package org.java.pojo;

import org.java.pojo.abs.Animale;


public class Main {
	
	public static void main(String[] args) {
		Cane c= new Cane("cane");
		Passerotto p = new Passerotto("passerotto");
		Delfino d = new Delfino("delfino");
		Aquila a = new Aquila("aquila");
		
		
		Animale[] animals = new Animale[4];
		animals[0] = c;
		animals[1]= p;
		animals[2]=d;
		animals[3]=a;
		
		
		for(int x =0; x<animals.length; x++) {
			Animale i = animals[x];
			
			
			i.verso();
			i.mangia();
			i.dormi();
			System.out.println("\n-----------------------\n");
		}
		
		
		
		
		
	}
	
}
