package com.booking.repository;


public interface MovieRepository {
	void addMovie(String day, int idTheater, String movieName, int idTimeSlot);
	void updateMovie(int idMovie);
	void deleteMovie(int idMovie);
}
