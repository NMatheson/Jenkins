package com.Calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator{

	@Test
	public void TestAddWithInteger(){
		
		Calculator calc = new Calculator();
		double sum = calc.add(2,5);
		
		assertEquals(7.0, sum, 0.0);
		
	}
	
	@Test
	public void TestSubWithNegative(){
		
		Calculator calc = new Calculator();
		double remainder = calc.subtract(5.0, 10.0);
		
		assertEquals(-5.0, remainder, 0.0);
	}
	
}