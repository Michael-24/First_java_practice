package GUI_practise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAction {
    public static void main(String[] args) {
        // 三个按钮公用一个监听
        Frame frame = new Frame("Hello");
        Button button01 = new Button("start");
        Button button02 = new Button("stop");
        Button button03 = new Button("hold");
//        button02.setActionCommand("stop"); 这里可以显示的定义出发后返回的信息
        MyMonitor myMonitor = new MyMonitor();
        button01.addActionListener(myMonitor);
        button03.addActionListener(myMonitor);
        button02.addActionListener(myMonitor);
        frame.add(button01, BorderLayout.WEST);
        frame.add(button02, BorderLayout.CENTER);
        frame.add(button03, BorderLayout.EAST);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

class MyMonitor implements ActionListener{
    @Override //相当于"监听" 鼠标的动作
    public void actionPerformed(ActionEvent e) {
        // e.getActionCommend() 获得按钮的信息
        System.out.println("按钮被点击了 -> "+e.getActionCommand());
    }
}