package br.com.bcp.pattern.command.javacamp;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

class Test extends JFrame {
	public static void main(final String[] args) {
		new Test();
	}

	Test() {
		final Action ea = new ExitAction("Exit", null, this);
		final Action sa = new SubmitAction("Submit", null, this);

		final JMenuBar jbr = new JMenuBar();
		final JMenu dropmenu = new JMenu("File");
		final JMenuItem submitmenu = new JMenuItem(sa);
		final JMenuItem exitmenu = new JMenuItem(ea);
		dropmenu.add(submitmenu);
		dropmenu.add(exitmenu);
		jbr.add(dropmenu);
		setJMenuBar(jbr);

		final JPopupMenu pop = new JPopupMenu("PopMenu");
		pop.add(sa);
		pop.add(ea);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent e) {
				showPopup(e);
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(final MouseEvent e) {
				if (e.isPopupTrigger()) {
					pop.show(e.getComponent(), e.getX(), e.getY());
				}
			}

		});
		final JPanel jp = new JPanel();
		final JButton subbtn = new JButton(sa);
		final JButton exitbtn = new JButton(ea);
		jp.add(subbtn);
		jp.add(exitbtn);

		final Container con = getContentPane();
		con.add(jp, "South");

		setTitle("Command pattern example");
		setSize(400, 200);
		setVisible(true);
	}
}
