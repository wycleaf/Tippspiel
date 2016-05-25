package aufgabe38;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;

import minichessBeispiel.GDI2MinichessGUI;

public class defActionListener implements ActionListener 
{
	GUI gui;
	
	public defActionListener(GUI gui) 
	{
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent actionEvent) 
	{
		// TODO Auto-generated method stub
			JButton definedDBconnector = (JButton)(actionEvent.getSource());
			this.gui.getPanel3().setVisible(true);
			this.gui.getAusgabebereich().setText((dbActions.connect("192.168.126.132"
					+ "", "EM2016","3306", "project", "GDI&GWI" + dbActions.paarungenAuslesen())));
			
			
			//
			
	}

}
