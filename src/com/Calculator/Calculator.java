package com.Calculator;

public class Calculator {

  private double x,y;

  public Calculator(double x, double y) {
	  this.x = x;
	  this.y = y;
  }

  public double add(double x, double y) {
	  double sum = x + y;
	  return sum;
  }
  
  public double subtract(double x, double y){
	  double remainder = x - y;
	  return remainder;
  }
  
  public double multiply(double x, double y){
	  double product = x * y;
	  return product;
  }
  
  public double divide(double x, double y){
	  double quotient = x/y;
	  return quotient;
  }

}