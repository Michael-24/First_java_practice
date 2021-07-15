package GUI_practise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        // 设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 布局能够确定按钮等元素的位置布局
        frame.setSize(200,200);
        frame.setVisible(true);
        // 添加 button 按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // 增加一个监听器 能够关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
