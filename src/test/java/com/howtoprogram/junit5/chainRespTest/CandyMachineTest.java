package com.howtoprogram.junit5.chainRespTest;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.chainOfResp.GansitoImpl;
import com.howtoprogram.junit5.chainOfResp.ICandyMachine;
import com.howtoprogram.junit5.chainOfResp.LollypopImpl;
import com.howtoprogram.junit5.chainOfResp.NitoImpl;
import com.howtoprogram.junit5.chainOfResp.ProductosCandyMachine;

public class CandyMachineTest {

	@Test
	@DisplayName("validateCandyMachineTest")
	public void validateCandyMachineTest() {
		
		ICandyMachine c1=new GansitoImpl();
		ICandyMachine c2=new NitoImpl();
		ICandyMachine c3=new LollypopImpl();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		
		ProductosCandyMachine  productosMachine= new  ProductosCandyMachine (); 
		productosMachine.setMoney(1119);
		c1.dispense(productosMachine);
		
		System.out.println(String.format("Gansitos: %d", productosMachine.getGansitos()));
		System.out.println(String.format("Nitos: %d", productosMachine.getNitos()));
		System.out.println(String.format("Paletas: %d", productosMachine.getPaletas()));
		System.out.println(String.format("Money: %f",productosMachine.getMoney()));
	}
	
	
}
