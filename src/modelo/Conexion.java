package modelo;

import java.sql.*;

public class Conexion {

	private Connection con = null;

	public Conexion() {
		try {
			System.out.println("si hice cambios");
			System.out.println("Imprime");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url = "jdbc:sqlserver://localhost;databaseName=DBVentas;user=sa;password=sa;";
            con= DriverManager.getConnection(url);		
            } catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConexion(){
		return con;
	}
	
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}