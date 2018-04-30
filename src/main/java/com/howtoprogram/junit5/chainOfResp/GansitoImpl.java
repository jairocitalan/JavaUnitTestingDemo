package com.howtoprogram.junit5.chainOfResp;

public class GansitoImpl extends ACandiesMachine {
	private ICandyMachine chain;
	private double price=22;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain=nextChain;
		
	}

	@Override
	public void dispense(ProductosCandyMachine productoCandyMachine) {
		
		int gansitos=0;
		double money= productoCandyMachine.getMoney();
		while(money >= price) {
			money-=this.price;
			gansitos++;
		}
		
		productoCandyMachine.setGansitos(gansitos);
		productoCandyMachine.setMoney(money);
		
		if(this.chain != null ) {
			this.chain.dispense(productoCandyMachine);
		}
		 
		
	}

}
