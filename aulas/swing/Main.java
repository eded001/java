import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        int height = 500;
        int width = 500;
        JFrame frame = new JFrame("desktop test");
        JPanel panel = new JPanel();
        JLabel labelText = new JLabel("hello world");

        panel.add(labelText);

        frame.add(panel);

        frame.setSize(height, width);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}