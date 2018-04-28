package com.howtoprogram.junit5.observablePractice;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.ObservablePractice.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {
	
	@Test
	@DisplayName("Testea el mi FizzBuzz")
	public void testFizzBuzz() {
		String [] colectRang15= {"1","2","Fizz","4","Buzz",
				           "Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		
		String [] colectRang20= {"1","2","Fizz","4","Buzz",
		           "Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz","16",
		           "17","18","19","Buzz"};
		
		FizzBuzz fb = mock(FizzBuzz.class);
		 when(fb.fizzBuzz(15)).thenReturn(colectRang15);
		 assertEquals(colectRang15, fb.fizzBuzz(15));
		 
		 when(fb.fizzBuzz(20)).thenReturn(colectRang20);
		 assertEquals(colectRang20, fb.fizzBuzz(20));
	}
	
	@Test
	public void Prueba() {
		String [] colectRang20= {"1","2","Fizz","4","Buzz",
		           "Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz","16",
		           "17","Fizz","19","Buzz"};
		FizzBuzz fizzBuzz = new FizzBuzz();
		String[] res = fizzBuzz.fizzBuzz(20);
		assertArrayEquals(colectRang20, res);
	}

}
