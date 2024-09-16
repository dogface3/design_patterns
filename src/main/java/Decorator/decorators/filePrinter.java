package Decorator.decorators;

import Decorator.Printer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filePrinter extends printerDecorator{
    private static final String fileName = "default.log";

    public filePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
