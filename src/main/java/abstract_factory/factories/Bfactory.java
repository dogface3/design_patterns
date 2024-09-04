package abstract_factory.factories;

import abstract_factory.buttons.button;
import abstract_factory.buttons.buttonB;
import abstract_factory.checkboxes.checkBox;
import abstract_factory.checkboxes.checkBoxA;
import abstract_factory.checkboxes.checkBoxB;
import abstract_factory.textfields.textField;
import abstract_factory.textfields.textfieldB;

public class Bfactory extends UIfactory{
    @Override
    public button createButton(String text) {
        return new buttonB(text);
    }

    @Override
    public checkBox createCheckBox(String text) {
        return new checkBoxB(text);
    }

    @Override
    public textField createTextField(String text) {
        return new textfieldB(text);
    }
}
