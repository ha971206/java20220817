package Memo.inflearn.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 준비");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결");
			System.out.println("socket : " + socket);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(socket != null)
						socket.close();
					if(serverSocket != null)
						serverSocket.close();
				} catch (IOException e) {
					 
					e.printStackTrace();
				}
		}
	}
}
