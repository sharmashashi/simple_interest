
import javax.swing.*;
import java.awt.*;

public class SimpleInterest {
    static JFrame _frame;
    static JTextField _pf;
    static JLabel _pl;
    static JTextField _tf;
    static JLabel _tl;
    static JTextField _rf;
    static JLabel _rl;
    static JTextField _if;
    static JLabel _il;

    static void _initWindow() {
        _frame = new JFrame();
        _frame.setSize(500, 500);
        _frame.setDefaultCloseOperation(3);
        _frame.setResizable(false);
        _frame.setVisible(true);
    }

    static void _layComponents() {
        

    }

    public static void main(String[] args) {
        _initWindow();
        _layComponents();
    }
}