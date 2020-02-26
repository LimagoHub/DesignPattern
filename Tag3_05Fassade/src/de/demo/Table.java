package de.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Table implements AutoCloseable{
	
	private final String select;
	private final static String DRIVER ="com.mysql.cj.jdbc.Driver";
	private final static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/bsm?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private int columntCount = -1;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;
	private Map<String, String> zeile = null;

	public Table(String select) {
		this.select = select;
	}
	
	public int getColumnCount() throws Exception{
		if(columntCount < 0) {
			columntCount = getResultSetMetaData().getColumnCount();
		}
		return columntCount;
	}
	
	public String getColumnName(int column)  throws Exception {
		
		return getResultSetMetaData().getColumnName(column + 1);
	}
	
	public String getValue(int column)  throws Exception {
		return getValue(getColumnName(column));
	}
	
	public String getValue(String columnName)  throws Exception {
		return getZeile().get(columnName);
	}
	
	public boolean next() throws Exception{
		if(getResultSet().next()) {
			dataExchange();
			return true;
		}
		return false;
	}
	
	private void dataExchange() throws Exception {
		for(int column = 0; column < getColumnCount(); column ++) {
			getZeile().put(getColumnName(column),getResultSet().getString(getColumnName(column)));
		}
	}

	@Override
	public void close()  {
		try {
			if(resultSet != null)
				resultSet.close();
			
			if(statement != null)
				statement.close();
			
			if(connection != null)
				connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private String getSelect() {
		return select;
	}


	private Connection getConnection() throws Exception{
		if(connection == null) {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(CONNECTION_STRING,"root","yop49JZ");
		}
		return connection;
	}

	private Statement getStatement() throws Exception{
		if(statement == null) {
			statement = getConnection().createStatement();
		}
		return statement;
	}

	private ResultSet getResultSet() throws Exception{
		if(resultSet == null) {
			resultSet = getStatement().executeQuery(getSelect());
		}
		return resultSet;
	}

	private ResultSetMetaData getResultSetMetaData() throws Exception{
		if(resultSetMetaData == null) {
			resultSetMetaData = getResultSet().getMetaData();
		}
		return resultSetMetaData;
	}

	private Map<String, String> getZeile() throws Exception{
		
		if(zeile == null) {
			zeile = new HashMap<String, String>();
			for(int column = 0; column < getColumnCount(); column ++) {
				zeile.put(getColumnName(column),"****");
			}
		}
		return zeile;
	}
	
	
	

}
