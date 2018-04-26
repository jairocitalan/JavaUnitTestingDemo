package com.howtoprogram.junit5;

public class Calculator {
	
	public int sumar(int num1,int num2) {
		return num1+num2;
	}
	
	public int restar(int num1,int num2) {
		return num1-num2;
	}
	
	public int dividir(int num1,int num2) {
		int res=0;
		
		res = num2!=0 ? res=num1/num2 : res; 
			
		return res;
		
	}
	
	public int multiplicar(int num1,int num2) {
		return num1*num2;
	}

}
