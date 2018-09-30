/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolcalc;

import static coolcalc.CoolCalc._control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CoolCats
 */
public class BasicCalc implements ActionListener {

    StringBuilder builder;
    public String firstNum;
    public String secondNum;
    public String currentNum;
    public String currentOperator;
    public String result;

    public void processCalc(String command) {
        System.out.println("000");
    }

    public BasicCalc() {
        currentOperator = new String();
        firstNum = new String();
        secondNum = new String();
        result = new String();
        currentNum = new String();
        firstNum = "0";
        secondNum = "0";
        result = "0";
//        builder.append(currentNum).append("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getActionCommand());
//        processCalc(e.getActionCommand());
        String command = e.getActionCommand();
        currentNum = _control.textfield.getText().trim();
//        builder.append(command);
        System.out.println("CurrentNum:" + currentNum);
        /**
         * 判断，若当前数值为0，则考虑接受数值，否则考虑追加数字或者接受操作符
         */
        /**
         * 判断接收到的操作符类型，执行对应操作
         *
         */
        switch (command) {
            case "+":
                firstNum = _control.textfield.getText().trim();
                currentOperator = "+";
                _control.textfield.setText("0");

                break;
            case "-":
                firstNum = _control.textfield.getText().trim();
                currentOperator = "-";
                _control.textfield.setText("0");

                break;
            case "*":
                firstNum = _control.textfield.getText().trim();
                currentOperator = "*";
                _control.textfield.setText("0");

                break;
            case "/":
                firstNum = _control.textfield.getText().trim();
                currentOperator = "/";
                _control.textfield.setText("0");

                break;

            case "C":
                _control.textfield.setText("0");
                currentOperator = new String();
                firstNum = new String();
                secondNum = new String();
                result = new String();
                currentNum = new String();
                break;
            case "=":
                secondNum = _control.textfield.getText().trim();

                switch (currentOperator) {
                    case "+":
                        result = add(firstNum, secondNum);
                        break;
                    case "-":
                        result = minus(firstNum, secondNum);
                        break;
                    case "*":
                        result = mutiply(firstNum, secondNum);
                        break;
                    case "/":
                        result = divide(firstNum, secondNum);
                        break;

                }

                System.out.println("Second:" + secondNum);

                _control.textfield.setText(result);
                System.out.println("Result:" + result);
                break;
            default:
                System.out.println("F:" + firstNum);
                System.out.println("Operator:" + currentOperator);
        }

        switch (command.trim()) {
            case "0":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
//                    _control.textfield.setText(builder.toString());
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "1":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
//                System.out.println(e.getActionCommand());
                break;
            case "2":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "3":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "4":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }

                break;
            case "5":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }

                break;
            case "6":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "7":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "8":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;
            case "9":
                if (Integer.valueOf(currentNum) == 0) {
                    System.out.println("n");
                    _control.textfield.setText(command);
                } else {
                    builder = new StringBuilder();
                    builder.append(currentNum).append(command);
                    _control.textfield.setText(builder.toString());

                }
                break;

        }
//        String str = _control.textfield.getText();
//        System.out.println(str);
//       

    }

    public String add(String a, String b) {
        int _a = Integer.valueOf(a);
        int _b = Integer.valueOf(b);
        return String.valueOf(_a + _b);
    }

    public String minus(String a, String b) {
        int _a = Integer.valueOf(a);
        int _b = Integer.valueOf(b);
        return String.valueOf(_a - _b);
    }

    public String mutiply(String a, String b) {
        int _a = Integer.valueOf(a);
        int _b = Integer.valueOf(b);
        return String.valueOf(_a * _b);
    }

    public String divide(String a, String b) {
        int _a = Integer.valueOf(a);
        int _b = Integer.valueOf(b);
        return String.valueOf(_a / _b);
    }
}
