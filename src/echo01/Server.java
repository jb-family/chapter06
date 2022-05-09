package echo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws IOException {

		
		ServerSocket serverSocket = new ServerSocket();
		//ip는 문자열 port는 내가 임의의 숫자입력해주면 됨.
		//serverSocket.bind(new InetSocketAddress(ip, port)); 문법 외워야함
		//입력하면 bind가 내 ip와 설정한 port번호에 누가 접근하는지 감시하고있음.
		serverSocket.bind(new InetSocketAddress("192.168.10.100", 10001));
		
		//accept()메소드는 접근할때 허락해주는 메소드. socket과 socket을 연결해줌.
		System.out.println("<서버시작>");
		System.out.println("==========================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//Client의 socket이 serverSocket과 연결됐다는 의미.
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		//메세지 받기용 Stream
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		//메세지 보내기용 Stream
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		//반복
		while(true) {
			
			//메세지 받기
			String msg = br.readLine();

			//주소비교 msg == null
			if(msg == null) {
				break;
			}
			System.out.println("받은메세지 :" + msg);
			//메세지 보내기
			//받은메세지를 다시 그대로 Client에 보낸다.
			bw.write(msg);
			bw.newLine();
			//BufferedReader에 데이터가 다 안담겨있어도 그냥 보내라는의미
			// flush()안쓰면 데이터가 덜 차있어서 메세지 안보내짐
			bw.flush();
		}
		
		
		
		
		
		
		
		System.out.println("==========================================");
		System.out.println("<서버종료>");
		bw.close();
		br.close();
		socket.close();
		serverSocket.close();
	}

}
