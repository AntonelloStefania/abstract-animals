package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;
import org.java.pojo.inter.IVolante;


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
		
		IVolante[] volatili = new IVolante[2];
		volatili[0] = a;
		volatili[1]= p;
		
		for(int x=0; x<volatili.length; x++) {
			IVolante v = volatili[x];
			faiVolare(v);
		}
		
		
		System.out.println("\n-----------------------\n");
		
		INuotante[] natanti = new INuotante[2];
		natanti[0] = c;
		natanti[1]= d;
		
		for(int x=0; x<natanti.length; x++) {
			INuotante n= natanti[x];
			faiNuotare(n);
		}
		

	}
	public static void faiVolare(IVolante v) {
		v.vola();
	}
	
	public static void faiNuotare(INuotante n) {
		n.nuota();
	}
}
