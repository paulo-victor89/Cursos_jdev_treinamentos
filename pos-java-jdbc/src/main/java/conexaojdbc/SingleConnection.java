package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5433/posjava?";
			//+ "useTimezone=true&serverTimezone=UTC";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;

	static {
		conectar();
	}

	public SingleConnection() {
		conectar();
	}

	private static void conectar() {
		try {
			
			if(connection==null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou com sucesso\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static Connection getConnection() {
		return connection;
	}

}
