package GUI_practise;

import java.awt.*;
import java.awt.event.*;

// 简易计算器
public class Cal_Test {
    public static void main(String[] args) {
        new Calculator();
    }
}


class Calculator extends Frame{
    public Calculator(){
        // 3个文本框
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20); // 字符数

        // 按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(num1,num2,num3));
        // 要添加个监听事件 使其完成加法运算
        // 一个标签
        Label label = new Label("+");

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

class MyCalculatorListener implements ActionListener {
    private TextField num1,num2,num3;

    public MyCalculatorListener(TextField num1, TextField num2, TextField num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 监听代码
        // 获取 加数与被加数
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        // 将计算后的结果放在第三个框里
        num3.setText(""+(n1+n2));

        // 清楚前两个框的内容
        num1.setText(null);
        num2.setText(null);

    }
}