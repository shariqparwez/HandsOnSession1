package com.training.handson;

public abstract class ChennaiRentals {
	private long serialNumber = 100;
	private double price;
	private String itemName;
	private long rentDays;
	private int quantity;
	
	public ChennaiRentals(long serialNumber, double price, String itemName, long rentDays, int quantity) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.itemName = itemName;
		this.rentDays = rentDays;
		this.quantity = quantity;
	}

	
	public long getSerialNumber() {
		return serialNumber;
	}


	public double getPrice() {
		return price;
	}


	public String getItemName() {
		return itemName;
	}


	public long getRentDays() {
		return rentDays;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setSerialNumber(int sno){
		serialNumber = sno;
	}


	public abstract void getProductInfo();
}
