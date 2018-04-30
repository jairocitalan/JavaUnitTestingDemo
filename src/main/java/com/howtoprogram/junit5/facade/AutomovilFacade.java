package com.howtoprogram.junit5.facade;

public class AutomovilFacade {

	
	public static void arrancar() {
		ComprobarLiquidos cl=new ComprobarLiquidos();
		ComprobarAceite ca=new ComprobarAceite();
		ComprobarAsientos comAsiento= new ComprobarAsientos();
		ComprobarEspejos comEspejos=new ComprobarEspejos();
	
		Arrancar arrancar=new Arrancar();
		cl.comprobar();
		ca.comprobar();
		comAsiento.comprobar();
		comEspejos.comprobar();
		
		arrancar.encender();
	}
	
	
	
	
}
