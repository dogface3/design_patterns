package abstract_factory.textfields;

public abstract class textField {
    public String text;

    public textField(String text){
        this.text = text;
    }

    public abstract void display();

    public void setText(String text){
        this.text = text;
    }
}
