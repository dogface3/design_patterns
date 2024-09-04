package abstract_factory.buttons;

public class buttonB  extends button{
    public buttonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("╔============╗");
        System.out.println("║ " +text+ " ║");
        System.out.println("╚============╝");
    }
}
