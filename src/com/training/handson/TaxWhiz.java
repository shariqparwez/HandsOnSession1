package com.training.handson;

public class TaxWhiz {
	private double taxRate;

	public TaxWhiz() {
		super();
		taxRate = 12.5;
		// TODO Auto-generated constructor stub
	}
	
	public double calcTax(double purchase){
		return ((purchase * taxRate)/100);
	}
}
