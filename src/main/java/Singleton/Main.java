package Singleton;

public class Main {
    public static void main(String[] args) {
        Logger loggerInstance = Logger.getInstance();

        loggerInstance.log("message");
        loggerInstance.setFilename("newFile.log");
        loggerInstance.log("message on new file");
    }
}
