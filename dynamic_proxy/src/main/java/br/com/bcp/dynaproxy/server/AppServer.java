package br.com.bcp.dynaproxy.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import br.com.bcp.dynaproxy.client.Report;
import br.com.bcp.dynaproxy.client.User;

/**
 * Run a service that receives (accept) remote requests for report.
 * 
 * @author bruno.proenca
 */
public class AppServer implements Runnable {

	public void start() {
		new Thread(this).start();
	}

	public void run() {
		try {
			ServerSocket server = new ServerSocket(7080);
			while (true) {
				Socket socket = server.accept();
				System.out.println("received invocation from:" + socket.getRemoteSocketAddress());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				String command = ois.readUTF();
				if ("printReport".equals(command)) {
					Report report = new SimpleReport();
					@SuppressWarnings("unchecked")
					String result = report.printReport((List<User>) ois.readObject());

					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					oos.writeObject(result);
				} else {
					System.err.println("command not found: " + command);
				}
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
