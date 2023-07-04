import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo {
    private JPanel rootPanel;
    private JButton okButton;
    private JLabel resultado;
    private JTextField numero1;
    private JTextField numero2;
    int i=0;
    public HolaMundo() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                resultado.setText(numero1.getText()+ " " +numero2.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
