package GUI_practise;

import java.awt.*;

// GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame 对象
        Frame frame =new Frame("第一个GUI窗口");
        //设置可见性
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(400,400);
        //设置背景颜色
        frame.setBackground(new Color(185, 58, 49));
        //弹出的初始值
        frame.setLocation(200,200); //但无法手动接触。
        //设置大小固定 (不可拉伸)
        frame.setResizable(false);
    }
}
