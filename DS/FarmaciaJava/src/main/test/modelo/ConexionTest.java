package modelo;


import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ConexionTest{
	
	Conexion conexion;
	Connection connection;
	
	
	@Before
	public void setUp(){
		 connection = mock(Connection.class);
		 conexion = new Conexion();
		 
	}
	
	@Test
	public void crearConexionTest() throws SQLException{
		when(DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=FarmaciaWeb;user=sa;password=sa;")).thenReturn(connection);
		assertTrue(conexion.crearConexion());
		
		
		
		
	}
	
	@Test
	public void crearConexionTestFalse() throws SQLException{
		when(DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=FarmaciaWeb;user=sa;password=sa;")).thenThrow(new SQLException ());
		assertFalse(conexion.crearConexion());
		
		
		
		
	}
	
	
	
	@Test
	public void cerrarConexionTest() throws SQLException{
			
		
		
	}
}
