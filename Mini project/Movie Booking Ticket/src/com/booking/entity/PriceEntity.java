package com.booking.entity;

public class PriceEntity {
	private int idPrice;
	private int price;
	public PriceEntity() {}
	public PriceEntity(int idPrice, int price) {
		super();
		this.idPrice = idPrice;
		this.price = price;
	}
	public int getIdPrice() {
		return idPrice;
	}
	public void setIdPrice(int idPrice) {
		this.idPrice = idPrice;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
