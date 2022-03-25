package model;


import java.sql.*;

public class conexaoBanco {
	
	public static Connection conectar() {
	
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciadorcrud", "root", "");
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		
		
		
	}
	
}
