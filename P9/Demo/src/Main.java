import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setTitle("Day la vi du");
        JButton button = new JButton();
        button.setText("Click vao vi du");
        button.setBounds(50, 50, 200, 50);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
