package aufgabe38;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Verbinden implements ActionListener {
	GUI gui;
	private JFrame board2;
	private JTextField ip;
	private JTextField db;
	private JTextField pw;
	private JTextField user;
	private JTextField port;
	private JPanel panel2;
	
	public Verbinden(GUI gui) 
	{
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
		JButton connect = (JButton)(actionEvent.getSource());
		
		this.gui.getAusgabebereich().setText(dbActions.connect(gui.getIp().getText(),
				gui.getDb().getText(), gui.getPort().getText(), gui.getUser().getText(),
				gui.getPw().getText()) + dbActions.paarungenAuslesen()); 		
		this.gui.getPanel3().setVisible(true);
		
	}

}
