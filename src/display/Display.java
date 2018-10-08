package display;

public class Display {

    private DisplayIpm display;

    public Display(DisplayIpm display) {
        this.display = display;
    }

    public void displayDishBook() {
        display.displayDishBook();
    }

    public void displayStartMenu() {
        display.displayStartMenu();
    }

    public void displayKichen() {
        display.displayKichen();
    }
}
