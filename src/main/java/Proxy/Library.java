package Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    // Factory method to create and store a protected document
    private IDocument createProtectedDocument(String identifier, String content, User user) {
        // Create the proxy document with the document ID
        ProxyDocument proxyDocument = new ProxyDocument(identifier, content, user);

        // Store the document in the library
        documents.put(identifier, proxyDocument);

        // Grant access for the user to the document
        AccessControlService.getInstance().grantAccess(user.getUsername(), identifier);

        return proxyDocument;
    }

    public void addDocument(String identifier, String content, User user) {
        createProtectedDocument(identifier, content, user);
    }

    public void displayDocument(String identifier, User user) {
        IDocument document = documents.get(identifier);
        if (document != null) {
            if (AccessControlService.hasAccess(user, identifier)){
            try {
                document.displayContent();
                System.out.println("Creation Date: " + document.getCreationDate());
            } catch (AccessDeniedException e) {
                System.out.println(e.getMessage());
            }}
            else{
                System.out.println("access denied");
            }
        } else {
            System.out.println("Document not found for identifier: " + identifier);
        }
    }
}
