import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.booking.entity.AccountEntity;
import com.booking.repository.AccountRepository;
import com.booking.repositoryimpl.AccountRepositoryImpl;
import com.booking.services.ShowListMovieModelServices;
import com.booking.servicesimpl.ShowListMovieModelServicesImpl;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to movie ticket booking.");
		System.out.println("Input 1 for sign in");
		System.out.println("Input 2 for sign up");
		int sign = scanner.nextInt();
		switch(sign) {
			case 1:
				AccountRepository accountRep = new AccountRepositoryImpl();
				AccountEntity accountEntity = new AccountEntity();
				do {
					System.out.print("Input username: ");
					String username = scanner.next();
					System.out.print("Input password: ");
					String password = scanner.next();
					accountEntity = accountRep.checkAccount(username, password);
					System.out.println(accountEntity.getNameOfUser());
				} while(accountEntity.getUsername() == null);
				switch(accountEntity.getRole()) {
					case "user":
						userInterface();
						break;
					case "admin":
						break;
				}

				
				
				break;
			case 2:
				
				break;
		}
		scanner.close();
	}
	public static void userInterface() {
		Scanner scanner = new Scanner(System.in);
		int function;
		System.out.println("=======================================================");
		System.out.println("1.Booking || 2. Change pass || 3.View history || 4.Exit");
		do {
			System.out.print("Choose: ");
			function = scanner.nextInt();
		}while(function > 5 && function < 0);
		switch(function) {
			case 1:
				System.out.println("Input day: ");
				String day = scanner.next();
				ShowListMovieModelServices ss = new ShowListMovieModelServicesImpl();
				ss.showListMovie(day);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
		}
	}
}