package abstract_factory.factories;

import abstract_factory.buttons.button;
import abstract_factory.buttons.buttonA;
import abstract_factory.checkboxes.checkBox;
import abstract_factory.checkboxes.checkBoxA;
import abstract_factory.textfields.textField;
import abstract_factory.textfields.textfieldA;

public class Afactory extends UIfactory{
    @Override
    public button createButton(String text) {
        return new buttonA(text);
    }

    @Override
    public checkBox createCheckBox(String text) {
        return new checkBoxA(text);
    }

    @Override
    public textField createTextField(String text) {
        return new textfieldA(text);
    }
}
