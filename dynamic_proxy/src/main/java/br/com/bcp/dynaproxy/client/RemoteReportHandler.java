/**
 * 
 */
package br.com.bcp.dynaproxy.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * Invoke a remote Report service (using Socket)
 * 
 * @author bruno.proenca
 */
public class RemoteReportHandler implements InvocationHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("printReport".equals(method.getName())) {
			try {
				Socket socket = new Socket("127.0.0.1", 7080);

				ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
				output.writeUTF("printReport");
				output.writeObject(args[0]);

				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				Object result = ois.readObject();
				socket.close();
				return result;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		} else {
			throw new RuntimeException("Unknown method " + method.getName());
		}
	}

}
