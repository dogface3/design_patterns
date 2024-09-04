package abstract_factory.buttons;

public class buttonA extends button {
    public buttonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌────────────┐");
        System.out.println("│ " +text+ " │");
        System.out.println("└────────────┘");
    }
}
