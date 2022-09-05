package ch10.lecture.p04throws;

import java.sql.SQLException;

import javax.sql.DataSource;

public class C05Throws {
	
	static DataSource db = null; 
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("안댐");
		}
	}

	private static void method1() throws SQLException {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws SQLException {
		// TODO Auto-generated method stub
		method3();
	}

	private static void method3() throws SQLException {
		// TODO Auto-generated method stub
		db.getConnection();
	}
	
	
}
