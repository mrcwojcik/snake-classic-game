package pl.mrcwojcik;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() throws HeadlessException {
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
