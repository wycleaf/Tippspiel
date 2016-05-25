package aufgabe38;
import java.sql.*;

public class dbActions {
	
	private static Statement statement =null;
	private static Connection connection= null;
	private static String sql=null;
	private static ResultSet rs=null;
	GUI gui;
	
	public static String connect (String ipAdresse, String db, String port, String benutzerName, String passwort)
	{
		try
		{
			connection=DriverManager.getConnection(
					"jdbc:mysql://"+ipAdresse+":"+port + "/" + db +"?useSSL=false", benutzerName, passwort);
		statement = connection.createStatement();
		
		
		}
		catch (Exception e)
		{
			return "Verbindung konnte nicht hergestellt werden!";
			//throw new IllegalStateException(e);
		}
		return "Verbindung hergestellt!";
	}
	
	public static String paarungenAuslesen ()

	{
		
		try{
			rs = statement.executeQuery("SELECT * FROM spiele");
		
		while(rs.next())
		{
		return  rs.getString("datumuhrzeit")+ " " + rs.getString(5) + " " + rs.getString(6);
		}
		}
		catch (SQLException e)
		{
			return "Auslesen der Paarungen nicht möglich";
		}
		return "Auslesen der Paarungen nicht möglich";
	}

	public static String dBAnlegen()
	{
		try
		{
			statement = connection.createStatement();
				
			if(connection != null)
				{
					sql = "DROP DATABASE IF EXISTS EM2016";
					statement.executeUpdate(sql);
					sql = "CREATE DATABASE IF NOT EXISTS EM2016;";
					statement.executeUpdate(sql);
					return "Datenbank gelöscht und neu angelegt.";
				}
			else 
				{
				return "Bitte zuerst eine Verbindung zum Datenbankserver aufbauen.";
				}
		}
			catch (SQLException e)
			{
				e.printStackTrace();
				return "Datenbank konnte nicht gelöscht und neu angelegt werden."
						+ "Oben angegebener Fehler wurde ausgegeben.";
						
			}
	}
		
	public static String datenEingeben()
	{
		try
		{
		
		if (connection != null)
			{
			
				statement=connection.createStatement();
				sql = "LOAD DATA LOCAL INFILE 'spiele_test.txt' INTO TABLE EM2016.spiele"
						+ " FIELDS TERMINATED BY ';'"
						+ " LINES TERMINATED BY 'endOfLine';";
				statement.executeUpdate(sql);
				return "Daten wurden erfolgreich geladen.";
			}
		
		else return "Daten konnten nicht geladen werden.";
		}
			catch (SQLException e)
			{
				e.printStackTrace();
				return "Der oben angegebene Fehler ist beim Laden der Spiele aufgetreten.";
			}
			
				
		}	

	public static String tabelleAnlegen()
	{
		try
		{
			statement = connection.createStatement();
			if(connection != null)
				{
				sql = "DROP TABLE IF EXISTS EM2016.spiele";
				statement.executeUpdate(sql);
				sql = "CREATE TABLE IF NOT EXISTS EM2016.spiele ("
						+ "spieleid INT (10) NOT NULL AUTO_INCREMENT,"
						+ "spielbezeichnung VARCHAR (20) NULL DEFAULT NULL,"
						+ "spielort VARCHAR (20) NULL DEFAULT NULL,"
						+ "datumuhrzeit DATETIME NULL DEFAULT NULL,"
						+ "heimmannschaft VARCHAR (20) NULL DEFAULT NULL,"
						+ "gastmannschaft VARCHAR (20) NULL DEFAULT NULL,"
						+ "PRIMARY KEY(spieleid));";
				statement.executeUpdate(sql);
				return "Tabelle spiele erfolgreich gelöscht und neu angelegt.";
				}
				else return "Die Tabelle konnte nicht gelöscht und neu angelegt werden";
				}
			catch(SQLException e)
		{
				e.printStackTrace();
				return "Es ist der oben stehende Fehler beim Löschen oder Anlegen der Tabele spiele"
						+ "aufgetreten.";		
		}
	}
}
