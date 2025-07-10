package creational.abstractFactory.GUIwidgetFactory;

import creational.abstractFactory.GUIwidgetFactory.WindowsOS.WinButton;
import creational.abstractFactory.GUIwidgetFactory.WindowsOS.WinCheckBox;

public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        
            return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        
        return new WinCheckBox();
    }
}
