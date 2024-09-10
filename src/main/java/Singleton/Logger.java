package Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private String filename;
    private PrintWriter writer;
    private Logger(String filename){
        this.filename = filename;
        openFile();
    }
    public static synchronized Logger getInstance() {
        if (instance==null) {
            instance = new Logger("default.log");
        }
        return instance;
    }

    private void openFile() {
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
        } catch (IOException e) {
            System.err.println("failed to open file " + e.getMessage());
        }
    }

    private void closeFile() {
        if (writer != null) {
            writer.close();
        }
    }


    public synchronized void log(String message) {
        try {
                writer.println(message);
                writer.flush();
            }
         catch (Exception e) {
            System.err.println("failed to write " + e.getMessage());
        }
    }

    public synchronized void setFilename(String newFileName) {
        closeFile();
        this.filename = newFileName;
        openFile();
    }


}
