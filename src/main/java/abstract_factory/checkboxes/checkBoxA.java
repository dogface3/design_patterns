package abstract_factory.checkboxes;

public class checkBoxA extends checkBox {
    public checkBoxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ ] " + text);
    }
}
