package com.booking.entity;

public class SeatEntity {
	private int idSeat;
	private int idTheater;
	private String seatRow;
	private int seatCol;
	private int state;
	public SeatEntity() {}
	public SeatEntity(int idSeat, int idTheater, String seatRow, int seatCol, int state) {
		super();
		this.idSeat = idSeat;
		this.idTheater = idTheater;
		this.seatRow = seatRow;
		this.seatCol = seatCol;
		this.state = state;
	}
	public int getIdSeat() {
		return idSeat;
	}
	public void setIdSeat(int idSeat) {
		this.idSeat = idSeat;
	}
	public int getIdTheater() {
		return idTheater;
	}
	public void setIdTheater(int idTheater) {
		this.idTheater = idTheater;
	}
	public String getSeatRow() {
		return seatRow;
	}
	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}
	public int getSeatCol() {
		return seatCol;
	}
	public void setSeatCol(int seatCol) {
		this.seatCol = seatCol;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
