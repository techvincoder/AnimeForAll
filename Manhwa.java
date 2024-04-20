package manga;

import java.util.*;


public class Manhwa extends Account {
	 HashMap<String,ManhwaDetails> manhwaDetailsMap = new HashMap();
	
	public  void addManhwaDetails(String title, ManhwaDetails details) {
        manhwaDetailsMap.put(title, details);
        System.out.println("Manhwa details added successfully!");
    }
	private void displayManhwaDetails(String manhwaTitle) {
        ManhwaDetails details = manhwaDetailsMap.get(manhwaTitle);
        if (details != null) {
            System.out.println();
            System.out.println("Title: " + manhwaTitle);
            System.out.println("Description: " + details.getDescription());
            System.out.println("Author: " + details.getAuthor());
            System.out.println("Rating: " + details.getRating());
            System.out.println("Release Year: " + details.getReleaseYear());
            // Add other details as needed
        } else {
            System.out.println("Manga details not found.");
        }
    }
	
	
	@Override
    public void showList() {
        System.out.println();
        System.out.println("What is your favorite Manhwa Genre???");
        System.out.println();

        System.out.println("1.Action");
        System.out.println("2.Romance");
        System.out.println("3.Fantasy");
        System.out.println("4.Horror");
        System.out.println("5.Go Back to the previous menu");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int a = s.nextInt();

        switch (a) {
            case 1: {
                actionManhwa();
                break;
            }
            case 2: {
                romanceManhwa();
                break;
            }
            case 3: {
                fantasyManhwa();
                break;
            }
            case 4: {
                horrorManhwa();
                break;
            }
            case 5: {
                super.showList();
                break;
            }
            default:
                System.err.println("Invalid Value Entered");
                showList();
        }
    }

    public void actionManhwa() {
        System.out.println();
        System.out.println("1.Solo Leveling");
        System.out.println("2.The Breaker");
        System.out.println("3.Noblesse");
        System.out.println("4.God of High School");
        System.out.println("5.Tower of God");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1: {
                // Manhwa details for Solo Leveling
                ManhwaDetails soloLevelingDetails = new ManhwaDetails("Solo Leveling",
                        "Solo Leveling follows Sung Jin-Woo, the weakest of the rank E hunters, as he becomes " +
                                "the most powerful S-rank hunter after a mysterious event.",
                        "Chugong", "S", 2018);  // Release year added
                addManhwaDetails("Solo Leveling", soloLevelingDetails);
                displayManhwaDetails("Solo Leveling");
                break;
            }
            case 2: {
                // Manhwa details for The Breaker
                ManhwaDetails theBreakerDetails = new ManhwaDetails("The Breaker",
                        "The Breaker follows Shi-Woon Yi, a weak high school student, who becomes the disciple " +
                                "of Chun-Woo Han, a legendary martial artist.",
                        "Jeon Geuk-Jin", "A", 2007);  // Release year added
                addManhwaDetails("The Breaker", theBreakerDetails);
                displayManhwaDetails("The Breaker");
                break;
            }
            case 3: {
                // Manhwa details for Noblesse
                ManhwaDetails noblesseDetails = new ManhwaDetails("Noblesse",
                        "Noblesse follows Cadis Etrama di Raizel, a powerful noble vampire, as he wakes up after " +
                                "820 years and integrates into the modern world.",
                        "Son Jeho", "B", 2007);  // Release year added
                addManhwaDetails("Noblesse", noblesseDetails);
                displayManhwaDetails("Noblesse");
                break;
            }
            case 4: {
                // Manhwa details for God of High School
                ManhwaDetails godOfHighSchoolDetails = new ManhwaDetails("God of High School",
                        "God of High School centers around Jin Mori, a martial artist, as he participates in " +
                                "a tournament that promises to fulfill any wish of the winner.",
                        "Park Yong-Je", "A", 2011);  // Release year added
                addManhwaDetails("God of High School", godOfHighSchoolDetails);
                displayManhwaDetails("God of High School");
                break;
            }
            case 5: {
                // Manhwa details for Tower of God
                ManhwaDetails towerOfGodDetails = new ManhwaDetails("Tower of God",
                        "Tower of God follows Bam, who enters the mysterious Tower to find his friend Rachel. " +
                                "The Tower holds various challenges and secrets.",
                        "SIU (Slave In Utero)", "A", 2010);  // Release year added
                addManhwaDetails("Tower of God", towerOfGodDetails);
                displayManhwaDetails("Tower of God");
                break;
            }
            case 6: {
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
        System.out.println("1.View more Action Manhwas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to read Manga/Anime");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            actionManhwa();
        } else if (p == 2) {
            showList();
        } else if (p == 3) {
            super.showList();
        } else {
            System.out.println();
            System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
            System.exit(0);
        }
    }

    public void romanceManhwa() {
        System.out.println();
        System.out.println("1.Love Alarm");
        System.out.println("2.Who Made Me a Princess");
        System.out.println("3.My Dear Cold-Blooded King");
        System.out.println("4.Let's Play");
        System.out.println("5.Siren's Lament");
        System.out.println("6.Go Back to Previous Menu");
        System.out.println();
        
        System.out.print("Enter your choice: ");
        System.out.println();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1: {
                // Manhwa details for Love Alarm
                ManhwaDetails loveAlarmDetails = new ManhwaDetails("Love Alarm",
                        "Love Alarm revolves around a dating app that notifies users when someone within " +
                                "a 10-meter radius has romantic feelings for them.",
                        "Chon Kye-young", "B", 2014);  // Release year added
                addManhwaDetails("Love Alarm", loveAlarmDetails);
                displayManhwaDetails("Love Alarm");
                break;
            }
            case 2: {
                // Manhwa details for Who Made Me a Princess
                ManhwaDetails whoMadeMeAPrincessDetails = new ManhwaDetails("Who Made Me a Princess",
                        "Who Made Me a Princess follows Athanasia de Alger Obelia, who discovers that she " +
                                "is the tragic heroine of a novel and tries to change her fate.",
                        "Pluto", "A", 2017);  // Release year added
                addManhwaDetails("Who Made Me a Princess", whoMadeMeAPrincessDetails);
                displayManhwaDetails("Who Made Me a Princess");
                break;
            }
            case 3: {
                // Manhwa details for My Dear Cold-Blooded King
                ManhwaDetails coldBloodedKingDetails = new ManhwaDetails("My Dear Cold-Blooded King",
                        "My Dear Cold-Blooded King is a historical romance following the relationship " +
                                "between a young woman and a mysterious king.",
                        "lifelight", "B", 2017);  // Release year added
                addManhwaDetails("My Dear Cold-Blooded King", coldBloodedKingDetails);
                displayManhwaDetails("My Dear Cold-Blooded King");
                break;
            }
            case 4: {
                // Manhwa details for Let's Play
                ManhwaDetails letsPlayDetails = new ManhwaDetails("Let's Play",
                        "Let's Play follows Sam, a young woman who becomes a game developer and faces " +
                                "challenges in both her professional and personal life.",
                        "Mongie", "B", 2016);  // Release year added
                addManhwaDetails("Let's Play", letsPlayDetails);
                displayManhwaDetails("Let's Play");
                break;
            }
            case 5: {
                // Manhwa details for Siren's Lament
                ManhwaDetails sirensLamentDetails = new ManhwaDetails("Siren's Lament",
                        "Siren's Lament follows Lyra, who encounters a mysterious underwater singer, " +
                                "leading her into a world of mythical creatures and secrets.",
                        "instantmiso", "A", 2016);  // Release year added
                addManhwaDetails("Siren's Lament", sirensLamentDetails);
                displayManhwaDetails("Siren's Lament");
                break;
            }
            case 6: {
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
        System.out.println("1.View more Romance Manhwas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to read Manga/Anime");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            romanceManhwa();
        } else if (p == 2) {
            showList();
        } else if (p == 3) {
            super.showList();
        } else {
            System.out.println();
            System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
            System.exit(0);
        }
    }

    public void fantasyManhwa() {
        System.out.println();
        System.out.println("1.Tower of God");
        System.out.println("2.The Beginning After The End");
        System.out.println("3.Noblesse");
        System.out.println("4.God of High School");
        System.out.println("5.The Gamer");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1: {
                // Manhwa details for Tower of God
                ManhwaDetails towerOfGodDetails = new ManhwaDetails("Tower of God",
                        "Tower of God follows Bam, who enters the mysterious Tower to find his friend Rachel. " +
                                "The Tower holds various challenges and secrets.",
                        "SIU (Slave In Utero)", "A", 2010);  // Release year added
                addManhwaDetails("Tower of God", towerOfGodDetails);
                displayManhwaDetails("Tower of God");
                break;
            }
            case 2: {
                // Manhwa details for The Beginning After The End
                ManhwaDetails beginningAfterTheEndDetails = new ManhwaDetails("The Beginning After The End",
                        "The Beginning After The End follows King Grey, who gets reincarnated into a " +
                                "world of magic and monsters, vowing to protect his loved ones.",
                        "TurtleMe", "A", 2018);  // Release year added
                addManhwaDetails("The Beginning After The End", beginningAfterTheEndDetails);
                displayManhwaDetails("The Beginning After The End");
                break;
            }
            case 3: {
                // Manhwa details for Noblesse
                ManhwaDetails noblesseDetails = new ManhwaDetails("Noblesse",
                        "Noblesse follows Cadis Etrama di Raizel, a powerful noble vampire, as he wakes up after " +
                                "820 years and integrates into the modern world.",
                        "Son Jeho", "B", 2007);  // Release year added
                addManhwaDetails("Noblesse", noblesseDetails);
                displayManhwaDetails("Noblesse");
                break;
            }
            case 4: {
                // Manhwa details for God of High School
                ManhwaDetails godOfHighSchoolDetails = new ManhwaDetails("God of High School",
                        "God of High School centers around Jin Mori, a martial artist, as he participates in " +
                                "a tournament that promises to fulfill any wish of the winner.",
                        "Park Yong-Je", "A", 2011);  // Release year added
                addManhwaDetails("God of High School", godOfHighSchoolDetails);
                displayManhwaDetails("God of High School");
                break;
            }
            case 5: {
                // Manhwa details for The Gamer
                ManhwaDetails theGamerDetails = new ManhwaDetails("The Gamer",
                        "The Gamer follows Han Jee-Han, a high school student who discovers that he " +
                                "has the ability to view the world like a game interface.",
                        "Sung Sang-Young", "B", 2013);  // Release year added
                addManhwaDetails("The Gamer", theGamerDetails);
                displayManhwaDetails("The Gamer");
                break;
            }
            case 6: {
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
        System.out.println("1.View more Fantasy Manhwas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to read Manga/Anime");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            fantasyManhwa();
        } else if (p == 2) {
            showList();
        } else if (p == 3) {
            super.showList();
        } else {
            System.out.println();
            System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
            System.exit(0);
        }
    }

    public void horrorManhwa() {
        System.out.println();
        System.out.println("1.Sweet Home");
        System.out.println("2.Bastard");
        System.out.println("3.The Breaker");
        System.out.println("4.Omniscient Reader's Viewpoint");
        System.out.println("5.DICE: The Cube That Changes Everything");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1: {
                // Manhwa details for Sweet Home
                ManhwaDetails sweetHomeDetails = new ManhwaDetails("Sweet Home",
                        "Sweet Home follows Cha Hyun-soo, a high school student who becomes trapped " +
                                "in his apartment building with monstrous creatures.",
                        "Youngchan Hwang, Carnby Kim", "A", 2018);  // Release year added
                addManhwaDetails("Sweet Home", sweetHomeDetails);
                displayManhwaDetails("Sweet Home");
                break;
            }
            case 2: {
                // Manhwa details for Bastard
                ManhwaDetails bastardDetails = new ManhwaDetails("Bastard",
                        "Bastard follows Jin Seon, a high school student with a dark secret. " +
                                "He becomes entangled in a dangerous game involving supernatural beings.",
                        "Carnby Kim, Youngchan Hwang", "A", 2014);  // Release year added
                addManhwaDetails("Bastard", bastardDetails);
                displayManhwaDetails("Bastard");
                break;
            }
            case 3: {
                // Manhwa details for The Breaker
                ManhwaDetails theBreakerDetails = new ManhwaDetails("The Breaker",
                        "The Breaker follows Shi-Woon Yi, a weak high school student who crosses paths " +
                                "with a mysterious martial artist and enters the world of martial arts.",
                        "Jeon Geuk-Jin, Jin-Hwan Park", "B", 2007);  // Release year added
                addManhwaDetails("The Breaker", theBreakerDetails);
                displayManhwaDetails("The Breaker");
                break;
            }
            case 4: {
                // Manhwa details for Omniscient Reader's Viewpoint
                ManhwaDetails omniscientReadersViewpointDetails = new ManhwaDetails("Omniscient Reader's Viewpoint",
                        "Omniscient Reader's Viewpoint follows Kim Dokja, a man who becomes " +
                                "involved in a story he had been reading for years.",
                        "Sing Shong", "A", 2018);  // Release year added
                addManhwaDetails("Omniscient Reader's Viewpoint", omniscientReadersViewpointDetails);
                displayManhwaDetails("Omniscient Reader's Viewpoint");
                break;
            }
            case 5: {
                // Manhwa details for DICE: The Cube That Changes Everything
                ManhwaDetails diceDetails = new ManhwaDetails("DICE: The Cube That Changes Everything",
                        "DICE follows Dongtae, a high school student who gains the power to control " +
                                "his life like a game after receiving a mysterious die.",
                        "Yun Hyunseok", "B", 2013);  // Release year added
                addManhwaDetails("DICE: The Cube That Changes Everything", diceDetails);
                displayManhwaDetails("DICE: The Cube That Changes Everything");
                break;
            }
            case 6: {
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
        System.out.println("1.View more Horror Manhwas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to read Manga/Anime");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            horrorManhwa();
        } else if (p == 2) {
            showList();
        } else if (p == 3) {
            super.showList();
        } else {
            System.out.println();
            System.out.println("!!!!!!! Thank You for visiting us !!!!!!!");
            System.exit(0);
        }
    }

    public class ManhwaDetails {
        private String title;
        private String description;
        private String author;
        private String rating;
        private int releaseYear;

        ManhwaDetails(String title, String description, String author, String rating, int releaseYear) {
            this.title = title;
            this.description = description;
            this.author = author;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getAuthor() {
            return author;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public String getRating() {
            return rating;
        }
    }
}
