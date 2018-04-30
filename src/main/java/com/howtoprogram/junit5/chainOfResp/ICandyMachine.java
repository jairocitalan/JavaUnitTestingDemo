package com.howtoprogram.junit5.chainOfResp;

public interface ICandyMachine {
     
	 void setNextChain(ICandyMachine nextchain) ;
	 
	 void dispense(ProductosCandyMachine productoCandyMachine);
	 
	
}
