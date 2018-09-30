/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiandevent;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author CoolCats
 */
public class myLogin {

    public JFrame frame;
    public JTextField nameField;
    JLabel labName;
    JLabel labPass;
    JPasswordField passField;

    public void initUI() {
        frame = new JFrame();
        frame.setTitle("登录");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

//        ImageIcon icon = new ImageIcon("C:\\Users\\CoolCats\\Desktop\\Cr-Ni拟合.jpg");
//        JLabel labIcon = new JLabel();
//        labIcon.setIcon(icon);
        labName = new JLabel("账号：");
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(210, 30));

        labPass = new JLabel("密码：");
        passField = new JPasswordField();
        passField.setPreferredSize(new Dimension(210, 30));

        JButton loginBtn = new JButton("登录");
        LoginEvent ll = new LoginEvent();
        loginBtn.addActionListener(ll);

//        frame.add(labIcon);
        frame.add(labName);
        frame.add(nameField);
        frame.add(labPass);
        frame.add(passField);
        frame.add(loginBtn);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

}
