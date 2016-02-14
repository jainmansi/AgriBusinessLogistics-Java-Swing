/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class MyPositiveIntegerVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[1-9]+[0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.PINK);
                JOptionPane.showMessageDialog(input, "Please enter a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        } else {
            input.setBackground(Color.PINK);
            return false;
        }
    }

}