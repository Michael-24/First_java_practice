package GUI_practise;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //封装功能，可以展示多个窗口
        MyFrame myframe1 = new MyFrame(100,100,200,200,Color.BLUE);
        MyFrame myframe2 = new MyFrame(0,0,200,200,Color.YELLOW);
        MyFrame myframe3 = new MyFrame(100,0,200,200,Color.BLACK);
    }
}

class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x, int y, int w, int h,Color color){
        super("MyFrame"+(++id));
        setBounds(x,y,w,h);
        setVisible(true);
        setBackground(color);
        setResizable(false);
    }
}