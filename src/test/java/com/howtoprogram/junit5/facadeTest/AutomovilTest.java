package com.howtoprogram.junit5.facadeTest;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.facade.AutomovilFacade;

public class AutomovilTest {

	@Test
	@DisplayName("Encender Auto")
	public void encenderAuto() {
		AutomovilFacade autoFacade=new AutomovilFacade();
		autoFacade.arrancar();
	}
	
}
