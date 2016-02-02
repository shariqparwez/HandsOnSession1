package com.training.handson;

import java.util.*;

public class TaxWhizApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		TaxWhiz taxWhiz = new TaxWhiz();
		
		System.out.println("Enter purchase amount : ");
		double purchase = 0.0;
		purchase = sc.nextDouble();
		
		System.out.println("Salex Tax : " + taxWhiz.calcTax(purchase));
		sc.close();
	}

}
