package Proxy;
import java.util.Date;

public class ProxyDocument implements IDocument {
    private RealDocument realDocument;
    private String documentId; // This will now hold the document ID
    private User user;

    public ProxyDocument(String documentId, String content, User user) {
        this.documentId = documentId; // Store the document ID
        this.user = user;
        this.realDocument = new RealDocument(content); // Initialize real document immediately
    }

    @Override
    public String getContent() {
        return realDocument.getContent();
    }

    @Override
    public Date getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public void displayContent() throws AccessDeniedException {

        AccessControlService accessControlService = AccessControlService.getInstance();
        // Check if the user has access to the document using documentId
        if (accessControlService.getInstance().hasAccess(user, documentId)) {
            System.out.println("Proxy: Accessing document content.");
            realDocument.displayContent();
        } else {
            System.out.println("is it?");
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}
