package Decorator.decorators;

import Decorator.Printer;

public abstract class printerDecorator implements Printer {
    private Printer printer;

    public printerDecorator(Printer printer){
        this.printer=printer;
    }

    public void print(String text){
        printer.print(text);
    }
}
