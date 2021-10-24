import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Lesson 8");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton button1 = new JButton("Kick the Buddy");
        JButton button2 = new JButton("Close");
        add(button1, BorderLayout.EAST);
        add(button2, BorderLayout.WEST);
        setVisible(true);

    }
}
