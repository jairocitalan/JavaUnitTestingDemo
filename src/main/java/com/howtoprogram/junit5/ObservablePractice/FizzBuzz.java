package com.howtoprogram.junit5.ObservablePractice;

public class FizzBuzz {

	public String[] fizzBuzz(int rango) {
		String [] colect= new String[rango];
		for(int i=1;i<=rango;i++) {
			
			if(i % 3 == 0) {
				colect[i-1]="Fizz";
			  }
			
			else if(i % 5 == 0) {
				colect[i-1]="Buzz";
			}
			
			else if(i % 3 == 0 && i % 5 == 0) {
				colect[i-1]="FizBuzz";
			}
			
			else {
				colect[i-1]=String.valueOf(i);
			}
			
		}
		
		return colect;
	}
	
}
