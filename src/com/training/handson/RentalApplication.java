package com.training.handson;
import java.util.*;

public class RentalApplication {
	static int sno = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int days = 0;
		int quantity = 0;
		int price = 0;
		while(flag){
		System.out.println("What You Wanna Take on Rent?");
		System.out.println("1.Fan");
		System.out.println("2.Furniture");
		System.out.println("3.AC");
		System.out.println("4.Vessels");
		System.out.println("5.Exit");
		System.out.println("ENTER YOUR CHOICE - ");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			Fan[] fan = {};
			price = 250;
			System.out.println("Number of Days? - ");
			days = sc.nextInt();
			System.out.println("Quantity? - ");
			quantity = sc.nextInt();
			fan = new Fan[quantity];
			for(int i=0;i<quantity;i++)
			{
				fan[i] = new Fan(sno,price,"Fan",days,quantity);
				sno++;
				fan[i].getProductInfo();
				if(i==(quantity-1)){
					System.out.println("TOTAL COST : " + price*quantity*days);
				}
			}
		}
		else if(ch==2)
		{
			Furniture[] furniture = {};
			price = 450;
			System.out.println("Number of Days? - ");
			days = sc.nextInt();
			System.out.println("Quantity? - ");
			quantity = sc.nextInt();
			furniture = new Furniture[quantity];
			for(int i=0;i<quantity;i++)
			{
				furniture[i] = new Furniture(sno,price,"Fan",days,quantity);
				sno++;
				furniture[i].getProductInfo();
				if(i==(quantity-1)){
					System.out.println("TOTAL COST : " + price*quantity*days);
				}
			}
		}
		else if(ch==3)
		{
			AC[] ac = {};
			price = 2000;
			System.out.println("Number of Days? - ");
			days = sc.nextInt();
			System.out.println("Quantity? - ");
			quantity = sc.nextInt();
			ac = new AC[quantity];
			for(int i=0;i<quantity;i++)
			{
				ac[i] = new AC(sno,price,"Fan",days,quantity);
				sno++;
				ac[i].getProductInfo();
				if(i==(quantity-1)){
					System.out.println("TOTAL COST : " + price*quantity*days);
				}
			}
		}
		else if(ch==4)
		{
			Vessels[] vessel = {};
			price = 150;
			System.out.println("Number of Days? - ");
			days = sc.nextInt();
			System.out.println("Quantity? - ");
			quantity = sc.nextInt();
			vessel = new Vessels[quantity];
			for(int i=0;i<quantity;i++)
			{
				vessel[i] = new Vessels(sno,price,"Fan",days,quantity);
				sno++;
				vessel[i].getProductInfo();
				if(i==(quantity-1)){
					System.out.println("TOTAL COST : " + price*quantity*days);
				}
			}
		}
		}
	}

}
