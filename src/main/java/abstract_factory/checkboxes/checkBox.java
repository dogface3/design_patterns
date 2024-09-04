package abstract_factory.checkboxes;

public abstract class checkBox {
    public String text;

    public checkBox(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }
    public abstract void display();
}
