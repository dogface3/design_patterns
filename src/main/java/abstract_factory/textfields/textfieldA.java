package abstract_factory.textfields;

public class textfieldA extends textField{
    public textfieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌────────────────────────┐");
        System.out.println("│ " + text + "           │");
        System.out.println("└────────────────────────┘");
    }
}
