package GUI_practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest extends JFrame {
    public DialogTest() {
        this.setVisible(true);
        this.setBounds(100,100,200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame页面放东西 需要 new 一个容器
        Container container = this.getContentPane();
        //绝对布局 绝对位置
        container.setLayout(null);

        // 按钮
        JButton button = new JButton("点击");
        button.setBounds(30,30,200,50);

        // 点击的时候需要监听
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                new MyDialog();
            }
        });
        container.add(button);

    }
    public static void main(String[] args) {
        new DialogTest();
    }
}

//弹窗
class MyDialog extends JDialog{
    public MyDialog(){
        this.setVisible(true);
        this.setBounds(100,100,500,500);

        Container container = this.getContentPane();
//        container.setLayout(null); 注释掉就会出现label标签的内容了
        container.setBackground(Color.WHITE);
        JLabel label = new JLabel("Dialog sdas ds asad asd sannadnsa");
        container.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);

    }
}
