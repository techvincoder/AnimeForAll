package manga;
import java.util.*;

public class Manga extends Account {

    HashMap<String, MangaDetails> mangaDetailsMap = new HashMap();

    public  void addMangaDetails(String title, MangaDetails details) {
        mangaDetailsMap.put(title, details);
    }

    private void displayMangaDetails(String mangaTitle) {
        MangaDetails details = mangaDetailsMap.get(mangaTitle);
        if (details != null) {
            System.out.println();
            System.out.println("Title: " + mangaTitle);
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
        System.out.println("What is your favorite Genre???");
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
                action();
                break;
            }
            case 2: {
                romance();
                break;
            }
            case 3: {
                fantasy();
                break;
            }
            case 4: {
                horror();
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

    public void action() {
        System.out.println();
        System.out.println("1.One Piece");
        System.out.println("2.Attack on Titan");
        System.out.println("3.Naruto");
        System.out.println("4.Bleach");
        System.out.println("5.My Hero Academia");
        System.out.println();
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
        case 1: {
            // Manga details for One Piece
            MangaDetails onePieceDetails = new MangaDetails("One Piece",
                    "One Piece manga follows Monkey D. Luffy and his pirate crew as they search for the legendary " +
                            "One Piece treasure to become the Pirate King.",
                    "Eiichiro Oda", "E", 1997);  // Release year added
            addMangaDetails("One Piece", onePieceDetails);
            displayMangaDetails("One Piece");
            break;
        }
        case 2: {
            // Manga details for Attack on Titan
            MangaDetails attackOnTitanDetails = new MangaDetails("Attack on Titan",
                    "Attack on Titan manga is set in a world where humanity resides within enormous walled cities " +
                            "to protect themselves from Titans, gigantic humanoid creatures.",
                    "Hajime Isayama", "A", 2009);  // Release year added
            addMangaDetails("Attack on Titan", attackOnTitanDetails);
            displayMangaDetails("Attack on Titan");
            break;
        }
        case 3: {
            // Manga details for Naruto
            MangaDetails narutoDetails = new MangaDetails("Naruto",
                    "Naruto manga tells the story of Naruto Uzumaki, a young ninja with dreams of becoming the " +
                            "strongest ninja and leader of his village, known as the Hokage.",
                    "Masashi Kishimoto", "D", 1999);  // Release year added
            addMangaDetails("Naruto", narutoDetails);
            displayMangaDetails("Naruto");
            break;
        }
        case 4: {
            // Manga details for Bleach
            MangaDetails bleachDetails = new MangaDetails("Bleach",
                    "Bleach manga centers around Ichigo Kurosaki, a teenager with the ability to see ghosts. " +
                            "He becomes a Soul Reaper to protect the living world from evil spirits known as Hollows.",
                    "Tite Kubo", "C", 2001);  // Release year added
            addMangaDetails("Bleach", bleachDetails);
            displayMangaDetails("Bleach");
            break;
        }
        case 5: {
            // Manga details for My Hero Academia
            MangaDetails myHeroAcademiaDetails = new MangaDetails("My Hero Academia",
                    "My Hero Academia manga is set in a world where people with superpowers, known as Quirks, " +
                            "train to become heroes and protect the citizens from villains.",
                    "Kohei Horikoshi", "A", 2014);  // Release year added
            addMangaDetails("My Hero Academia", myHeroAcademiaDetails);
            displayMangaDetails("My Hero Academia");
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
        System.out.println("1.View more Action Mangas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to watch Anime/Manhwa");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            action();
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

    public void romance() {
        System.out.println();
        System.out.println("1.Fruits Basket");
        System.out.println("2.Toradora!");
        System.out.println("3.Your Lie in April");
        System.out.println("4.Kimi ni Todoke");
        System.out.println("5.Love, Chunibyo & Other Delusions");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
        case 1: {
            // Manga details for Fruits Basket
            MangaDetails fruitsBasketDetails = new MangaDetails("Fruits Basket",
                    "Fruits Basket manga follows Tohru Honda, an orphaned girl who becomes involved " +
                            "with the Sohma family, who are cursed to turn into animals of the Chinese zodiac.",
                    "Natsuki Takaya", "B", 1998);  // Release year added
            addMangaDetails("Fruits Basket", fruitsBasketDetails);
            displayMangaDetails("Fruits Basket");
            break;
        }
        case 2: {
            // Manga details for Toradora!
            MangaDetails toradoraDetails = new MangaDetails("Toradora!",
                    "Toradora! manga revolves around Ryuuji Takasu and Taiga Aisaka, two high school students " +
                            "with contrasting personalities who form an unlikely alliance to achieve their romantic goals.",
                    "Yuyuko Takemiya", "A", 2006);  // Release year added
            addMangaDetails("Toradora!", toradoraDetails);
            displayMangaDetails("Toradora!");
            break;
        }
        case 3: {
            // Manga details for Your Lie in April
            MangaDetails yourLieInAprilDetails = new MangaDetails("Your Lie in April",
                    "Your Lie in April follows Kousei Arima, a young pianist, and Kaori Miyazono, a violinist, " +
                            "as they navigate the challenges of music and love.",
                    "Naoshi Arakawa", "A", 2011);  // Release year added
            addMangaDetails("Your Lie in April", yourLieInAprilDetails);
            displayMangaDetails("Your Lie in April");
            break;
        }
        case 4: {
            // Manga details for Kimi ni Todoke
            MangaDetails kimiNiTodokeDetails = new MangaDetails("Kimi ni Todoke",
                    "Kimi ni Todoke follows Sawako Kuronuma, a shy girl often misunderstood due to her resemblance " +
                            "to the horror film character Sadako. She strives to make friends and find love.",
                    "Karuho Shiina", "B", 2006);  // Release year added
            addMangaDetails("Kimi ni Todoke", kimiNiTodokeDetails);
            displayMangaDetails("Kimi ni Todoke");
            break;
        }
        case 5: {
            // Manga details for Love, Chunibyo & Other Delusions
            MangaDetails chunibyoDetails = new MangaDetails("Love, Chunibyo & Other Delusions",
                    "Love, Chunibyo & Other Delusions explores the romantic and comedic relationship " +
                            "between Yuuta Togashi and Rikka Takanashi, who believes she has a 'chunibyo' syndrome.",
                    "Torako", "C", 2011);  // Release year added
            addMangaDetails("Love, Chunibyo & Other Delusions", chunibyoDetails);
            displayMangaDetails("Love, Chunibyo & Other Delusions");
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
        System.out.println("1.View more Romance Mangas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to watch Anime/Manhwa");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            romance();
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

    public void fantasy() {
        System.out.println();
        System.out.println("1.Fullmetal Alchemist");
        System.out.println("2.Death Note");
        System.out.println("3.One Punch Man");
        System.out.println("4.Noragami");
        System.out.println("5.Sword Art Online");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
        case 1: {
            // Manga details for Fullmetal Alchemist
            MangaDetails fmaDetails = new MangaDetails("Fullmetal Alchemist",
                    "Fullmetal Alchemist manga follows Edward and Alphonse Elric, brothers who use alchemy " +
                            "in their quest to find the Philosopher's Stone to restore their bodies.",
                    "Hiromu Arakawa", "A", 2001);  // Release year added
            addMangaDetails("Fullmetal Alchemist", fmaDetails);
            displayMangaDetails("Fullmetal Alchemist");
            break;
        }
        case 2: {
            // Manga details for Death Note
            MangaDetails deathNoteDetails = new MangaDetails("Death Note",
                    "Death Note follows Light Yagami, a high school student who gains possession of a " +
                            "death god's notebook, allowing him to kill anyone by writing their name.",
                    "Tsugumi Ohba", "A", 2003);  // Release year added
            addMangaDetails("Death Note", deathNoteDetails);
            displayMangaDetails("Death Note");
            break;
        }
        case 3: {
            // Manga details for One Punch Man
            MangaDetails onePunchManDetails = new MangaDetails("One Punch Man",
                    "One Punch Man follows Saitama, a hero who can defeat any opponent with a single punch. " +
                            "He seeks a worthy challenge to break his boredom.",
                    "ONE", "A", 2009);  // Release year added
            addMangaDetails("One Punch Man", onePunchManDetails);
            displayMangaDetails("One Punch Man");
            break;
        }
        case 4: {
            // Manga details for Noragami
            MangaDetails noragamiDetails = new MangaDetails("Noragami",
                    "Noragami revolves around Yato, a minor god, and his adventures as he takes odd jobs " +
                            "to build his reputation and gain followers.",
                    "Adachitoka", "B", 2010);  // Release year added
            addMangaDetails("Noragami", noragamiDetails);
            displayMangaDetails("Noragami");
            break;
        }
        case 5: {
            // Manga details for Sword Art Online
            MangaDetails saoDetails = new MangaDetails("Sword Art Online",
                    "Sword Art Online explores players trapped in a virtual reality MMORPG, " +
                            "where death in the game means death in real life.",
                    "Reki Kawahara", "C", 2009);  // Release year added
            addMangaDetails("Sword Art Online", saoDetails);
            displayMangaDetails("Sword Art Online");
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
        System.out.println("1.View more Fantasy Mangas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to watch Anime/Manhwa");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            fantasy();
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

    public void horror() {
        System.out.println();
        System.out.println("1.Tokyo Ghoul");
        System.out.println("2.Parasyte");
        System.out.println("3.Another");
        System.out.println("4.Uzumaki");
        System.out.println("5.Junji Ito Collection");
        System.out.println("6.Go Back to Previous Menu");

        System.out.println();
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
        case 1: {
            // Manga details for Tokyo Ghoul
            MangaDetails tokyoGhoulDetails = new MangaDetails("Tokyo Ghoul",
                    "Tokyo Ghoul follows Kaneki Ken, a college student turned half-ghoul after a chance encounter " +
                            "with one of these flesh-eating creatures.",
                    "Sui Ishida", "B", 2011);  // Release year added
            addMangaDetails("Tokyo Ghoul", tokyoGhoulDetails);
            displayMangaDetails("Tokyo Ghoul");
            break;
        }
        case 2: {
            // Manga details for Parasyte
            MangaDetails parasyteDetails = new MangaDetails("Parasyte",
                    "Parasyte follows Shinichi Izumi, a high school student who gains a symbiotic " +
                            "relationship with an alien parasite that gives him superhuman abilities.",
                    "Hitoshi Iwaaki", "A", 1988);  // Release year added
            addMangaDetails("Parasyte", parasyteDetails);
            displayMangaDetails("Parasyte");
            break;
        }
        case 3: {
            // Manga details for Another
            MangaDetails anotherDetails = new MangaDetails("Another",
                    "Another revolves around a cursed class and the mysterious deaths that occur every year. " +
                            "Kouichi Sakakibara tries to uncover the truth behind the class's dark secrets.",
                    "Yukito Ayatsuji", "C", 2009);  // Release year added
            addMangaDetails("Another", anotherDetails);
            displayMangaDetails("Another");
            break;
        }
        case 4: {
            // Manga details for Uzumaki
            MangaDetails uzumakiDetails = new MangaDetails("Uzumaki",
                    "Uzumaki explores the eerie occurrences in a town obsessed with spirals. " +
                            "As spirals consume the town, strange and horrifying events unfold.",
                    "Junji Ito", "B", 1998);  // Release year added
            addMangaDetails("Uzumaki", uzumakiDetails);
            displayMangaDetails("Uzumaki");
            break;
        }
        case 5: {
            // Manga details for Junji Ito Collection
            MangaDetails junjiItoDetails = new MangaDetails("Junji Ito Collection",
                    "Junji Ito Collection features a series of horror stories written and illustrated by " +
                            "Junji Ito, known for his unique and unsettling horror style.",
                    "Junji Ito", "A", 2018);  // Release year added
            addMangaDetails("Junji Ito Collection", junjiItoDetails);
            displayMangaDetails("Junji Ito Collection");
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
        System.out.println("1.View more Horror Mangas");
        System.out.println("2.Choose Different Genre");
        System.out.println("3.Want to View Anime/Manhwa");
        System.out.println("4.Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        int p = s.nextInt();

        if (p == 1) {
            horror();
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


    public class MangaDetails {
        private String title;
        private String description;
        private String author;
        private String rating;
        private int releaseYear;

        MangaDetails(String title, String description, String author, String rating,int releaseYear) {
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
