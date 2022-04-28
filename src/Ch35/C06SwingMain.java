package Ch35;

import javax.swing.*;
import java.awt.*;

class C06GUI extends JFrame
{
    C06GUI()
    {
        super(); //상위클래스 생성자 호출
        setTitle("여섯번째 프레임입니다");

        //패널 추가
        JPanel pan1 = new JPanel();

        //배경 색 지정
        Color col = new Color(100, 244, 237); //RGB 값
        pan1.setBackground(col);

        //버튼 객체 생성
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");

        //텍스트 필드 객체 생성
        JTextField txt1 = new JTextField();

        //텍스트Area 객체 생성
        JTextArea area1 = new JTextArea();
        area1.setBounds(50,50,190,280);

        //텍스트 필드 위치 지정
        txt1.setBounds(50, 350, 190, 30);

        //버튼 위치 지정
        btn1.setBounds(50, 400, 80, 30);
        btn2.setBounds(160, 400, 80, 30);
        btn3.setBounds(270, 400, 80, 30);
        btn4.setBounds(380, 400, 80, 30);

        //버튼 패널에 추가
        pan1.add(btn1);
        pan1.add(btn2);
        pan1.add(btn3);
        pan1.add(btn4);
        pan1.add(txt1);
        pan1.add(area1);

        //레이아웃 null
        pan1.setLayout(null);

        //패널을 프레임에 추가
        add(pan1);

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class C06SwingMain
{
    public static void main(String[] args)
    {
        new C06GUI();
    }
}
