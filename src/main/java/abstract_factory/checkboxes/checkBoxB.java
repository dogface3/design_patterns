package abstract_factory.checkboxes;

public class checkBoxB extends checkBox{
    public checkBoxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("╔==╗ " + text);
        System.out.println("╚==╝ " + text);
    }
}
