package Ch43;

import java.io.*;
import java.net.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServerBackground
{
    ServerSocket server;
    Socket client;
    ServerUI gui;
    Map<String, DataOutputStream> ClientList;


    ServerBackground(ServerUI ui, Socket client)
    {
        gui = ui;
        this.client = client;
        ClientList = new HashMap();
        Collections.synchronizedMap(ClientList);


        try
        {

            server = new ServerSocket(5555);

            while(true)
            {
                gui.area.append("서버 접속 요청 대기중....\n");
                client = server.accept();
                gui.area.append(client.getInetAddress() + " 에서 접속중..\n");

                ServerRecvThread recv = new ServerRecvThread(client, this, gui);
                Thread th = new Thread(recv);
                th.start();

            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public void addClient(String nick, DataOutputStream Dout)
    {
        broadCast(nick + " 님이 접속하셨습니다\n");
        ClientList.put(nick, Dout);

    }

    public void removeClient(String nick)
    {
        gui.area.append(nick + " 님이 퇴장하셨습니다\n");
        ClientList.remove(nick);
    }

    public void broadCast(String msg)
    {
        Iterator<String> iter = ClientList.keySet().iterator();
        String key = "";
        while(iter.hasNext())
        {
            key = iter.next();
            try
            {
                ClientList.get(key).writeUTF(msg);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }


}