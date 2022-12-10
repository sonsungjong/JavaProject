package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUse1 {
	public static void main(String[] args) {
		DBUser1 dbuser1 = new DBUser1();
//		dbuser1.connect();
//		dbuser1.insert();
		
//		dbuser1.connect();
//		dbuser1.update();
		
//		dbuser1.connect();
//		dbuser1.delete();
		
		dbuser1.connect();
		dbuser1.select();
		
	}
}

class DBUser1{
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	
	public DBUser1() {
		try {
			System.out.println("생성자 사용");
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("DB연결 성공");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}
	
	public void select() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM worker";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				
				System.out.println(id+" "+name+" "+gender);
			}
		} catch (SQLException e) {
			System.out.println("드라이버 select 실패"+e);
		}finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO worker (name, gender) VALUES('gray','man')";
			int count = stmt.executeUpdate(sql);
			if(count > 0) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("입력 실패");
			}
		}catch(Exception ie) {
			System.out.println("insert Fail");
			ie.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	public void update() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "Update worker Set gender = 'woman' where name='black'";
			int count = stmt.executeUpdate(sql);
			if(count > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		}catch(SQLException ue) {
			System.out.println("수정 Fail");
			ue.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "DELETE FROM worker WHERE id = '5'";
			int count = stmt.executeUpdate(sql);
			if(count > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}catch(Exception e) {
			System.out.println("삭제 Fail");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}