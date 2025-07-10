package abstractFactory.GUIwidgetFactory.WindowsOS;

import abstractFactory.GUIwidgetFactory.Button;

public class WinButton implements Button {

    @Override
    public void paint() {
        
        System.out.println("Windows Button here...");
    }

    

}
