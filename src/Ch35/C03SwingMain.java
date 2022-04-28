package Ch35;

import javax.swing.*;
import java.awt.*;

//Panel
//- 컴포넌트들을 그룹화 하는데 사용되는 단위
//- 일반적으로 Frame에 컴포넌트들을 직접 붙이지 않고
//- Panel에 그룹별로 붙이고 Panel을 Frame에 다시 연결하는 방법을 사용

class C03GUI extends JFrame
{
    C03GUI()
    {
        super(); //상위클래스 생성자 호출
        setTitle("세번째 프레임입니다");

        //패널 추가
        JPanel pan1 = new JPanel();

        //배경 색 지정
        Color col = new Color(31, 105, 95); //RGB 값
        pan1.setBackground(col);

        //패널을 프레임에 추가
        add(pan1);

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class C03SwingMain
{
    public static void main(String[] args)
    {
        new C03GUI();
    }
}
