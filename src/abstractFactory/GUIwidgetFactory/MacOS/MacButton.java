package abstractFactory.GUIwidgetFactory.MacOS;

import abstractFactory.GUIwidgetFactory.Button;


public class MacButton implements Button {

    @Override
    public void paint() {

        System.out.println("Created a Mac button...:");
    }

}
