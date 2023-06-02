/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AAZAppUtils {

    public void OpenForm(JFrame form, int delay) {
        sleepThread(delay);
        java.awt.EventQueue.invokeLater(() -> {
            form.setVisible(true);
        });
    }

    private void sleepThread(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error, something went wrong.",
                    //                    ex.getMessage(),
                    "Error", 0);
        }
    }
}
