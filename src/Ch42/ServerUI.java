package Ch42;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ServerUI extends JFrame implements KeyListener
{
    JTextArea area;
    JTextField txt;
    ServerSocket server;
    Socket client;
    ServerUI()
    {
        super("Chat Server");

        //패널
        JPanel pan = new JPanel();
        pan.setLayout(null);

        //컴포넌트
        area = new JTextArea();
        txt = new JTextField();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(10, 10, 260, 300);
        txt.setBounds(10, 320, 260, 30);
        area.setEditable(false);

        //이벤트 리스너 등록
        txt.addKeyListener(this);

        //패널에 추가
        pan.add(scroll);
        pan.add(txt);

        //프레임에 추가
        add(pan);

        setBounds(100, 100, 300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try
        {
            server = new ServerSocket(7777);
            client = server.accept();

            //3 스레드 객체 생성
            ServerRecvThread recv = new ServerRecvThread(client, this);//client : 소켓수신용
                                                                       //this(GUI 객체): 수신한 문자열을 area 에 append 하기위함
            Thread th1 = new Thread(recv);
            //4 스레드 동작\
            th1.start();

            area.append(client.getInetAddress() + "에서 접속했습니다.\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getSource() == txt)
        {
            if(e.getKeyCode() == 10)
            {
                //입력한 내용이 클라이언트로 전달되어야한다
                try
                {
                    DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
                    Dout.writeUTF(txt.getText());
                    Dout.flush();
                }
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
                //Send 스레드에 입력한 내용을 전달
                area.append("[Server] : " + txt.getText() + "\n");
                txt.setText("");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    public static void main(String[] args)
    {
        new ServerUI();
    }


}
