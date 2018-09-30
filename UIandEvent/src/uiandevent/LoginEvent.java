/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiandevent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static uiandevent.UIandEvent.login;

;

/**
 *
 * @author CoolCats
 */
public class LoginEvent implements ActionListener {

    String correctName;
    String correctPassword;

    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getActionCommand());
//        JButton btn = (JButton) e.getSource();

        /**
         * 2.验证
         */
//        btn.get
        String name = login.nameField.getText();
        char[] tmppass = login.passField.getPassword();
        StringBuilder pass = new StringBuilder();
        correctName = "admin";
        correctPassword = "password";
        System.out.println(correctName.equals(name));
        System.out.println(correctPassword.toCharArray());

        System.out.println(name);
//        Strin
        for (int i = 0; i < tmppass.length; i++) {
            pass.append(tmppass[i]);
        }
        System.out.println(pass.toString());

        if (correctName.equals(name) && correctPassword.equals(pass.toString())) {
            System.out.println("Right");
            JFrame f1 = new JFrame();
            f1.setTitle("新窗体");
            f1.setSize(300, 500);
            f1.setDefaultCloseOperation(3);
            f1.setLocationRelativeTo(null);
            f1.setLayout(new FlowLayout());
            f1.setVisible(true);
            login.frame.dispose();
        } else {
//            System.out.println("Wrong");.
            JOptionPane.showMessageDialog(login.frame, "Wrong");
//            JOptionPane warn = new JOptionPane("Wrong");
        }

    }

}
