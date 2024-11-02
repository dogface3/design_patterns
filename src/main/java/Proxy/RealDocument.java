package Proxy;
import java.util.Date;

public class RealDocument implements IDocument {
    private String content;
    private Date creationDate;

    public RealDocument(String content) {
        this.content = content;
        this.creationDate = new Date();
        loadDocument();
    }

    private void loadDocument() {
        System.out.println("Loading document " + content);
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void displayContent() {
        System.out.println(content);
    }
}
