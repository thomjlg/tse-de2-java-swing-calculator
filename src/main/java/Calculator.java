import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame {
    private JLabel Label;
    private JPanel rootPanel3;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMod;
    private JButton buttonMult;
    private JButton buttonDiv;
    private JButton cButton;
    private JButton buttonEq;
    private JButton a0Button1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonVirg;

    public Calculator() {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }

        add(rootPanel3);
        setTitle("Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buttonEq.setBackground(Color.BLUE);
        buttonEq.setForeground(Color.WHITE);
        buttonEq.setOpaque(true);
        buttonAdd.setBackground(Color.ORANGE);
        buttonAdd.setForeground(Color.BLACK);
        buttonAdd.setOpaque(true);
        buttonSub.setBackground(Color.ORANGE);
        buttonSub.setForeground(Color.BLACK);
        buttonSub.setOpaque(true);
        buttonMod.setBackground(Color.ORANGE);
        buttonMod.setForeground(Color.BLACK);
        buttonMod.setOpaque(true);
        buttonDiv.setBackground(Color.ORANGE);
        buttonDiv.setForeground(Color.BLACK);
        buttonDiv.setOpaque(true);
        buttonMult.setBackground(Color.ORANGE);
        buttonMult.setForeground(Color.BLACK);
        buttonMult.setOpaque(true);
        cButton.setBackground(Color.ORANGE);
        cButton.setForeground(Color.BLACK);
        cButton.setOpaque(true);
        a0Button1.setBackground(Color.WHITE);
        a0Button1.setForeground(Color.BLACK);
        a0Button1.setOpaque(true);
        a1Button.setBackground(Color.WHITE);
        a1Button.setForeground(Color.BLACK);
        a1Button.setOpaque(true);
        a2Button.setBackground(Color.WHITE);
        a2Button.setForeground(Color.BLACK);
        a2Button.setOpaque(true);
        a3Button.setBackground(Color.WHITE);
        a3Button.setForeground(Color.BLACK);
        a3Button.setOpaque(true);
        a4Button.setBackground(Color.WHITE);
        a4Button.setForeground(Color.BLACK);
        a4Button.setOpaque(true);
        a5Button.setBackground(Color.WHITE);
        a5Button.setForeground(Color.BLACK);
        a5Button.setOpaque(true);
        a6Button.setBackground(Color.WHITE);
        a6Button.setForeground(Color.BLACK);
        a6Button.setOpaque(true);
        a7Button.setBackground(Color.WHITE);
        a7Button.setForeground(Color.BLACK);
        a7Button.setOpaque(true);
        a8Button.setBackground(Color.WHITE);
        a8Button.setForeground(Color.BLACK);
        a8Button.setOpaque(true);
        a9Button.setBackground(Color.WHITE);
        a9Button.setForeground(Color.BLACK);
        a9Button.setOpaque(true);
        buttonVirg.setBackground(Color.ORANGE);
        buttonVirg.setForeground(Color.BLACK);
        buttonVirg.setOpaque(true);

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("");
            }
        });

        buttonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");

                try {
                    Label.setText(String.valueOf(engine.eval(Label.getText())));
                } catch (ScriptException scriptException) {
                    scriptException.printStackTrace();
                }


            }
        });

        a0Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a0Button1.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + a9Button.getText());
            }
        });
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //val = Label.getText();
                //val2 =Float.parseFloat(val);
                Label.setText(Label.getText() + buttonAdd.getText());

            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //val = Label.getText();
                //val2 =Float.parseFloat(val);
                Label.setText(Label.getText() + buttonSub.getText());

            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //val = Label.getText();
                //val2 =Float.parseFloat(val);
                Label.setText(Label.getText() + buttonDiv.getText());

            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //val = Label.getText();
                //val2 =Float.parseFloat(val);
                Label.setText(Label.getText() + buttonMult.getText());

            }
        });
        buttonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //val = Label.getText();
                //val2 =Float.parseFloat(val);
                Label.setText(Label.getText() + buttonMod.getText());

            }
        });
        buttonVirg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Label.getText() + buttonVirg.getText());
            }
        });


    }
}