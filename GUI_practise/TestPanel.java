package GUI_practise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        // 布局
        frame.setLayout(null);
        //弹窗位置
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(1,1,1));
        // 设置布局的基础参数 相当于设置 setSize 大小和 setLocation位置
        panel.setBounds(50,50,400,400);
        // 设置背景颜色
        panel.setBackground(new Color(10, 20, 18));
        frame.add(panel);
        frame.setVisible(true);
        // 适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // 结束程序
                System.exit(0);
            }
        });
    }
}
