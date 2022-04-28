package Ch37;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

class C06GUI extends JFrame implements ActionListener, KeyListener
{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JTextField txt1;
    JTextArea area1;
    JScrollPane scroll1;

    C06GUI()
    {
        super(); //상위클래스 생성자 호출
        setTitle("Listener 적용하기");

        //패널 추가
        JPanel pan1 = new JPanel();

        //배경 색 지정
        Color col = new Color(100, 244, 237); //RGB 값
        pan1.setBackground(col);

        //컴포넌트 객체 생성
        btn1 = new JButton("입력");
        btn2 = new JButton("종료");
        btn3 = new JButton("파일로저장");
        txt1 = new JTextField();
        area1 = new JTextArea();
        scroll1 = new JScrollPane(area1);

        //컴포넌트 위치 지정
        btn1.setBounds(50, 400, 80, 30);
        btn2.setBounds(160, 400, 80, 30);
        btn3.setBounds(250, 50, 100, 30);
        txt1.setBounds(50, 350, 190, 30);
        //area1.setBounds(50,50,190,280); -> Scroll 추가시 제거
        scroll1.setBounds(50, 50, 190, 280);

        //컴포넌트를 리스너에 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        txt1.addKeyListener(this);

        //기타설정
        area1.setEditable(false);

        //패널에 컴포넌트 추가
        pan1.add(btn1);
        pan1.add(btn2);
        pan1.add(btn3);
        pan1.add(txt1);
        //pan1.add(area1); -> Scroll 추가시 제거
        pan1.add(scroll1);
        //레이아웃 null
        pan1.setLayout(null);

        //패널을 프레임에 추가
        add(pan1);

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn1)
        {
            String tmp = txt1.getText();
            area1.append(tmp + "\n");
            txt1.setText("");
        }
        if(e.getSource() == btn2)
        {
            System.exit(-1);
        }

        if(e.getSource() == btn3)
        {
            try
            {
                System.out.println("파일로 저장 버튼 클릭!");
                Writer out = new FileWriter("C:\\Users\\rlatj\\Downloads\\Dialog.txt", true);
                Date date = new Date(); // 날짜시간 정보 출력

                out.write(date + "\n");
                out.write(area1.getText());
                out.flush();
                out.close();
            }
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
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

public class C06SwingMain
{
    public static void main(String[] args)
    {
        new C06GUI();
    }
}
