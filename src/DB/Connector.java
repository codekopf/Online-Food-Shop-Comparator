package DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Item.Item;

public class Connector {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/online_food_shop_comparator";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";

	public static void main(String[] argv) {
		try {
			selectAllRecordsFromItemTable();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<Item> selectAllRecordsFromItemTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;
		ResultSet rs = null;
		List<Item> items = new ArrayList<Item>();

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			rs = statement.executeQuery("SELECT * FROM items");

			while (rs.next()) {
				Item item = new Item(rs.getInt("id"),rs.getString("name"),rs.getInt("unit"),rs.getDouble("weight"),rs.getLong("barcode"),rs.getString("kolonial"),rs.getString("kosik"),rs.getString("rohlik"),rs.getString("tesco"),rs.getString("albert"),rs.getString("dam"));
				items.add(item);		
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
		
		return items;
	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}
}