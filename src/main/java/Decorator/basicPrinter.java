package Decorator;

public class basicPrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
