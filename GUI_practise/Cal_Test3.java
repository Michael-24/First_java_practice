package GUI_practise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
使用内部类 对功能进行更好的封装
 */
public class Cal_Test3 {
    public static void main(String[] args) {
        new Calculator3().loadFrame();
    }
}


class Calculator3 extends Frame {
    TextField num1,num2,num3;

    public void loadFrame(){
        // 3个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20); // 字符数

        // 按钮
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener());
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
    // 内部类最大的好处就是能够访问 外部的属性和方法
    private class MyCalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 获取 加数与被加数
            // 将计算后的结果放在第三个框里
            // 清楚前两个框的内容
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));
            num1.setText(null);
            num2.setText(null);

        }
    }

}