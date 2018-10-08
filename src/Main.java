import display.Display;
import display.WindowDisplay.WindowDisplay;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new WindowDisplay());
        display.displayStartMenu();
    }
}
