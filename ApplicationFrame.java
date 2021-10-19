package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame {

    public ApplicationFrame() {
        setTitle("Калькулятор");
        setBounds(1050, 50, 270, 350);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(new BorderLayout());

        JPanel top = createTop();
        add(top, BorderLayout.NORTH);

        JTextField in = (JTextField) top.getComponent(0);
        setJMenuBar(getjMenuBar(in));

        add(createMainPanel(in), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        JTextField in = new JTextField();
        in.setEditable(false);
        top.add(in, BorderLayout.NORTH);

        return top;
    }

    private JMenuBar getjMenuBar(JTextField in) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("Файл"));

        ActionListener clearListener = new ClearListener(in);

        JMenuItem clear = menu.add(new JMenuItem("Очистить"));
        clear.addActionListener(clearListener);
        JMenuItem exit = menu.add(new JMenuItem("Выход"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }

    private JPanel createMainPanel(JTextField in) {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));

        ActionListener buttonListener = new ButtonListener(in);
        ActionListener calcListener = new CalcListener(in);
        ActionListener clearListener = new ClearListener(in);
        ActionListener squareListener = new SquareListener(in);

        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton btn = new JButton("0");
        btn.addActionListener(buttonListener);
        digitsPanel.add(btn);

        bottom.add(digitsPanel, BorderLayout.CENTER);


        JPanel advPanel = new JPanel();
        advPanel.setLayout(new BoxLayout(advPanel, BoxLayout.Y_AXIS));
        advPanel.setLayout(new GridLayout(3, 3));

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        advPanel.add(plus);

        JButton multi = new JButton("*");
        multi.addActionListener(buttonListener);
        advPanel.add(multi);

        JButton division = new JButton("/");
        division.addActionListener(buttonListener);
        advPanel.add(division);

        JButton square = new JButton("√");
        square.addActionListener(squareListener);
        advPanel.add(square);

        JButton calc = new JButton("=");
        calc.addActionListener(calcListener);
        advPanel.add(calc);

        JButton clear = new JButton("C");
        clear.addActionListener(clearListener);
        advPanel.add(clear);

        bottom.add(advPanel, BorderLayout.EAST);


        return bottom;
    }
}
