package Prototype;

import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recommendation recommendation = new Recommendation("Adults");
        recommendation.addBook(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone"));
        recommendation.addBook(new Book("George Orwell", "1984"));
        recommendation.addBook(new Book("J.R.R. Tolkien", "The Hobbit"));

        while (true) {
            System.out.println("\n=== Book Recommendation System ===");
            System.out.println("1. View Recommendations");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Clone List");
            System.out.println("5. Change Audience");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    viewRecommendation(recommendation);
                    break;

                case 2:
                    addBook(recommendation, scanner);
                    break;

                case 3:
                    removeBook(recommendation, scanner);
                    break;

                case 4:
                    recommendation = cloneRecommendation(recommendation);
                    System.out.println("Recommendation list cloned successfully!");
                    break;

                case 5:
                    changeAudience(recommendation, scanner);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewRecommendation(Recommendation recommendation) {
        System.out.println("\nTarget Audience: " + recommendation.targetAudience);
        System.out.println("Books:");
        for (Book book : recommendation.bookList) {
            System.out.println("- " + book.author + ": " + book.title);
        }
    }

    private static void addBook(Recommendation recommendation, Scanner scanner) {
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        recommendation.addBook(new Book(author, title));
        System.out.println("Book added successfully!");
    }

    private static void removeBook(Recommendation recommendation, Scanner scanner) {
        System.out.print("Enter book title to remove: ");
        String title = scanner.nextLine();
        recommendation.delBook(title);
        System.out.println("Book removed successfully!");
    }

    private static Recommendation cloneRecommendation(Recommendation original) {
        return original.clone();
    }

    private static void changeAudience(Recommendation recommendation, Scanner scanner) {
        System.out.print("Enter new target audience: ");
        String audience = scanner.nextLine();
        recommendation.changeAudience(audience);
        System.out.println("Target audience updated successfully!");
    }
}
