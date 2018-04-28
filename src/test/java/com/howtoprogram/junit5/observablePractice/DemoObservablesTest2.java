package com.howtoprogram.junit5.observablePractice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.ObservablePractice.DemoObservables;
import com.howtoprogram.junit5.ObservablePractice.DemoObservables2;

public class DemoObservablesTest2 {

	Integer[] arrNumbers= {1,5,10,20};
	
	@Test
	@DisplayName("should Greater Than Ten")
	public void shouldGreaterThanTen() {
		Integer[] listExpect= {20};
		Integer[] result=DemoObservables2.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpect, result);
	} 
	
	
	

	  
	
}
