/**
 * 
 */
package br.com.bcp.dynaproxy.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author bruno.proenca
 */
public class ReportFactory {

	/**
	 * @return Dynamically create a proxy implementation of the {@link Report} service. This impl. will
	 *         call the remote Report service (using Socket)
	 * @see RemoteReportHandler        
	 */
	public static Report createReport() {
		InvocationHandler handler = new RemoteReportHandler();
		return (Report) Proxy.newProxyInstance(ReportFactory.class.getClassLoader(),
				new Class[] { Report.class }, handler);
	}
}
