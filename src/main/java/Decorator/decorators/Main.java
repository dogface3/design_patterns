package Decorator.decorators;

import Decorator.Printer;
import Decorator.basicPrinter;

public class Main {
    public static void main(String[] args) {
        Printer printer = new basicPrinter();
        printer.print("Hello World!");

        Printer printer2 = new encryptedPrinter(new filePrinter(new basicPrinter()));
        printer2.print("Hello World!");
    }
}
