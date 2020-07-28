package com.booking.services;

import java.util.List;

import com.booking.model.ShowListMovieModel;

public interface ShowListMovieServices {
	List<ShowListMovieModel> showListMovie(String day);
	void showSeatPosition(int id);
	List<String> getSeatList(int id);
}
