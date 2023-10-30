package chap_15;

import javax.swing.*;
public class JFrame3Demo extends JFrame {
    JFrame3Demo(){
        setTitle("안녕, 스윙!");

        JButton b = new JButton("버튼");
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame3Demo();
    }

}

