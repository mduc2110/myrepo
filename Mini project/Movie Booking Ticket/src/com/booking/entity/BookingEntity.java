package com.booking.entity;

public class BookingEntity {
	private int idBooking;
	private int ticketQuant;
	private int idUser;
	private int idMovie;
	private int idPrice;
	private int id_seat;
	public BookingEntity() {}
	public BookingEntity(int idBooking, int ticketQuant, int idUser, int idMovie, int idPrice, int id_seat) {
		super();
		this.idBooking = idBooking;
		this.ticketQuant = ticketQuant;
		this.idUser = idUser;
		this.idMovie = idMovie;
		this.idPrice = idPrice;
		this.id_seat = id_seat;
	}
	public int getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}
	public int getTicketQuant() {
		return ticketQuant;
	}
	public void setTicketQuant(int ticketQuant) {
		this.ticketQuant = ticketQuant;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}
	public int getIdPrice() {
		return idPrice;
	}
	public void setIdPrice(int idPrice) {
		this.idPrice = idPrice;
	}
	public int getId_seat() {
		return id_seat;
	}
	public void setId_seat(int id_seat) {
		this.id_seat = id_seat;
	}
	
}