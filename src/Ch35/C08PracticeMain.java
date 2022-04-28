package Ch35;

import javax.swing.*;
import java.awt.*;

class testGUI extends JFrame
{
    testGUI()
    {
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Chatting Server");
        JButton b1 = new JButton("파일로저장");
        JButton b2 = new JButton("1 : 1 요청");
        JButton b3 = new JButton("대화기록보기");
        JButton b4 = new JButton("입력");
        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        JTextField field = new JTextField();

        label.setBounds(150, 1, 200, 50);
        b1.setBounds(350, 80, 100, 30);
        b2.setBounds(350, 170, 100, 30);
        b3.setBounds(350, 260, 100, 30);
        b4.setBounds(350, 350, 100, 30);
        field.setBounds(50, 350, 190, 30);
        scroll.setBounds(50, 50, 190, 280);

        Font font = new Font("D2 coding", Font.BOLD, 24);
        Font font2 = new Font("D2 coding", Font.BOLD, 12);
        label.setFont(font);
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        field.setFont(font2);
        scroll.setFont(font2);


        panel.setLayout(null);
        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(scroll);
        panel.add(field);

        add(panel);

        setBounds(100, 100 ,500 ,500);
        setVisible(true);
    }
}

public class C08PracticeMain
{
    public static void main(String[] args)
    {
        new testGUI();
    }
}
