package GUI_practise;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    public void init(){
        JFrame jFrame = new JFrame("第一个JFrame项目");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
        JLabel label = new JLabel("this is first step");
        jFrame.add(label);

        // 让文本label居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = jFrame.getContentPane();
        container.setBackground(Color.YELLOW);
        // 设置窗口关闭
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
