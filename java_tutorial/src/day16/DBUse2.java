package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUse2 {
	public static void main(String[] args) {
		// 프로젝트 속성 -> Java Build Path -> Libraries -> Classpath -> Add External JARs... -> ojdbc6.jar 또는 mysql-connector-java-8.0.28.jar (C:\\Program Files (x86)\\MySQL\\Connector J 8.0\\)
		DBUser2 dbuser2 = new DBUser2();
		
		//dbuser2.connect();
		//dbuser2.select();
		
		//dbuser2.connect();
		//dbuser2.insert();
		
		//dbuser2.connect();
		//dbuser2.update();
		
		//dbuser2.connect();
		//dbuser2.delete();
		
		dbuser2.connect();
		dbuser2.select();
	}
}

class DBUser2{
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";				// 스키마명
	
	static {
		try {
			System.out.println("static 사용");
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM worker";				// 테이블명
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3));
				System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getString("gender"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public void insert() {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO worker (name, gender) VALUES(?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "pink");				// ? 기준 (첫번째 ?)
			pstmt.setString(2, "woman");			// 두번째 ?
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("DB입력 성공");
			}else {
				System.out.println("DB입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		PreparedStatement pstmt = null;
		String sql = "UPDATE worker SET name = ? WHERE id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "sky");			// 첫번째 ?
			pstmt.setInt(2, 1);						// 두번째 ?
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public void delete() {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM worker WHERE id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 6);
			int count = pstmt.executeUpdate(); 
			
			if(count > 0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close();conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
}