package com.booking.entity;

public class TheaterEntity {
	private int idTheater;
	private int seatQuant;
	private int state;
	private String nameTheater;
	public TheaterEntity() {}
	public TheaterEntity(int idTheater, int seatQuant, int state, String nameTheater) {
		super();
		this.idTheater = idTheater;
		this.seatQuant = seatQuant;
		this.state = state;
		this.nameTheater = nameTheater;
	}
	public int getIdTheater() {
		return idTheater;
	}
	public void setIdTheater(int idTheater) {
		this.idTheater = idTheater;
	}
	public int getSeatQuant() {
		return seatQuant;
	}
	public void setSeatQuant(int seatQuant) {
		this.seatQuant = seatQuant;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getNameTheater() {
		return nameTheater;
	}
	public void setNameTheater(String nameTheater) {
		this.nameTheater = nameTheater;
	}
	
}
