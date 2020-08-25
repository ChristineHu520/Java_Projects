package com.tcp.demo1_TcpClient;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ChristineHu
 * @date 2020-08-25 8:32
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，服务器".getBytes());
        socket.close();
    }
}
