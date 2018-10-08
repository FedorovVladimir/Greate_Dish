package display.WindowDisplay;

import display.DisplayIpm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class WindowDisplay implements DisplayIpm {


    @Override
    public void displayStartMenu() {
        JFrame jFrame = new JFrame("Greate Dish");
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(255, 245, 122));
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
//        jFrame.setUndecorated(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Button dishButton = new Button("Игра");
        Button lunchButton = new Button("Меню");
        Button exitButton = new Button("Выход");
        exitButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jPanel.add(dishButton);
        jPanel.add(lunchButton);
        jPanel.add(exitButton);

        jFrame.add(jPanel);

        jFrame.setVisible(true);
    }

    @Override
    public void displayDishBook() {

    }

    @Override
    public void displayKichen() {

    }
}
