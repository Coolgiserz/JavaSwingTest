/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolcalc;

import static coolcalc.CoolCalc._control;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author CoolCats
 */
public class UIControl {

    public JFrame mycalculator;
    public JButton[] calcbtn;
    public JTextField textfield;
    BasicCalc calc;
//    public JButton _one;
//    public JButton _two;
//    public JButton _three;
//    public JButton _four;
//    public JButton _five;
//    public JButton _six;
//    public JButton _seven;
//    public JButton _eight;
//    public JButton _night;
//    public JButton _zero;
//    public JButton _dot;
//    public JButton _plus;
//    public JButton _mutiply;
//    public JButton _minus;
//    public JButton _divide;
//    public JButton _equals;

    public UIControl() {
        calc = new BasicCalc();
        initUI();

    }

    public void initUI() {
        mycalculator = new JFrame();
        mycalculator.setTitle("计算器");
        mycalculator.setSize(460, 520);
        mycalculator.setLocationRelativeTo(null);
        mycalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mycalculator.setResizable(false);
        int btncount = 16;
//        mycalculator.setLayout(new GridLayout(5,4));
        mycalculator.setLayout(new FlowLayout());

        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(420, 60));
        textfield.setText("0");
//textfield.addActionListener(this);
        mycalculator.add(textfield);

        String tmpnum;
        calcbtn = new JButton[btncount];
//        for (int i = 0; i < 10; i++) {
//            calcbtn[i] = new JButton();
//            tmpnum = String.valueOf(i);
//            calcbtn[i].setText(tmpnum);
////            mycalculator.add(calcbtn[i]);
//        }
  calcbtn[0] = new JButton("1");
        calcbtn[1] = new JButton("2");
        calcbtn[2] = new JButton("3");
        calcbtn[3] = new JButton("+");
        calcbtn[4] = new JButton("4");
        calcbtn[5] = new JButton("5");
        calcbtn[6] = new JButton("6");
             calcbtn[7] = new JButton("-");
        calcbtn[8] = new JButton("7");
        calcbtn[9] = new JButton("8");
        calcbtn[10] = new JButton("9");
        calcbtn[11] = new JButton("*");
        calcbtn[12] = new JButton("C");
        calcbtn[13] = new JButton("0");
        calcbtn[14] = new JButton("=");
        calcbtn[15] = new JButton("/");
//        calcbtn[16] = new JButton(".");

//                        calcbtn[10]
//System.out.println(calcbtn[10].getText());
        for (int i = 0; i <= 15; i++) {
            calcbtn[i].setPreferredSize(new Dimension(100, 100));

            tmpnum = String.valueOf(i);
            mycalculator.add(calcbtn[i]);

//            mycalculator();
        }

        for (int i = 0; i <= 15; i++) {
            calcbtn[i].addActionListener(calc);
        }
//        calcbtn[15].addActionListener(calc);       

        mycalculator.setVisible(true);
    }

}
