package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import static org.mockito.Mockito.mock;
import org.junit.Before;
import org.junit.Test;

import controlador.BeanProducto;

import static org.mockito.Mockito.*;

public class UsuarioTest {
	
	Producto usuario;
	
	@Before
	public void setUp(){
		usuario = mock(Producto.class);
	}
	
	@Test
	public void agregarProductoTest() throws SQLException{
		 
	}

}
