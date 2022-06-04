import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Convertor extends JFrame {
    private JTextField textField1;
    private JLabel Label;
    private JPanel rootPanel2;

    public Convertor(){
        add(rootPanel2);
        setTitle("Celsius Converter");
        setSize(400,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = textField1.getText();
                float val2 =Float.parseFloat(val);
                val2 = + (val2 * 9/5) + 32;
                Label.setText(String.valueOf(val2) + "°F");
            }
        });
    }

}
