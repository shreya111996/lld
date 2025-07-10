package abstractFactory.GUIwidgetFactory;

import abstractFactory.GUIwidgetFactory.MacOS.MacButton;
import abstractFactory.GUIwidgetFactory.MacOS.MacCheckBox;

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
