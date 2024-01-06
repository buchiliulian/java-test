package practice.jframe;

import javax.swing.*;
import java.awt.*;

public class Example2 {
    public static void main(String[] args) {
        new FrameWithBoxLayout().display();
    }
}
class FrameWithBoxLayout extends JFrame{
    Box box1,box2,box,box3;
    public void display(){
        box1 = Box.createVerticalBox();
        box2 = Box.createVerticalBox();
        box = Box.createHorizontalBox();
        box3 = Box.createVerticalBox();
        box1.add(new JLabel("用户名："));
        box1.add(Box.createVerticalStrut(10));
        box1.add(new JLabel("密码："));
        box1.add(Box.createVerticalStrut(10));
        box1.add(new JLabel("重置密码："));
        box2.add(new JTextField(10));
        box2.add(Box.createVerticalStrut(10));
        box2.add(new JTextField(10));
        box2.add(Box.createVerticalStrut(10));
        box2.add(new JTextField(10));
        box.add(box1);
        box.add(Box.createHorizontalStrut(10));
        box.add(box2);
        box3.add(box);
        box3.add(Box.createVerticalStrut(10));
        box3.add(new JButton("提交"));
        add(box3, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}