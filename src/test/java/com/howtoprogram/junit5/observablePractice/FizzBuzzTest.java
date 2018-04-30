package com.howtoprogram.junit5.observablePractice;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.ObservablePractice.FizzBuzz;

import io.reactivex.Observable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {
	
	@SuppressWarnings("unchecked")
	@Test
	@DisplayName("Testea el mi FizzBuzz")
	public void testFizzBuzz() {
		String [] colectRang15= {"1","2","FIZZ","4","BUZZ",
				           "FIZZ","7","8","FIZZ","BUZZ","11","FIZZ","13","14","FIZZBUZZ"};
        List colection15= Arrays.asList(colectRang15); 
		
		String [] colectRang20= {"1","2","FIZZ","4","BUZZ",
		           "FIZZ","7","8","FIZZ","BUZZ","11","FIZZ","13","14","FIZZBUZZ","16",
		           "17","FIZZ","19","BUZZ"};
		List colection20= Arrays.asList(colectRang20);
		
		
		 FizzBuzz fb=new FizzBuzz();
		 assertEquals(colection15,fb.fizzBuzz(1,15));
		 Observable.fromArray(fb.fizzBuzz(1,15)).subscribe(x -> System.out.println(x));
		 
		assertEquals(colection20, fb.fizzBuzz(1,20));
		Observable.fromArray(fb.fizzBuzz(1,20)).subscribe(x -> System.out.println(x));
	}
	
}
