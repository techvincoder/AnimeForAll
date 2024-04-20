package manga;

import java.util.Scanner;

public class AnimeForAll {

	public static void main(String[] args) {
		
			System.out.println("======Welcome to AnimeForALL======");
			System.out.println();
			
			System.out.println("What would you like to do???");
			System.out.println();
			
			System.out.println("1.Create Account");
			System.out.println("2.Login");
			System.out.println("3.Use as Guest");
			System.out.println("4.Exit");
			System.out.println();
			
			Account acc = new Account();
			Scanner s = new Scanner(System.in);
			System.out.print("Enter your Choice: ");
			int a = s.nextInt();
			
			switch (a) {
			case 1: {
				acc.createAccount();
				break;
			}case 2:{
				acc.login();
				break;
			}case 3:{
				//Guest
				System.out.println();
				System.out.print("Enter your favourite Anime Character: ");
				String anime = s.next();
				Account guest = new Account(anime);
				System.out.println("This is your Guest ID: "+ guest);

				break;
			}case 4:{
				System.out.println("Thank you for your visiting us!!!");
				System.exit(0);
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + a);
				System.err.println("Invalid value entered!");
				main(null);
			}
			acc.showList();
			
			
			
			
		}

	}


