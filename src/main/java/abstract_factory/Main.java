package abstract_factory;

import abstract_factory.buttons.button;
import abstract_factory.buttons.buttonA;
import abstract_factory.buttons.buttonB;
import abstract_factory.checkboxes.checkBox;
import abstract_factory.checkboxes.checkBoxA;
import abstract_factory.checkboxes.checkBoxB;
import abstract_factory.factories.Afactory;
import abstract_factory.factories.Bfactory;
import abstract_factory.factories.UIfactory;
import abstract_factory.textfields.textField;
import abstract_factory.textfields.textfieldA;
import abstract_factory.textfields.textfieldB;

public class Main {
    public static void main(String[] args){
        UIfactory factoryA = new Afactory();
        button buttonA = factoryA.createButton("some text");
        textField textfieldA =  factoryA.createTextField("some text");
        checkBox checkBoxA = factoryA.createCheckBox("text")    ;

        System.out.println("style a");
        buttonA.display();
        textfieldA.display();
        checkBoxA.display();


        buttonA.setText("new text");
        textfieldA.setText("new text");
        checkBoxA.setText("new text");

        System.out.println("modified text a");
        buttonA.display();
        textfieldA.display();
        checkBoxA.display();

        UIfactory factoryB = new Bfactory();
        button buttonB = factoryB.createButton("some text");
        textField textfieldB = factoryB.createTextField("some text");
        checkBox checkBoxB = factoryB.createCheckBox("text");

        System.out.println("style b");
        buttonB.display();
        textfieldB.display();
        checkBoxB.display();


        buttonB.setText("new text");
        textfieldB.setText("new text");
        checkBoxB.setText("new text");

        System.out.println("modified text b");
        buttonB.display();
        textfieldB.display();
        checkBoxB.display();
    }
}
