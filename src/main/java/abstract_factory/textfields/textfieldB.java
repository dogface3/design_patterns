package abstract_factory.textfields;

public class textfieldB extends textField{
    public textfieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("╔========================╗");
        System.out.println("║ " + text + "           ║");
        System.out.println("╚========================╝");
    }
}
