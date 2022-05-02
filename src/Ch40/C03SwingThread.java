package Ch40;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class C01GUI extends JFrame implements ActionListener, KeyListener
{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JTextField txt1;
    JTextArea area1;
    JTextArea area2;
    JScrollPane scroll1;
    JScrollPane scroll2;
    Thread th1;
    Thread th2;

    C01GUI()
    {
        super(); //상위클래스 생성자 호출

        setTitle("Listener 적용하기");

        //패널 추가
        JPanel pan1 = new JPanel();

        //배경 색 지정
        Color col = new Color(100, 244, 237); //RGB 값
        pan1.setBackground(col);

        //컴포넌트 객체 생성
        btn1 = new JButton("시작");
        btn2 = new JButton("중지");

        btn3 = new JButton("시작");
        btn4 = new JButton("중지");
        txt1 = new JTextField();
        area1 = new JTextArea();
        area2 = new JTextArea();
        scroll1 = new JScrollPane(area1);
        scroll2 = new JScrollPane(area2);

        //컴포넌트 위치 지정
        btn1.setBounds(50, 400, 80, 30);
        btn2.setBounds(160, 400, 80, 30);
        btn3.setBounds(300, 400, 80, 30);
        btn4.setBounds(410, 400, 80, 30);
        txt1.setBounds(50, 350, 190, 30);
        //area1.setBounds(50,50,190,280); -> Scroll 추가시 제거
        scroll1.setBounds(50, 50, 190, 280);
        scroll2.setBounds(300, 50, 190, 280);

        //컴포넌트를 리스너에 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        txt1.addKeyListener(this);

        //기타설정
        area1.setEditable(false);
        area2.setEditable(false);

        //패널에 컴포넌트 추가
        pan1.add(btn1);
        pan1.add(btn2);
        pan1.add(btn3);
        pan1.add(btn4);
        pan1.add(txt1);
        //pan1.add(area1); -> Scroll 추가시 제거
        pan1.add(scroll1);
        pan1.add(scroll2);
        //레이아웃 null
        pan1.setLayout(null);

        //패널을 프레임에 추가
        add(pan1);

        setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn1)
        {
            //스레드1 시작
            C03Task1 worker1 = new C03Task1(this); // this : 만들어지는 C01GUI 객체주소
            th1 = new Thread(worker1);
            th1.start();
        }
        if(e.getSource() == btn2)
        {
            //스레드1 중지
            th1.interrupt();
        }
        if(e.getSource() == btn3)
        {
            //스레드2 시작
            C03Task2 worker2 = new C03Task2(this);
            th2 = new Thread(worker2);
            th2.start();
        }
        if(e.getSource() == btn4)
        {
            //스레드2 중지
            th2.interrupt();
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == 10)
        {
            String tmp = txt1.getText();
            area1.append(tmp + "\n");
            txt1.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
}

public class C03SwingThread
{
    public static void main(String[] args)
    {
        new C01GUI();
    }
}
