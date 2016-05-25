package aufgabe38;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class IndivActionListener implements ActionListener {
	GUI gui;
	private JFrame board2;
	private JTextField ip;
	private JTextField db;
	private JTextField pw;
	private JTextField user;
	private JTextField port;
	private JPanel panel2;
	
	public IndivActionListener(GUI gui) 
	{
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
		JButton invWindowOpener = (JButton)(actionEvent.getSource());
		JFrame board2 = new JFrame("Verbindungsdaten eingeben");
				
		gui.getPanel2().setVisible(true);
		
	}

}
