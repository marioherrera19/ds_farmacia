package modelo;


import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ConexionTest{
	
	Conexion conexion;
	Connection mockCon;
	Connection con;
	
	@Before
	public void setUp(){
		 mockCon = mock(Connection.class);
         conexion = mock(Conexion.class);		
	}
	
	@Test
	public void getConexion(){
		when(conexion.getConexion()).thenReturn(con);
		mockCon = conexion.getConexion();
		assertEquals(mockCon, con);
	}
	
	@Test
	public void cerrarConexionTest() throws SQLException{
	
		
	}
}
