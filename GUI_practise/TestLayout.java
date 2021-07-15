package GUI_practise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
//        frame.setBounds(200,200,500,500);
        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setBackground(Color.BLACK);
        Panel panel01 = new Panel(new BorderLayout());
        // 设置表格布局 设置的是2行1列的布局
        Panel panel02 = new Panel(new GridLayout(2,1));
        Panel panel03 = new Panel(new BorderLayout());
        Panel panel04 = new Panel(new GridLayout(2,2));

        panel01.add(new Button("east-1"),BorderLayout.EAST);
        panel01.add(new Button("wast-1"),BorderLayout.WEST);
        panel02.add(new Button("p2-button-01"));
        panel02.add(new Button("p2-button-02"));
        panel01.add(panel02,BorderLayout.CENTER);

        panel03.add(new Button("east-2"),BorderLayout.EAST);
        panel03.add(new Button("west-2"),BorderLayout.WEST);
        panel04.add(new Button("p4-button-01"));
        panel04.add(new Button("p4-button-02"));
        panel04.add(new Button("p4-button-03"));
        panel04.add(new Button("p4-button-04"));
        panel03.add(panel04,BorderLayout.CENTER);

        // 最后把面板spanel 加在frame上
        frame.add(panel01);
        frame.add(panel03);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
