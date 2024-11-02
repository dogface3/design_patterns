package Proxy;

import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private static Map<String, String> userDocumentAccess; // (username, document ID) pairs

    private AccessControlService() {
        userDocumentAccess = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String username, String documentId) {
        userDocumentAccess.put(username, documentId);
    }

    public static boolean hasAccess(User user, String documentId) {
        return userDocumentAccess.containsKey(user.getUsername()) &&
                userDocumentAccess.get(user.getUsername()).equals(documentId);
    }
}
