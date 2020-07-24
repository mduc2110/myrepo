package com.booking.model;

public class ShowListMovieModel {
	private String movieDay;
	private String movieName;
	private String timeStart;
	private String timeEnd;
	private String nameTheater;
	private int seatQuant;
	private int hasPeople;
	public ShowListMovieModel() {}
	public ShowListMovieModel(String movieDay, String movieName, String timeStart, String timeEnd, String nameTheater,
			int seatQuant, int hasPeople) {
		super();
		this.movieDay = movieDay;
		this.movieName = movieName;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.nameTheater = nameTheater;
		this.seatQuant = seatQuant;
		this.hasPeople = hasPeople;
	}
	public String getMovieDay() {
		return movieDay;
	}
	public void setMovieDay(String movieDay) {
		this.movieDay = movieDay;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getNameTheater() {
		return nameTheater;
	}
	public void setNameTheater(String nameTheater) {
		this.nameTheater = nameTheater;
	}
	public int getSeatQuant() {
		return seatQuant;
	}
	public void setSeatQuant(int seatQuant) {
		this.seatQuant = seatQuant;
	}
	public int getHasPeople() {
		return hasPeople;
	}
	public void setHasPeople(int hasPeople) {
		this.hasPeople = hasPeople;
	}
	
}
