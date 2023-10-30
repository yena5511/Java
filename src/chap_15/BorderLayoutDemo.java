package chap_15;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo(){
        setTitle("보더 레이아웃!");
        setLayout(new BorderLayout());

        add("East", new JButton("동"));
        add("West", new JButton("서"));
        add("South", new JButton("북"));
        add(new JButton("북"), BorderLayout.NORTH);
        add(new JButton("중앙"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}


