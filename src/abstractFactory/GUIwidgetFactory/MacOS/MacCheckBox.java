
package abstractFactory.GUIwidgetFactory.MacOS;

import abstractFactory.GUIwidgetFactory.CheckBox;


public class MacCheckBox implements CheckBox {

    @Override
    public void paint() {

        System.out.println("Created a Mac checkbox...:");
    }

}
