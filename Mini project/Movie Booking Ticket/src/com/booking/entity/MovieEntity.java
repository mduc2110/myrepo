package com.booking.entity;

import java.sql.Time;
import java.util.Date;

public class MovieEntity {
	private int idMovie;
	private Time timeStart;
	private Time timeEnd;
	private Date movieDay;
	private int idTheater;
	private String movieName;
	public MovieEntity() {}
	public MovieEntity(int idMovie, Time timeStart, Time timeEnd, Date movieDay, int idTheater, String movieName) {
		super();
		this.idMovie = idMovie;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.movieDay = movieDay;
		this.idTheater = idTheater;
		this.movieName = movieName;
	}
	public int getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}
	public Time getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Time timeStart) {
		this.timeStart = timeStart;
	}
	public Time getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Time timeEnd) {
		this.timeEnd = timeEnd;
	}
	public Date getMovieDay() {
		return movieDay;
	}
	public void setMovieDay(Date movieDay) {
		this.movieDay = movieDay;
	}
	public int getIdTheater() {
		return idTheater;
	}
	public void setIdTheater(int idTheater) {
		this.idTheater = idTheater;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
}
