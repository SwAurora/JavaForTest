package Ch35;

import javax.swing.*;

public class C01SwingMain
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("첫번째 프레임입니다");      //프레임창 객체 생성
        //frame.setTitle("첫번째 프레임입니다");                      //프레임창 제목
        frame.setBounds(100, 100, 700, 700);    //프레임창 위치
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //프레임 x버튼 클릭시 종료
        frame.setVisible(true);                                      //프레임창 표시 여부
    }
}
