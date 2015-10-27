package modelo;

import java.sql.*;

public class Conexion implements iConexion {

	private Connection con = null;

	public Conexion() {
		
	}
	
	public Connection getConexion(){
		return con;
	}
	
	public boolean cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean crearConexion() {
			try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url = "jdbc:sqlserver://localhost;databaseName=FarmaciaWeb;user=sa;password=sa;";
            con= DriverManager.getConnection(url);		
            } catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
			
			return true;
		
	}
}