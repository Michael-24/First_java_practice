package GUI_practise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.Buffer;

public class TaskActionLister {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();
        MyActionLister myActionLister = new MyActionLister();
        button.addActionListener(myActionLister);
        frame.add(button,BorderLayout.CENTER);

        windowClose(frame);
        frame.setVisible(true);
        frame.pack();
    }

    //关闭窗体事件
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionLister implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你已经点击了。");
    }
}
