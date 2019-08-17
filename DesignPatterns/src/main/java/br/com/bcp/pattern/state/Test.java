package br.com.bcp.pattern.state;

class Test {
	String con;
	Controller controller;

	Test(final String con) {
		controller = new Controller();
		// the following trigger should be made by the user
		if (con.equalsIgnoreCase("management")) {
			controller.makeManagementConnection();
		}
		if (con.equalsIgnoreCase("sales")) {
			controller.makeSalesConnection();
		}
		if (con.equalsIgnoreCase("accounting")) {
			controller.makeAccountingConnection();
		}
		controller.open();
		controller.log();
		controller.close();
	}
}