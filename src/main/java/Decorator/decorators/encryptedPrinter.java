package Decorator.decorators;

import Decorator.Printer;
import java.util.Base64;

public class encryptedPrinter extends printerDecorator{

    public encryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        String encryptedText = encrypt(text);
        super.print(encryptedText);
    }

    private String encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

}
