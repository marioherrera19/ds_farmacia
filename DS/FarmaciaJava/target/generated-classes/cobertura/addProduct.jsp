<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Productos</title>
<link rel="stylesheet" type="text/css" href="StyleProduct.css" media="screen" />
</head>
<body>
<div id="contact-form">  
   <h1 align= center>Agregar producto</h1>
   <h2 align = center>Rellena el formulario para ingresar nuevos productos.</h2>  
   <p id="failure">Oops... Algo anduvo mal.</p>  
   <p id="success">Gracias, tu mensaje ha sido enviado correctamente.</p>  
   <form action="ServletRegistro" method="post">
      <label for="name">ID: <span class="required">*</span></label>  
      <input type="text"  id= "id"name="id" value="" placeholder="Insertar ID" required="required" autofocus="autofocus" />  
         
      <label for="precio">Descripcion: <span class="required">*</span></label>  
      <input type="text" id="descripcion" name="descripcion" value="" placeholder="Nombre" required="required" />  
         
      <label for="precio">Precio: </label>  
      <input type="text" id="precio" name="precio" value="" placeholder="" required="required"/>  
      
      <label for="cantidad">Cantidad: </label>  
      <input type="text" id="cantidad" name="cantidad" value="" placeholder="" required="required"/> 
      
      <label for="iva">IVA: </label>  
      <input type="text" id="iva" name="iva" value="" placeholder="Impuesto del producto" required="required"/> 
      
      <label for="caducidad">Fecha de Caducidad: </label>  
      <input type="text" id="caducidad" name="caducidad" value="" placeholder="Formato yyyy-mm--dd" required="required"/> 
         
      <input type="submit" value="Send away!" id="submit" />
   </form>  
</div>
</body>
</html>



</body>
</html>