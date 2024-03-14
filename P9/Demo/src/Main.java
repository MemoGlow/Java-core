import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Nhap ten cua ban");
        f.setLayout(new FlowLayout());
        f.setSize(200, 200);
        f.setLocation(50, 50);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel enterName = new JLabel("Vui long nhap ten cua ban");
        JLabel showName = new JLabel("Tên của bạn là: ");
        JTextField nameField = new JTextField(10);
        JButton button = new JButton("Enter");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showName.setText("Tên của bạn là: " + nameField.getText());
                showName.setVisible(true);
            }
        });
        f.add(enterName);
        f.add(nameField);
        f.add(button);
        f.add(showName);
        f.setVisible(true);
    }
}