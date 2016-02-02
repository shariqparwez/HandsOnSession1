package com.training.handson;

public class AC extends ChennaiRentals {

	public AC(long serialNumber, double price, String itemName, long rentDays, int quantity) {
		super(serialNumber, price, itemName, rentDays, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("Serial No. - " + this.getSerialNumber());
		System.out.println("Item Name - " + this.getItemName());
		System.out.println("RentDays - " + this.getRentDays());
		System.out.println("No. of Items - " + this.getQuantity());
		System.out.println("Price - " + this.getPrice());
		System.out.println(" ");
	}

}
