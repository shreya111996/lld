package abstractFactory.GUIwidgetFactory;

public class Main {

    public static void main(String[] args) {
        
        
        Application application = new Application(new MacUIFactory());
        application.renderUI();

        // Application application2 = new Application(new WindowsUIFactory());
        // application2.renderUI();

    }

}
