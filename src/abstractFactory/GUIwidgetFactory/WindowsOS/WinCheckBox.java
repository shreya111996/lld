package abstractFactory.GUIwidgetFactory.WindowsOS;

import abstractFactory.GUIwidgetFactory.CheckBox;

public class WinCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Windows Checkbox created..!!");
    }

}
