package br.com.bcp.pattern.mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The MediatorDemo class will show the cooperation among the classes.
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
class MediatorDemo extends JFrame implements ActionListener {
	public static void main(final String[] args) {
		new MediatorDemo();
	}

	Mediator med = new Mediator();

	MediatorDemo() {
		final JPanel p = new JPanel();
		p.add(new BtnView(this, med));
		p.add(new BtnBook(this, med));
		p.add(new BtnSearch(this, med));
		getContentPane().add(new LblDisplay(med), "North");
		getContentPane().add(p, "South");
		setSize(400, 200);
		setVisible(true);

	}

	public void actionPerformed(final ActionEvent ae) {
		final Command comd = (Command) ae.getSource();
		comd.execute();
	}
}
