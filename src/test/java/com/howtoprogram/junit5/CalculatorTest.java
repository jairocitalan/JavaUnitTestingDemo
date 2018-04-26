package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {
	  private Calculator cr=new Calculator();
	  
	  @Test
	  @DisplayName("Test Calculator Sumar")
	  public void testCalculatorSuma() {
      assertEquals(50,cr.sumar(20, 30));  	  
	  }
	  
	  @Test
	  @DisplayName("Test Calculator Restar")
	   public void testCalculatorResta() {
		  assertEquals(10, cr.restar(30, 20));
	  }
	  
	  @Test
	  @DisplayName("Test Calculator Dividir")
	  public void testCalculatorDividir() {
		  int v=cr.dividir(9, 3);
		  assertEquals(3, v );
		  System.out.println(v);
	  }
	  
	  @Test
	  @DisplayName("Test Calculator Multiplicar")
	  public void testCalculatorMultiplicar() {
		  assertEquals(90, cr.multiplicar(30, 3));
	  }
	  
	  @Test
	  @DisplayName("Test con Mokito")
	  public void testCalculatorMokito() {
		  Calculator cal=mock(Calculator.class);
		  when(cal.sumar(5, 2)).thenReturn(7);
		  assertEquals(6, cal.sumar(3, 3));
		  
		  when(cal.restar(4, 5)).thenReturn(9);
		  assertEquals(8, cal.restar(4,4));
		  
		  when(cal.dividir(30, 3)).thenReturn(10);
		  assertEquals(6, cal.dividir(12, 2));
		  
		  when (cal.multiplicar(5, 5)).thenReturn(25);
		  assertEquals(60,cal.multiplicar(30, 2));
			
		  
		  
	  }
	  
}
