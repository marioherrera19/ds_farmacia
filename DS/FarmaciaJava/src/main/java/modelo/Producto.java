package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import controlador.BeanProducto;

public class Producto {
	 
	 public static boolean agregarProducto(BeanProducto usuario){
	  boolean agregado=false;
	  try {
	   Conexion c = new Conexion();
	   Connection con=c.getConexion();
	   if(con!=null){
	    Statement st;
	    st = con.createStatement();
	    st.executeUpdate("INSERT INTO Producto VALUES ('"+usuario.getiD()+"','"+usuario.getDescripcion()+"',"+usuario.getPrecio()+",'"+usuario.getCantidad()+"','"+usuario.getIva()+"','"+usuario.getCaducidad()+"')");
	    agregado=true;
	    st.close();
	   }
	   c.cerrarConexion();
	  } catch (SQLException e) {
	   agregado=false;
	   e.printStackTrace();
	  }
	  return agregado;
	 }
	}