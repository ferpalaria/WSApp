package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorMySQL {

public Connection connect(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			return DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/heroku_4cadf8bd68352b1", "b235ec78abf1db", "add78c33");
		}catch(Exception e){
			throw new Error(e);
		}
	}
	
	public boolean close(Connection connection){
		
		try{
			connection.close();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
}
