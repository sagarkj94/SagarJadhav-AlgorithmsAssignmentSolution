package com.sortingassignment.company;

public class Company {
	
	double stockprice=0;
	boolean rise=true;
	public double getStockprice() {
		return stockprice;
	}
	public void setStockprice(double stockprice) {
		this.stockprice = stockprice;
	}
	public boolean isRise() {
		return rise;
	}
	public void setRise(boolean rise) {
		this.rise = rise;
	}
	public Company(double stockprice, boolean rise) {
		super();
		this.stockprice = stockprice;
		this.rise = rise;
	}
}
