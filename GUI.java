package aufgabe38;


import java.awt.*;

import javax.swing.*;

import minichessBeispiel.GDI2MinichessActionListener;

public class GUI 
{
	private JFrame board;
	private JPanel hauptpanel;
	private JLabel label;
	private JTextField ip;
	private JTextField db;
	private JTextField pw;
	private JTextField user;
	private JTextField port;
	private ButtonGroup connect;
	private JButton defined;
	private JButton individual;
	private JPanel datenbankDatenPanel;
	private JFrame board2;
	private JLabel ipLabel;
	private JLabel portLabel;
	private JLabel dbLabel;
	private JLabel userLabel;
	private JLabel pwLabel;
	private JButton post;
	private JLabel dummy;
	private JTextArea ausgabebereich;
	private JPanel ausgabepanel;
	
	public JLabel getIpLabel() {
		return ipLabel;
	}

	public void setIpLabel(JLabel ipLabel) {
		this.ipLabel = ipLabel;
	}

	public JLabel getPortLabel() {
		return portLabel;
	}

	public void setPortLabel(JLabel portLabel) {
		this.portLabel = portLabel;
	}

	public JLabel getDbLabel() {
		return dbLabel;
	}

	public void setDbLabel(JLabel dbLabel) {
		this.dbLabel = dbLabel;
	}

	public JLabel getUserLabel() {
		return userLabel;
	}

	public void setUserLabel(JLabel userLabel) {
		this.userLabel = userLabel;
	}

	public JLabel getPwLabel() {
		return pwLabel;
	}

	public void setPwLabel(JLabel pwLabel) {
		this.pwLabel = pwLabel;
	}

	public JButton getPost() {
		return post;
	}

	public void setPost(JButton post) {
		this.post = post;
	}

	public JLabel getDummy() {
		return dummy;
	}

	public void setDummy(JLabel dummy) {
		this.dummy = dummy;
	}

	public JTextArea getAusgabebereich() {
		return ausgabebereich;
	}

	public void setAusgabe(JTextArea ausgabe) {
		this.ausgabebereich = ausgabe;
	}

	public JPanel getPanel3() {
		return ausgabepanel;
	}

	public void setPanel3(JPanel panel3) {
		this.ausgabepanel = panel3;
	}

	public JTextField getIp() {
		return ip;
	}

	public void setIp(JTextField ip) {
		this.ip = ip;
	}

	public JTextField getDb() {
		return db;
	}

	public void setDb(JTextField db) {
		this.db = db;
	}

	public JTextField getPw() {
		return pw;
	}

	public void setPw(JTextField pw) {
		this.pw = pw;
	}

	public JTextField getUser() {
		return user;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JTextField getPort() {
		return port;
	}

	public void setPort(JTextField port) {
		this.port = port;
	}

	public JFrame getBoard2() {
		return board2;
	}

	public void setBoard2(JFrame board2) {
		this.board2 = board2;
	}

	public JFrame getBoard() {
		return board;
	}

	public void setBoard(JFrame board) {
		this.board = board;
	}

	public JPanel getPanel() {
		return hauptpanel;
	}

	public void setPanel(JPanel panel) {
		this.hauptpanel = panel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public ButtonGroup getConnect() {
		return connect;
	}

	public void setConnect(ButtonGroup connect) {
		this.connect = connect;
	}

	public JButton getDefined() {
		return defined;
	}

	public void setDefined(JButton defined) {
		this.defined = defined;
	}

	public JButton getIndividual() {
		return individual;
	}

	public void setIndividual(JButton individual) {
		this.individual = individual;
	}

	public JPanel getPanel2() {
		return datenbankDatenPanel;
	}

	public void setPanel2(JPanel panel2) {
		this.datenbankDatenPanel = panel2;
	}
	
	
	
	{
		this.board = new JFrame("EM-Tippspiel 2016");
		this.board.setSize(1280, 720);
		this.board.setLayout(new BorderLayout());

		
		this.ausgabepanel = new JPanel();
		this.ausgabebereich = new JTextArea();
			
		hauptpanel = new JPanel();
		connect = new ButtonGroup();
		defined = new JButton("Mit dem VM-Datenbank-Server verbinden");
		individual = new JButton("Mit  einem eigenen Datenbank-Server verbinden");
		this.connect.add(this.defined);
		this.connect.add(this.individual);
		
		this.ip = new JTextField();
		this.port = new JTextField();
		this.db = new JTextField();
		this.user = new JTextField();
		this.pw = new JTextField();
		this.ipLabel = new JLabel("IP-Adresse des Datenbankservers:");
		this.dbLabel = new JLabel("Name der Datenbank:");
		this.portLabel = new JLabel ("Port des Datenbankservers:");
		this.userLabel = new JLabel ("Benutzername:");
		this.pwLabel = new JLabel ("Passwort zum Anmelden am Datenbankserver:");
		this.dummy = new JLabel ("");
		this.post = new JButton("Verbinden");
		
		defActionListener actionListener = new defActionListener(this);
		IndivActionListener actionListener2 = new IndivActionListener(this);
		Verbinden actionListener3 = new Verbinden(this);
		
		this.defined.addActionListener(actionListener);
		this.individual.addActionListener(actionListener2);
		this.post.addActionListener(actionListener3);
		
		
		
		datenbankDatenPanel = new JPanel(new GridLayout (6,2,2,2));
		
		this.ausgabepanel.add(this.ausgabebereich);
		
		this.datenbankDatenPanel.add(ipLabel);
		this.datenbankDatenPanel.add(ip);
		this.datenbankDatenPanel.add(portLabel);
		this.datenbankDatenPanel.add(port);
		this.datenbankDatenPanel.add(dbLabel);
		this.datenbankDatenPanel.add(db);
		this.datenbankDatenPanel.add(userLabel);
		this.datenbankDatenPanel.add(user);
		this.datenbankDatenPanel.add(pwLabel);
		this.datenbankDatenPanel.add(pw);
		this.datenbankDatenPanel.add(dummy);
		this.datenbankDatenPanel.add(post);
		
		
		
		this.post.addActionListener(actionListener3);
		this.ausgabebereich.setSize(700, 300);
		this.ausgabepanel.setSize(700, 300);
		this.ausgabepanel.setVisible(true);
		this.ausgabebereich.setSize(1280, 400);
		this.datenbankDatenPanel.setVisible(false);
		
		
		
		
		this.hauptpanel.add(this.defined);
		this.hauptpanel.add(this.individual);
		this.board.add(this.hauptpanel,BorderLayout.CENTER);	
		this.board.add(datenbankDatenPanel, BorderLayout.NORTH);
		this.board.add(ausgabepanel, BorderLayout.SOUTH);
		this.board.setVisible(true);
		
	}
	
}
