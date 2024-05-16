package org.lessons.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String scelta;
		
		System.out.println("Che animale ti interessa? cane, passerotto, aquila o delfino?");
		scelta = scan.nextLine().toLowerCase();
		
		if(scelta.equals("cane")) {
		
			Animale cane = new Cane();
			
			cane.dormi();
			cane.verso();
			cane.mangia();
		}
		else if (scelta.equals("passerotto")) {
			Animale passerotto = new Passerotto();
			
			passerotto.dormi();
			passerotto.verso();
			passerotto.mangia();
			passerotto.vola();
		}
		else if (scelta.equals("aquila")) {
			Animale aquila = new Aquila();
			
			aquila.dormi();
			aquila.verso();
			aquila.mangia();
			aquila.vola();
		}
		else if (scelta.equals("delfino")) {
			Animale delfino = new Delfino();
			
			delfino.dormi();
			delfino.verso();
			delfino.mangia();
			delfino.nuota();
		}
		scan.close();
	}

}
