package com.booking.servicesimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.booking.configuration.ConnectionFactory;
import com.booking.model.ShowListMovieModel;
import com.booking.services.ShowListMovieModelServices;

public class ShowListMovieModelServicesImpl implements ShowListMovieModelServices{
	private Connection connection = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	CallableStatement cs = null;
	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	@Override
	public void showListMovie(String day) {
		// TODO Auto-generated method stub
		List<ShowListMovieModel> list = new ArrayList<>();
		String query = "{call proc_search_movie(?)}";
		try {
			connection = getConnection();
			cs = connection.prepareCall(query);
			cs.setString(1, day);
			rs = cs.executeQuery();
			while(rs.next()) {
				ShowListMovieModel listItem = new ShowListMovieModel();
				listItem.setMovieDay(rs.getString("movie_day"));
				listItem.setMovieName(rs.getString("movie_name"));
				listItem.setTimeStart(rs.getString("time_start"));
				listItem.setTimeEnd(rs.getString("time_end"));
				listItem.setNameTheater(rs.getString("name_theater"));
				listItem.setSeatQuant(rs.getInt("seat_quant"));
				listItem.setHasPeople(rs.getInt("has_people"));
				list.add(listItem);
				for(int i = 0;i < list.size();i++) {
					System.out.println(i+"ten phim: "+list.get(i).getMovieName());
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}