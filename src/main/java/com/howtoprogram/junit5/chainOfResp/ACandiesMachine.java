package com.howtoprogram.junit5.chainOfResp;

public abstract class ACandiesMachine {
   
	abstract void setNextChain(ICandyMachine nextchain) ;
	 
	abstract void dispense(ProductosCandyMachine productoCandyMachine);
	
    public int  realizarCompra(int producto,ProductosCandyMachine productoCandyMachine,double price) {

		int producto=0;
		double money= productoCandyMachine.getMoney();
		while(money >= price) {
			money-=this.price;
			producto++;
		}
		
		productoCandyMachine.setGansitos(gansitos);
		productoCandyMachine.setMoney(money);
    }
		
}
