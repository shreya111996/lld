package abstractFactory.GUIwidgetFactory;

import abstractFactory.GUIwidgetFactory.WindowsOS.WinButton;
import abstractFactory.GUIwidgetFactory.WindowsOS.WinCheckBox;

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
