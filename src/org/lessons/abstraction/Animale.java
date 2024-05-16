package org.lessons.abstraction;

public abstract class Animale implements IVolante, INuotante{
	
	public void dormi() {
		System.out.println("Zzz");
	};
	
	public abstract void verso();
	
	public abstract void mangia();

}
