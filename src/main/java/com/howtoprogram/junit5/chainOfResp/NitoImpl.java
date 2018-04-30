package com.howtoprogram.junit5.chainOfResp;

public class NitoImpl implements ICandyMachine {
    private ICandyMachine chain;
    private double price=11;
    
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain=nextChain;
		
	}

	@Override
	public void dispense(ProductosCandyMachine productoCandyMachine) {

		int nitos=0;
		double money= productoCandyMachine.getMoney();
		while(money >= price) {
			money-=this.price;
			nitos++;
		}
		
		productoCandyMachine.setNitos(nitos);
		productoCandyMachine.setMoney(money);
		
		if(this.chain != null ) {
			this.chain.dispense(productoCandyMachine);
		}
		 
		
	}

}
