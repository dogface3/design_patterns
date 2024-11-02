package Proxy;

import java.util.Date;

public interface IDocument {
    String getContent();
    Date getCreationDate();
    void displayContent() throws AccessDeniedException;
}
