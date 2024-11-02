package Proxy;



public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating users
        User adminUser = new User("adminUser");
        User regularUser = new User("regularUser");

        // Adding documents with different identifiers and associated users
        library.addDocument("doc1", "This is a confidential document.", adminUser);
        library.addDocument("doc2", "This is a regular document.", regularUser);

        // Display documents by identifier using the corresponding user
        System.out.println("Displaying document with identifier 'doc1' as adminUser:");
        library.displayDocument("doc1", adminUser); // Should succeed

        System.out.println("\nDisplaying document with identifier 'doc2' as regularUser:");
        library.displayDocument("doc2", regularUser); // Should succeed

        System.out.println("\nAttempting to display document 'doc1' as regularUser:");
        library.displayDocument("doc1", regularUser); // Should throw AccessDeniedException

        System.out.println("whtat");
        library.displayDocument("doc2", adminUser); // AccessDeniedException

        System.out.println("\nAttempting to display a non-existing document:");
        library.displayDocument("doc3", adminUser); // Should indicate document not found
    }
}