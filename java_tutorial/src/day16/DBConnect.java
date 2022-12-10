package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static void main(String[] args) {
		// 프로젝트 속성 -> Java Build Path -> Libraries -> Add External JARs... -> ojdbc6.jar 또는 mysql-connector-java-8.0.28.jar (C:\\Program Files (x86)\\MySQL\\Connector J 8.0\\)
		
		// 오라클 경로 : C:\\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\\ojdbc6.jar
		// MySQL 경로 : C:\\Program Files (x86)\\MySQL\\Connector J 8.0\\mysql-connector-java-8.0.28.jar
		
		SQLConnector sqlc = new SQLConnector();
	}
}

class SQLConnector{
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			try {
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}