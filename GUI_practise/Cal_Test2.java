package GUI_practise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
简易计算机: 优化代码(面向对象)
 */
public class Cal_Test2 {
    public static void main(String[] args) {
        new Calculator2().LoadFrame();
    }
}


class Calculator2 extends Frame {
    // 属性
    TextField num1,num2,num3;
    public void LoadFrame(){
        // 3个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20); // 字符数

        // 按钮
        Button button = new Button("=");
        Label label = new Label("+");
        button.addActionListener(new CalculatorListener(this));
        // 要添加个监听事件 使其完成加法运算
        // 一个标签

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}

class CalculatorListener implements ActionListener {
    // 获取计算器这个对象
    Calculator2 calculator=null;

    public CalculatorListener(Calculator2 calculator){
        this.calculator = calculator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 监听代码
        // 获取 加数与被加数
        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());
        // 将计算后的结果放在第三个框里
        calculator.num3.setText(""+(n1+n2));
        // 清楚前两个框的内容
        calculator.num1.setText(null);
        calculator.num2.setText(null);

    }
}