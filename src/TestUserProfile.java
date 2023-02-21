import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Choose your favorite genre from the list: ");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Fantasy");
        System.out.println("6. Horror");
        System.out.println("7. Mystery");
        System.out.println("8. Romance");
        System.out.println("9. Science Fiction");
        System.out.print("Enter the number of your favorite genre: ");
        int genreNumber = scanner.nextInt();
        String genre = "";
        switch (genreNumber) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Fantasy";
                break;
            case 6:
                genre = "Horror";
                break;
            case 7:
                genre = "Mystery";
                break;
            case 8:
                genre = "Romance";
                break;
            case 9:
                genre = "Science Fiction";
                break;
            default:
                System.out.println("Invalid genre number.");
                return;
        }
        System.out.println("User profile created for " + name + " with favorite genre " + genre + ".");
    }
}

