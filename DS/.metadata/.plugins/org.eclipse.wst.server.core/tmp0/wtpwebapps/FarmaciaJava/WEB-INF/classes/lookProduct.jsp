<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar Producto</title>
<link rel="stylesheet" type="text/css" href="StyleLookProduct.css" media="screen" />
</head>
<body>
<div align="center">
<form action="ServletConsulta" method="get">
<table>
<tr>
<td colspan="2" align="center">Consultar Producto</td>
</tr>
<tr>
<td>Descripcion: </td>
<td><input type="text" size="15" name="descripcion"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Consultar"></td>
</tr>
</table>
</form>
</div>
</body>
</html>