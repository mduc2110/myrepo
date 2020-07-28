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
	public void addMovie() {
		// TODO Auto-generated method stub
		
		
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
