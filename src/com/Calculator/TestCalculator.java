package com.Calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator{

	@Test
	public void testAddWithInteger(){
		
		Calculator calc = new Calculator();
		double sum = calc.add(2,5);
		
		assertEquals(7.0, sum);
		
	}
	
	@Test
	public void testSubWithNegative(){
		
		Calculator calc = new Calculator();
		double remainder = calc.subtract(5.0, 10.0);
		
		assertEquals(-5.0, remainder);
	}
	
}