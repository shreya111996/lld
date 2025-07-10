package creational.abstractFactory.GUIwidgetFactory.WindowsOS;

import creational.abstractFactory.GUIwidgetFactory.CheckBox;

public class WinCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Windows Checkbox created..!!");
    }

}
