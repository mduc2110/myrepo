import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.booking.entity.AccountEntity;
import com.booking.entity.BookingEntity;
import com.booking.entity.MovieTimeEntity;
import com.booking.entity.TheaterEntity;
import com.booking.model.ShowListMovieModel;
import com.booking.model.TheaterTimeSlotModel;
import com.booking.repository.AccountRepository;
import com.booking.repository.BookingRepository;
import com.booking.repository.MovieRepository;
import com.booking.repository.MovieTimeRepository;
import com.booking.repository.PriceRepository;
import com.booking.repository.TheaterRepository;
import com.booking.repositoryimpl.AccountRepositoryImpl;
import com.booking.repositoryimpl.BookingRepositoryImpl;
import com.booking.repositoryimpl.MovieRepositoryImpl;
import com.booking.repositoryimpl.MovieTimeRepositoryImpl;
import com.booking.repositoryimpl.PriceRepositoryImpl;
import com.booking.repositoryimpl.TheaterRepositoryImpl;
import com.booking.services.BookingDetailServices;
import com.booking.services.ShowListMovieServices;
import com.booking.services.TheaterTimeSlotServices;
import com.booking.servicesimpl.BookingDetailServicesImpl;
import com.booking.servicesimpl.ShowListMovieServicesImpl;
import com.booking.servicesimpl.TheaterTimeSlotServicesImpl;

public class Main {
	static int idUser;
	static int age;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to movie ticket booking.");
		System.out.println("1. Sign in | 2. Sign up");
		String sign;
		boolean flag;
		do {
			String digit = "\\d";
			System.out.print("Your input: ");
			sign = scanner.next();
			flag = sign.matches(digit);
			if (!flag) System.out.println("You must enter a number!");
		}while(!flag || Integer.parseInt(sign) < 1 || Integer.parseInt(sign) > 2);
		switch(Integer.parseInt(sign)) {
			case 1:
				AccountRepository accountRep = new AccountRepositoryImpl();
				AccountEntity accountEntity = new AccountEntity();
				String username;
				String password;
				do {
					System.out.print("Input username: ");
					username = scanner.next();
					System.out.print("Input password: ");
					password = scanner.next();
					accountEntity = accountRep.checkAccount(username, password);
					System.out.println(accountEntity.getNameOfUser());
				} while(accountEntity.getUsername() == null);

				idUser = accountEntity.getIdUser();
				age = accountEntity.getAge();
				switch(accountEntity.getRole()) {
					case "user":
						userInterface();
						break;
					case "admin":
						adminInterface();
						break;
				}
				break;
			case 2:
				
				break;
		}
		scanner.close();
	}
	//user interface
	public static void userInterface() {
		Scanner scanner = new Scanner(System.in);
		//1
		ShowListMovieServices showListMovieServices = new ShowListMovieServicesImpl();
		List<ShowListMovieModel> listMovie = new ArrayList<>();
		List<String> listSeat = new ArrayList<>();
		String seatPosition;
		BookingRepository bookingRepository = new BookingRepositoryImpl();
		BookingDetailServices bookingDetailServices = new BookingDetailServicesImpl();
		String function;
		boolean transaction = true;
		while(transaction) {
			boolean flag;
			System.out.println("=======================================================");
			System.out.println("1.Booking || 2. Change pass || 3.View history || 4.Exit");
			do {
				System.out.print("Choose: ");
				function = scanner.next();
				String digit = "\\d";
				flag = function.matches(digit);
				if (!flag) System.out.println("You must enter a number!");
			}while(!flag || Integer.parseInt(function) < 1 || Integer.parseInt(function) > 4);
			switch(Integer.parseInt(function)) {
				case 1:
					System.out.println("Input day: ");
					String day = scanner.next();
					int idBooking = 0;
					listMovie = showListMovieServices.showListMovie(day);
					for(int i = 0;i < listMovie.size();i++) {
						System.out.printf("%d. %s",i+1,listMovie.get(i).toString());
						System.out.println();
					}
					System.out.print("Choose film with compatible number: ");
					int film = scanner.nextInt();
					showListMovieServices.showSeatPosition(listMovie.get(film-1).getIdMovie());
					listSeat = showListMovieServices.getSeatList(listMovie.get(film-1).getIdMovie());
					do {
						System.out.print("Choose seat (Ex. F5): ");
						seatPosition = scanner.next();
					}while(listSeat.contains(seatPosition));
					
					BookingEntity bookingEntity = new BookingEntity();
					bookingEntity.setIdUser(idUser);
					bookingEntity.setIdMovie(listMovie.get(film-1).getIdMovie());
					bookingEntity.setSeatPosition(seatPosition);
					if(age > 20) bookingEntity.setIdPrice(2);
					else if(age < 20) bookingEntity.setIdPrice(1);
					idBooking = bookingRepository.addBooking(bookingEntity);
					System.out.println("idbooking: "+idBooking);
					bookingDetailServices.printReceipt(idBooking);
					break;
				case 2:
					break;
				case 3:
					System.out.println("Your list booking history!");
					bookingDetailServices.showListBookingHistory(idUser);
					break;
				case 4:
					System.exit(0);
					break;
			}
			System.out.println("Ban co muon tiep tuc? Y/N");
            String cont = scanner.next();
            if(cont.equalsIgnoreCase("Y")){
            	transaction = true;
            }
            else{
            	transaction = false;
            }
		}
		
		scanner.close();
	}
	//admin interface
	public static void adminInterface() {
		Scanner scanner = new Scanner(System.in);
		int function;
		System.out.println("==============================================");
		System.out.println("1.Movie || 2. User || 3.Ticket price || 4.Exit");
		do {
			System.out.print("Choose: ");
			function = scanner.nextInt();
		}while(function > 5 && function < 0);
		switch(function) {
			case 1:
				System.out.println("====================Movie========================");
				System.out.println("1.Add || 2. Delete || 3.Edit || 4. View || 5.Exit");
				String movieFunction;
				boolean flagMovie;
				do {
					System.out.print("Choose: ");
					movieFunction = scanner.next();
					String digit = "\\d";
					flagMovie = movieFunction.matches(digit);
					if (!flagMovie) System.out.println("You must enter a number!");
				}while(!flagMovie || Integer.parseInt(movieFunction) < 1 || Integer.parseInt(movieFunction) > 6);
				switch(Integer.parseInt(movieFunction)) {
					case 1:
						String movieName;
						String movieDay;
						int idTheater;
						int idTimeSlot;
						TheaterRepository theaterRepository = new TheaterRepositoryImpl();
						MovieTimeRepository movieTimeRepository = new MovieTimeRepositoryImpl();
						TheaterTimeSlotServices theaterTimeSlotServices = new TheaterTimeSlotServicesImpl();
						MovieRepository movieRepository = new MovieRepositoryImpl();
						List<MovieTimeEntity> listMovieTime = new ArrayList<>();
						List<TheaterTimeSlotModel> listTheaterTimeSlot = new ArrayList<>();
						List<Integer> listTheaterName = new ArrayList<>();
						
						System.out.print("Input name of movie: ");
						scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
						movieName = scanner.nextLine();
						
						System.out.print("Input day (YYYY/MM/DD): ");
						movieDay = scanner.next();
						listTheaterTimeSlot = theaterTimeSlotServices.getEmptyTimeSlot(movieDay);
						listTheaterName = theaterTimeSlotServices.getAvailableTheater();
						
						System.out.print("Input compatible theater number: ");
						idTheater = scanner.nextInt();
						//listMovieTime = movieTimeRepository.findAll();
						listTheaterTimeSlot = theaterTimeSlotServices.getAvailableTimeSlot(listTheaterName.get(idTheater-1));
						System.out.print("Input compatible time number: ");
						idTimeSlot = scanner.nextInt();
						movieRepository.addMovie(movieDay, idTheater, movieName, idTimeSlot);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
				}
				break;
			case 2:
				break;
			case 3:
				PriceRepository priceRepository = new PriceRepositoryImpl();
				System.out.println("====================Price=========================");
				System.out.println("1.Add || 2. Delete || 3.Edit || 4. Apply || 5.Exit");
				int priceFunction = scanner.nextInt();
				switch(priceFunction) {
					case 1:
						List<TheaterEntity> listTheater = new ArrayList<>();
						priceRepository.findAll();
						for(int i = 1; i <= listTheater.size();i++) {
							System.out.println(i+". Theater: "+listTheater.get(i-1).getTheaterName()+
									" Seat row: "+listTheater.get(i-1).getRowQuant()+
									" Seat col: "+listTheater.get(i-1).getColQuant());
						}
						System.out.println(listTheater.size());
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
				}
				break;
			case 4:
				break;
		}
		scanner.close();
	}
	public static boolean validateInputString(String s) {
	     if (s == null || s.trim().isEmpty()) {
	         System.out.println("Incorrect format of string");
	         return false;
	     }
	     Pattern p = Pattern.compile("[^A-Za-z0-9]");
	     Matcher m = p.matcher(s);
	    // boolean b = m.matches();
	     boolean b = m.find();
	     if (b == true)
	        return false;
	     else
	    	 return true;
	 }
	public static boolean validateInputInt(String s) {
	     if (s == null || s.trim().isEmpty()) {
	         System.out.println("Incorrect format of string");
	         return false;
	     }
	     Pattern p = Pattern.compile("[^0-9]");
	     Matcher m = p.matcher(s);
	    // boolean b = m.matches();
	     boolean b = m.find();
	     if (b == true)
	        return false;
	     else
	    	 return true;
	 }
}
