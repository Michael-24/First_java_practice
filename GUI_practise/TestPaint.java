package GUI_practise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
简单图形的绘制
 */
public class TestPaint {
    public static void main(String[] args) {
            new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    // 画笔相关设置
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);// 设置画笔的颜色
//        g.drawOval(100,100,100,100); //空心圆
        g.fillOval(100,100,100,100); // 实心圆
        g.setColor(Color.GREEN);
        g.fillRect(160,200,200,200);

        //用完之后,需还原到最初的颜色

    }
}