package Q2;

// Abstract Factory
public interface GUIFactory {
    public AbstractTextField createTextField();
    public AbstractPushButton createPushButton();
    public AbstractListBox createListBox();
}