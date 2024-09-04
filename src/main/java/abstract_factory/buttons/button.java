package abstract_factory.buttons;

public abstract class button {
    public String text;

    public button(String text){
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }

}
