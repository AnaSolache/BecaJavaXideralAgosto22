package com.curso.v3;

public class PcLinux extends Pc { //IS-A
	

	public PcLinux(String version) {
		super(version);
	}
	
	public void encender(){
		System.out.println("Encender PcLinux "+
				version);
	}

}
