package creational.abstractFactory.GUIwidgetFactory;

import creational.abstractFactory.GUIwidgetFactory.MacOS.MacButton;
import creational.abstractFactory.GUIwidgetFactory.MacOS.MacCheckBox;

public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        
            return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        
        return new MacCheckBox();
    }
}
