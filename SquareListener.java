package HomeWork8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class SquareListener implements ActionListener {
    private JTextField sq;

    public SquareListener(JTextField sq) {
        this.sq = sq;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Math.sqrt(Double.parseDouble(sq.getText()));
        int i = (int) Double.parseDouble(sq.getText());
        sq.setText(String.valueOf(Math.sqrt(i)));
    }
}
