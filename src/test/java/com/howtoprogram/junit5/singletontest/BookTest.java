package com.howtoprogram.junit5.singletontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class BookTest {

	@Test
	@DisplayName("sigleton TestOne")
	public void sigletonTestOne() {
		Book b=Book.getInstance();
		b.setNombre("jairo");
		assertEquals("jairo", b.getNombre());
		
		Book b2=Book.getInstance();
		b.setNombre("alberto");
		assertEquals("alberto", b2.getNombre());
		
		Book b3=Book.getInstance();
		b.setNombre("jose");
		assertEquals("jose", b3.getNombre());
	}
	
	
}
