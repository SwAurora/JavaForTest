package Ch43;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.*;


import java.net.*;

public class ServerUI extends JFrame
{

    JTextArea area;
    JTextField txt;
    ServerSocket server;
    Socket client;
    ServerBackground background;

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
        scroll.setBounds(10, 10, 550, 550);
        //txt.setBounds(10,320,260,30);


        //패널에 추가
        pan.add(txt);
        pan.add(scroll);
        //프레임에 추가
        add(pan);

        this.setBounds(100, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        background = new ServerBackground(this, client);


    }


    public static void main(String[] args)
    {
        new ServerUI();
    }
}