package manga;

import java.util.Scanner;

public class Account extends Object {
	private String username;
	private String password;
	private String email;
	private long mobile;
	private String anime;
	
	public Account(String anime) {
		this.anime = anime;
	}
	
	@Override
	public String toString() {
		return anime + hashCode();
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername(String username) {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword(String password) {
		if(this.password.equals(password)) {
			return password;
		} else {
			return "Password does not Match";
		}
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobile() {
		return mobile;
	}
	public boolean isValidate(long mobile) {
		return mobile>999999999 && mobile < 10000000000L;
	}
	
	public void setMobile() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your mobile no: ");
		long mobile = s.nextLong();
		if(isValidate(mobile)) {
			this.mobile = mobile;
		} else {
			System.err.println("Invalid mobile no");
			setMobile();
		}
	}
	
	
	//Registration
	public void createAccount() {
		
		System.out.println();
		System.out.println("------Registration Page------");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Create username: ");
		setUsername(s.next());
		
		System.out.print("Create Password: ");
		setPassword(s.next());
		
		System.out.print("Enter your Email: ");
		setEmail(s.next());
		
		setMobile();
		
		System.out.println("Account Created Successfully...");
		login();
		
	}
	
	//Login 
	public void login() {
		System.out.println();
		Scanner s = new Scanner(System.in);
		if(this.username== null && this.password == null) {
			System.err.println("Account not created yet....");
			System.out.println();
			
			System.out.println("1.Create Account");
			System.out.println("2.Use as Guest");
			System.out.println("3.Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int a = s.nextInt();
			switch (a) {
			case 1: {
				createAccount();
				break;
			} case 2:{
				login();
				break;
			} case 3:{
				System.exit(0);
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + a);
			}	
		} else {
			System.out.println();
			System.out.println("------LOGIN PAGE------");
			System.out.println();
			
			System.out.print("Enter your username: ");
			String username = s.next();
			
			System.out.print("Enter your password: ");
			String password = s.next();
			
			if(!this.username.equals(username) && !this.password.equals(password)) {
				System.err.println("Invalid Credentials");
				login();
			} else if(!this.username.equals(username)) {
				System.err.println("Invalid Username");
				login();
			} else if(!this.password.equals(password)) {
				System.err.println("Invalid Password");
				login();
			} else {
				
				System.out.println("Account Logged in Successfully");
			}
		}
	}
	
	
	
	
	//Show List 
	public void showList() {
		System.out.println();
		System.out.println("What would you like to do??");
		
		System.out.println("1.Anime");
		System.out.println("2.Manga");
		System.out.println("3.Manhwa");
		System.out.println("4.Exit");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		switch (a) {
		case 1: {
			//Anime
			Anime anime = new Anime();
			anime.showList();
			break;
		} case 2:{
			//Manga
			Manga manga = new Manga();
			manga.showList();
			break;
		} case 3: {
			//Manhwa
			Manhwa manhwa = new Manhwa();
			manhwa.showList();
			break;
		} case 4:{
			System.out.println("!!!!! Thank You for visiting us !!!!!");
			System.exit(0);
		}
		default:
			System.out.println();
			System.err.println("Invalid input entered...");
			showList();
			
		}
	}
	
	
	
}
