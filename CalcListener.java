package HomeWork8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcListener implements ActionListener {
        private JTextField out;

    public CalcListener(JTextField out) {
            this.out = out;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = out.getText();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult1 = null;
        try {
            expResult1 = scriptEngine.eval(text);
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }
        out.setText(String.valueOf(expResult1));

    }

}
