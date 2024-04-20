package manga;
import java.util.*;

public class Anime extends Account {
	
		HashMap<String, AnimeDetails> animeDetailsMap = new HashMap();
		
		public void addAnimeDetails(String title, AnimeDetails details) {
	        animeDetailsMap.put(title, details);
	    }
		
		private void displayAnimeDetails(String animeTitle) {
	        AnimeDetails details = animeDetailsMap.get(animeTitle);
	        if (details != null) {
	        	System.out.println();
	            System.out.println("Title: " + animeTitle);
	            System.out.println("Description: " + details.getDescription());
	            System.out.println("Release Year: " + details.getReleaseYear());
	            System.out.println("Studio: "+ details.getStudio());
	            System.out.println("Rating: "+ details.getRating());
	            // Add other details as needed
	        } else {
	            System.out.println("Anime details not found.");
	        }
	    }
		
		//showListAnime....instead Overriden(method overriding- polymorphism)
		
		@Override
		public void showList() {
			System.out.println();
			System.out.println("What is your favourite Genre???");
			System.out.println();
			
			System.out.println("1.Kodomomuke(Kids)");
			System.out.println("2.Shonen(Teens)");
			System.out.println("3.Seinen(Adult)");
			System.out.println("4.Sports");
			System.out.println("5.Go Back to previous menu");
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			int a = s.nextInt();
			
			switch (a) {
			case 1: {
				kodomomuke();
				break;
			} case 2:{
				shonen();
				break;
			} case 3:{
				seinen();
				break;
			} case 4:{
				sports();
				break;
			} case 5:{
				super.showList();
				break;
			}
			default:
				System.err.println("Invalid Value Entered");
				showList();
			}
			
			
		}
		public void kodomomuke() {
			System.out.println();
			System.out.println("1.Doraemon");
			System.out.println("2.Pokemon");
			System.out.println("3.Digimon Adventure");
			System.out.println("4.Beyblade");
			System.out.println("5.Detective Conan");
			System.out.println("6.Go Back to Previous Menu");
			
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter your choice: ");
			int a = s.nextInt();
			switch (a) {
            case 1: {
                // Add anime details for Doraemon
                AnimeDetails doraemonDetails = new AnimeDetails("Doraemon",
                        "Doraemon is a Japanese manga series written and illustrated by Fujiko F. Fujio. " +
                                "The series has also been adapted into a successful anime series and media franchise.",
                        2005, "Studio X", "G");
                addAnimeDetails("Doraemon", doraemonDetails);
                displayAnimeDetails("Doraemon");
                break;
            } case 2: {
                // Add anime details for Pokemon
                AnimeDetails pokemonDetails = new AnimeDetails("Pokemon",
                        "Pokemon follows the journey of Pokemon Trainer Ash Ketchum and his friends as they " +
                                "travel through various regions, meet new Pokemon, and strive to become Pokemon Masters.",
                        1997, "Studio Y", "B");
                addAnimeDetails("Pokemon", pokemonDetails);
                displayAnimeDetails("Pokemon");
                break;
            } case 3: {
                // Add anime details for Digimon Adventure
                AnimeDetails digimonDetails = new AnimeDetails("Digimon Adventure",
                        "Digimon Adventure follows a group of children and their Digimon companions as they " +
                                "embark on a journey to save the Digital World from various threats.",
                        1999, "Studio Z", "E");
                addAnimeDetails("Digimon Adventure", digimonDetails);
                displayAnimeDetails("Digimon Adventure");
                break;
            } case 4: {
                // Add anime details for Beyblade
                AnimeDetails beybladeDetails = new AnimeDetails("Beyblade",
                        "Beyblade revolves around spinning top battles between Bladers who use powerful " +
                                "spinning tops to compete in tournaments and battles.",
                        2001, "Studio W", "B");
                addAnimeDetails("Beyblade", beybladeDetails);
                displayAnimeDetails("Beyblade");
                break;
            } case 5: {
                // Add anime details for Detective Conan
                AnimeDetails detectiveConanDetails = new AnimeDetails("Detective Conan",
                        "Detective Conan follows high school detective Shinichi Kudo, who is transformed " +
                                "into a child after being poisoned. He continues to solve cases while searching for a cure.",
                        1996, "Studio V", "B");
                addAnimeDetails("Detective Conan", detectiveConanDetails);
                displayAnimeDetails("Detective Conan");
                break;
            } case 6: {
                // Go back to the previous menu
            	showList();
                break;
            }
            default:
                System.err.println("Invalid Value Entered");
                showList();
        }
			System.out.println();
			System.out.println("What would you like to do next??");
			System.out.println("1.View more Kodomomuke Animes");
			System.out.println("2.Choose Different Genre");
			System.out.println("3.Want to read Manga/Manhwa");
			System.out.println("4.Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int p = s.nextInt();
			
			if(p ==1) {
				kodomomuke();
			} else if(p==2) {
				showList();
			} else if(p==3) {
				super.showList();
			} else {
				System.out.println();
				System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
				System.exit(0);
			}
		}
		
		public void shonen() {
			System.out.println();
			System.out.println("1.One Piece");
			System.out.println("2.Naruto");
			System.out.println("3.Dragon Ball series");
			System.out.println("4.Bleach");
			System.out.println("5.Hunter x Hunter");
			System.out.println("6.Go Back to Previous Menu");
			
			System.out.println();
			System.out.println("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			
			switch (a) {
	        case 1: {
	        	
	            // Anime Details for One Piece
	            AnimeDetails onePieceDetails = new AnimeDetails("One Piece",
	                    "One Piece follows Monkey D. Luffy and his pirate crew as they search for the legendary " +
	                            "One Piece treasure to become the Pirate King.",
	                    1999, "Toei Animation", "S");
	            addAnimeDetails("One Piece", onePieceDetails);
	            displayAnimeDetails("One Piece");
	            break;
	        } case 2: {
	        	
	            // Anime Details for Naruto
	            AnimeDetails narutoDetails = new AnimeDetails("Naruto",
	                    "Naruto tells the story of Naruto Uzumaki, a young ninja with dreams of becoming the " +
	                            "strongest ninja and leader of his village, known as the Hokage.",
	                    2002, "Studio P", "A");
	            addAnimeDetails("Naruto", narutoDetails);
	            displayAnimeDetails("Naruto");
	            break;
	        } case 3: {
	        	
	            // Anime Details for Dragon Ball Series
	            AnimeDetails dragonBallDetails = new AnimeDetails("Dragon Ball",
	                    "Dragon Ball series follows the adventures of Goku from his childhood through adulthood " +
	                            "as he trains in martial arts and explores the world in search of the seven orbs known as Dragon Balls.",
	                    1986, "Toei Animation", "S");
	            addAnimeDetails("Dragon Ball series", dragonBallDetails);
	            displayAnimeDetails("Dragon Ball series");
	            break;
	        } case 4: {
	        	
	            // Anime Details for Bleach
	            AnimeDetails bleachDetails = new AnimeDetails("Bleach",
	                    "Bleach centers around Ichigo Kurosaki, a teenager with the ability to see ghosts. " +
	                            "He becomes a Soul Reaper to protect the living world from evil spirits known as Hollows.",
	                    2004, "Studio Q", "C");
	            addAnimeDetails("Bleach", bleachDetails);
	            displayAnimeDetails("Bleach");
	            break;
	        } case 5: {
	        	
	            // Anime Details for Hunter X Hunter
	            AnimeDetails hunterXHunterDetails = new AnimeDetails("Hunter x Hunter",
	                    "Hunter x Hunter follows Gon Freecss, a young boy who aspires to become a Hunter and find " +
	                            "his missing father. He befriends other aspiring Hunters and faces various challenges.",
	                    2011, "Madhouse", "B");
	            addAnimeDetails("Hunter x Hunter", hunterXHunterDetails);
	            displayAnimeDetails("Hunter x Hunter");
	            break;
	        } case 6: {
	            // Go back to the previous menu
	        	showList();
	            break;
	        }
	        default:
	            System.err.println("Invalid Value Entered");
	            showList();
	    }
			System.out.println();
			System.out.println("What would you like to do next??");
			System.out.println("1.View more Shonen Animes");
			System.out.println("2.Choose Different Genre");
			System.out.println("3.Want to read Manga/Manhwa");
			System.out.println("4.Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int p = s.nextInt();
			
			if(p ==1) {
				shonen();
			} else if(p==2) {
				showList();
			} else if(p==3) {
				super.showList();
			} else {
				System.out.println();
				System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
				System.exit(0);
			}
		}
		
		public void seinen() {
		    Scanner s = new Scanner(System.in);

		    System.out.println();
		    System.out.println("1.Berserk");
		    System.out.println("2.Vagabond");
		    System.out.println("3.Vinland Saga");
		    System.out.println("4.Monster");
		    System.out.println("5.Kaguya-sama: Love is War");
		    System.out.println("6.Go Back to Previous Menu");

		    System.out.println();
		    System.out.print("Enter your choice: ");
		    int a = s.nextInt();

		    switch (a) {
		        case 1: {
		            //Anime details for Berserk
		            AnimeDetails berserkDetails = new AnimeDetails("Berserk",
		                    "Berserk follows Guts, a lone mercenary with a tragic past, as he battles through a dark " +
		                            "and violent medieval world filled with demons, gods, and corruption.",
		                    1997, "OLM, Inc.", "A");
		            addAnimeDetails("Berserk", berserkDetails);
		            displayAnimeDetails("Berserk");
		            break;
		        } case 2: {
		            //Anime details for Vagabond
		            AnimeDetails vagabondDetails = new AnimeDetails("Vagabond",
		                    "Vagabond is based on the life of the legendary samurai Miyamoto Musashi. It explores " +
		                            "his journey towards enlightenment and mastery of the sword.",
		                    2022, "Madhouse", "A");
		            addAnimeDetails("Vagabond", vagabondDetails);
		            displayAnimeDetails("Vagabond");
		            break;
		        } case 3: {
		            //Anime details for Vinland Saga
		            AnimeDetails vinlandSagaDetails = new AnimeDetails("Vinland Saga",
		                    "Vinland Saga follows the Viking Thorfinn as he seeks revenge for his father's death " +
		                            "and becomes entangled in the political and historical events of the Viking Age.",
		                    2019, "Wit Studio", "B");
		            addAnimeDetails("Vinland Saga", vinlandSagaDetails);
		            displayAnimeDetails("Vinland Saga");
		            break;
		        } case 4: {
		            // Anime details for Monster
		            AnimeDetails monsterDetails = new AnimeDetails("Monster",
		                    "Monster follows Dr. Kenzo Tenma, a brilliant surgeon, as he uncovers a dark conspiracy " +
		                            "involving a former patient who becomes a serial killer.",
		                    2004, "Madhouse", "A");
		            addAnimeDetails("Monster", monsterDetails);
		            displayAnimeDetails("Monster");
		            break;
		        } case 5: {
		            // Anime details for Kaguya-sama: Love is War
		            AnimeDetails kaguyaSamaDetails = new AnimeDetails("Kaguya-sama: Love is War",
		                    "Kaguya-sama: Love is War is a romantic comedy about the strategic battles between " +
		                            "the student council president Kaguya Shinomiya and vice president Miyuki Shirogane.",
		                    2019, "A-1 Pictures", "B");
		            addAnimeDetails("Kaguya-sama: Love is War", kaguyaSamaDetails);
		            displayAnimeDetails("Kaguya-sama: Love is War");
		            break;
		        } case 6: {
		            // Go back to the previous menu
		        	showList();
		            break;
		        }
		        default:
		            System.err.println("Invalid Value Entered");
		            showList();
		    }
		    
		    System.out.println();
			System.out.println("What would you like to do next??");
			System.out.println("1.View more seinen Animes");
			System.out.println("2.Choose Different Genre");
			System.out.println("3.Want to read Manga/Manhwa");
			System.out.println("4.Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int p = s.nextInt();
			
			if(p ==1) {
				seinen();
			} else if(p==2) {
				showList();
			} else if(p==3) {
				super.showList();
			} else {
				System.out.println();
				System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
				System.exit(0);
			}
		}

		
		public void sports() {
		    Scanner s = new Scanner(System.in);

		    System.out.println();
		    System.out.println("1.Hajime no Ippo");
		    System.out.println("2.Slam Dunk");
		    System.out.println("3.Haikyuu");
		    System.out.println("4.Blue Lock");
		    System.out.println("5.Initial D");
		    System.out.println("6.Go Back to Previous Menu");
		    
		    System.out.println();
		    System.out.print("Enter your choice: ");
		    int a = s.nextInt();

		    switch (a) {
		        case 1: {
		        	
		            // Anime Details for Hajime no Ippo
		            AnimeDetails hajimeNoIppoDetails = new AnimeDetails("Hajime no Ippo",
		                    "Hajime no Ippo follows Ippo Makunouchi, a young boxer, as he trains and competes " +
		                            "to become a professional boxer and reach the top of the boxing world.",
		                    2000, "Madhouse", "A");
		            addAnimeDetails("Hajime no Ippo", hajimeNoIppoDetails);
		            displayAnimeDetails("Hajime no Ippo");
		            break;
		        } case 2: {
		        	
		            // Anime details for Slam Dunk
		            AnimeDetails slamDunkDetails = new AnimeDetails("Slam Dunk",
		                    "Slam Dunk centers around Hanamichi Sakuragi, a high school delinquent who joins " +
		                            "the basketball team and discovers his love for the sport.",
		                    1993, "Toei Animation", "B");
		            addAnimeDetails("Slam Dunk", slamDunkDetails);
		            displayAnimeDetails("Slam Dunk");
		            break;
		        } case 3: {
		        	
		            // Anime Details for Haikyuu
		            AnimeDetails haikyuuDetails = new AnimeDetails("Haikyuu",
		                    "Haikyuu follows Shoyo Hinata and Tobio Kageyama as they join forces to create " +
		                            "a powerhouse volleyball team and compete in high-stakes matches.",
		                    2014, "Production I.G", "A");
		            addAnimeDetails("Haikyuu", haikyuuDetails);
		            displayAnimeDetails("Haikyuu");
		            break;
		        } case 4: {
		        	
		            // Anime Details for Blue Lock
		            AnimeDetails blueLockDetails = new AnimeDetails("Blue Lock",
		                    "Blue Lock revolves around a group of elite strikers selected to participate in " +
		                            "the Blue Lock training program to determine Japan's next great forward.",
		                    2022, "DMM.futureworks", "B");
		            addAnimeDetails("Blue Lock", blueLockDetails);
		            displayAnimeDetails("Blue Lock");
		            break;
		        } case 5: {
		        	
		            // Anime Details for Initial D
		            AnimeDetails initialDDetails = new AnimeDetails("Initial D",
		                    "Initial D follows Takumi Fujiwara, a talented street racer, as he navigates " +
		                            "the world of mountain pass racing in his father's modified Toyota AE86.",
		                    1998, "Studio Comet", "C");
		            addAnimeDetails("Initial D", initialDDetails);
		            displayAnimeDetails("Initial D");
		            break;
		        } case 6: {
		            // Go back to the previous menu
		        	showList();
		            break;
		        }
		        default:
		            System.err.println("Invalid Value Entered");
		            showList();
		    }
		    System.out.println();
			System.out.println("What would you like to do next??");
			System.out.println("1.View more Sports Animes");
			System.out.println("2.Choose Different Genre");
			System.out.println("3.Want to read Manga/Manhwa");
			System.out.println("4.Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int p = s.nextInt();
			
			if(p ==1) {
				sports();
			} else if(p==2) {
				showList();
			} else if(p==3) {
				super.showList();
			} else {
				System.out.println();
				System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
				System.exit(0);
			}
		}

		
		class AnimeDetails {
			private String title;
			private String description;
			private int releaseYear;
			private String studio;
			private String rating;
			
			AnimeDetails(String title,String description,int releaseYear,String studio,String rating){
				
				this.title = title;
				this.description = description;
				this.releaseYear = releaseYear;
				this.studio = studio;
				this.rating = rating;
				
			}

			public String getTitle() {
				return title;
			}

			public String getDescription() {
				return description;
			}

			public int getReleaseYear() {
				return releaseYear;
			}

			public String getStudio() {
				return studio;
			}

			public String getRating() {
				return rating;
			}
			
			
		}
}
