import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Frame extends JFrame {

    Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        new Frame();
    }
}
