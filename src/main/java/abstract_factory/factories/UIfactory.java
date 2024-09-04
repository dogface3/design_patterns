package abstract_factory.factories;


import abstract_factory.buttons.button;
import abstract_factory.checkboxes.checkBox;
import abstract_factory.textfields.textField;

public abstract class UIfactory {
    public abstract button createButton(String text);

    public abstract checkBox createCheckBox(String text);

    public abstract textField createTextField(String text);
}
