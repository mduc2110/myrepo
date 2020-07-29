package com.booking.repositoryimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.booking.configuration.ConnectionFactory;
import com.booking.repository.MovieRepository;

public class MovieRepositoryImpl implements MovieRepository{
	Scanner scanner = new Scanner(System.in);
	private Connection connection = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	private CallableStatement cs = null;
	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}
	@Override
	public void addMovie(String day, int idTheater, String movieName, int idTimeSlot) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO movie(movie_day, id_theater, movie_name, id_movtime) VALUES (?,?,?,?)";
		//update seatstate here
		try {
			connection = getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, day);
			stmt.setInt(2, idTheater);
			stmt.setString(3, movieName);
			stmt.setInt(4, idTimeSlot);
			int i = stmt.executeUpdate();
			if(i > 0) {
				System.out.println("Add movie successfully");
			}else {
				System.err.println("Fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}

	@Override
	public void updateMovie(int idMovie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMovie(int idMovie) {
		// TODO Auto-generated method stub
		
	}

}
