package br.com.bcp.dynaproxy.server;

import java.util.List;

import br.com.bcp.dynaproxy.client.Report;
import br.com.bcp.dynaproxy.client.User;

/**
 * @author bruno.proenca
 */
public class SimpleReport implements Report {

	public String printReport(List<User> users) {
		StringBuilder builder = new StringBuilder();
		
		for (User user : users) {
			builder.append(user.toString()).append("\n");
		}
		
		return builder.toString();
	}

}
