package abstractFactory.GUIwidgetFactory;

public class Application {

    private Button button;
    private CheckBox checkbox;

    public Application(UIFactory factory) {

        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void renderUI() {
        
        button.paint();
        checkbox.paint();
    }

}
