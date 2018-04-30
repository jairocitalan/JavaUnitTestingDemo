package com.howtoprogram.junit5.chainOfResp;

public class LollypopImpl implements ICandyMachine{
	private ICandyMachine chain;
	private double price=1;
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain=nextChain;
		
	}

	@Override
	public void dispense(ProductosCandyMachine productoCandyMachine) {

		int paletas=0;
		double money= productoCandyMachine.getMoney();
		while(money >= price) {
			money-=this.price;
			paletas++;
		}
		
		productoCandyMachine.setPaletas(paletas);;
		productoCandyMachine.setMoney(money);
		
		if(this.chain != null ) {
			this.chain.dispense(productoCandyMachine);
		}
		 
		
	}

}
