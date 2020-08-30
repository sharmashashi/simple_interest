
import javax.swing.*;

import java.awt.event.*;

public class SimpleInterest implements ActionListener {
    static JFrame _frame;
    static JTextField _pf;
    static JLabel _pl;
    static JTextField _tf;
    static JLabel _tl;
    static JTextField _rf;
    static JLabel _rl;
    static JTextField _if;
    static JLabel _il;
    static JButton _calculate;

    static void _initWindow() {
        _frame = new JFrame();
        _frame.setSize(500, 500);
        _frame.setDefaultCloseOperation(3);
        _frame.setResizable(false);
        _frame.setVisible(true);
        _frame.setLayout(null);
    }

    static void _layComponents() {
        _pf = new JTextField();
        _tf = new JTextField();
        _rf = new JTextField();
        _if = new JTextField();
        _pl = new JLabel("Principal");
        _tl = new JLabel("Time");
        _rl = new JLabel("Rate");
        _il = new JLabel("Simple Interest");
        _calculate = new JButton("Calculate");
        //
        _pl.setBounds(10, 10, 100, 50);
        _pf.setBounds(120, 10, 100, 50);
        _tl.setBounds(10, 70, 100, 50);
        _tf.setBounds(120, 70, 100, 50);
        _rl.setBounds(10, 130, 100, 50);
        _rf.setBounds(120, 130, 100, 50);
        _il.setBounds(10, 190, 100, 50);
        _if.setBounds(120, 190, 100, 50);
        _calculate.setBounds(10, 250, 100, 50);
        _frame.add(_pl);
        _frame.add(_pf);
        _frame.add(_tl);
        _frame.add(_tf);
        _frame.add(_rl);
        _frame.add(_rf);
        _frame.add(_il);
        _frame.add(_if);
        _frame.add(_calculate);
        _calculate.addActionListener(new ButtonEvent(_pf, _tf, _rf, _if));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        _initWindow();
        _layComponents();
        _frame.repaint();
    }
}

class ButtonEvent implements ActionListener {
    JTextField _pf;
    JTextField _tf;
    JTextField _rf;
    JTextField _if;
    JButton _calculate;

    ButtonEvent(JTextField pf, JTextField tf, JTextField rf, JTextField inf) {
        _pf = pf;
        _tf = tf;
        _rf = rf;
        _if = inf;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double p = Double.parseDouble(_pf.getText());
        double t = Double.parseDouble(_tf.getText());
        double r = Double.parseDouble(_rf.getText());
        String interest = Double.toString(p * t * r / 100);
        _if.setText(interest);
    }
}
