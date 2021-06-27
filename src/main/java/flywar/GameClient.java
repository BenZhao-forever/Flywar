package flywar;

import javax.swing.*;
import java.awt.*;

/**
 * Package: flywar
 * Created by Ben Zhao on 2021/6/26
 * Project: Flywar
 */
public class GameClient extends JComponent {
    private GameClient() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("assets/images/tankD.gif").getImage(), 100, 100, null);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Fly War");
        frame.setIconImage(new ImageIcon("assets/images/icon.png").getImage());
        GameClient client = new GameClient();
        client.repaint();
        frame.add(client);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
