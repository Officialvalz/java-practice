import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MovieRatingApp {

    static Movie[] movies = new Movie[100];
    static int movieCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to the Movie Rating System ===");

        int choice;
        do {
            printMenu();
            choice = readMenuChoice();

            switch (choice) {
                case 1: addMovie();
                break;
                case 2: rateMovie();
                break;
                case 3: viewAverageRatings();
                break;
                case 4: System.out.println("\nExiting the application. Goodbye!");
                break;
                default: System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

    }


    static void printMenu() {
        System.out.println("\n1. Add a Movie");
        System.out.println("2. Rate a Movie");
        System.out.println("3. View Average Ratings");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    static int readMenuChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } else {
            scanner.nextLine();
            return -1;
        }
    }


    static void addMovie() {
        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine().trim();

        if (movieName.isEmpty()) {
            System.out.println("Movie name cannot be empty. Please try again.");
            return;
        }


        if (findMovieIndex(movieName) != -1) {
            System.out.println("Movie \"" + movieName + "\" already exists in the system.");
            return;
        }


        if (movieCount >= movies.length) {
            System.out.println("Movie list is full. Cannot add more movies.");
            return;
        }

        String dateTimeAdded = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        movies[movieCount] = new Movie(movieName, dateTimeAdded);
        movieCount++;

        System.out.println("Movie \"" + movieName + "\" added successfully!");
        System.out.println("Date & Time Added: " + dateTimeAdded);
    }

    static void rateMovie() {
        if (movieCount == 0) {
            System.out.println("No movies in the system yet. Please add a movie first.");
            return;
        }

        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine().trim();

        if (movieName.isEmpty()) {
            System.out.println("Movie name cannot be empty.");
            return;
        }

        int movieIndex = findMovieIndex(movieName);
        if (movieIndex == -1) {
            System.out.println("Movie \"" + movieName + "\" not found. Please check the name and try again.");
            return;
        }

        System.out.print("Enter your rating (1-5): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Rating must be a whole number between 1 and 5.");
            scanner.nextLine();
            return;
        }

        int rating = scanner.nextInt();
        scanner.nextLine();

        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
            return;
        }

        if (!movies[movieIndex].addRating(rating)) {
            System.out.println("This movie has reached its maximum number of ratings.");
            return;
        }

        System.out.println("Rating " + rating + " added for \"" + movies[movieIndex].name + "\".");
        System.out.printf("Current average for \"%s\": %.2f%n",
                movies[movieIndex].name,
                movies[movieIndex].getAverageRating());
    }


    static void viewAverageRatings() {
        if (movieCount == 0) {
            System.out.println("No movies in the system yet.");
            return;
        }

        System.out.println("\n=== Average Ratings for All Movies ===");
        System.out.printf("%-30s %-25s %-10s %-10s%n",
                "Movie", "Date Added", "Ratings", "Average");
        System.out.println("-".repeat(80));

        for (int movieIndex = 0; movieIndex < movieCount; movieIndex++) {
            Movie movie = movies[movieIndex];

            if (movie.ratingCount == 0) {
                System.out.printf("%-30s %-25s %-10s %-10s%n",
                        movie.name, movie.dateAdded, "0", "No ratings yet");
            } else {
                System.out.printf("%-30s %-25s %-10d %-10.2f%n",
                        movie.name,
                        movie.dateAdded,
                        movie.ratingCount,
                        movie.getAverageRating());
            }
        }
    }

    static int findMovieIndex(String movieName) {
        for (int movieIndex = 0; movieIndex < movieCount; movieIndex++) {
            if (movies[movieIndex].name.equalsIgnoreCase(movieName)) {
                return movieIndex;
            }
        }
        return -1;
    }
}

class Movie {

    String name;
    String dateAdded;
    int[] ratings;
    int ratingCount;

    static final int MAX_RATINGS = 100;

    Movie(String name, String dateAdded) {
        this.name      = name;
        this.dateAdded = dateAdded;
        this.ratings   = new int[MAX_RATINGS];
        this.ratingCount = 0;
    }
    boolean addRating(int rating) {
        if (ratingCount >= MAX_RATINGS) {
            return false;
        }
        ratings[ratingCount] = rating;
        ratingCount++;
        return true;
    }

    double getAverageRating() {
        if (ratingCount == 0) return 0.0;

        int totalScore = 0;
        for (int ratingIndex = 0; ratingIndex < ratingCount; ratingIndex++) {
            totalScore += ratings[ratingIndex];
        }
        return (double) totalScore / ratingCount;
    }
}
