<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.alura.gerenciador.modelo.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp"></c:import>

	Usuario Logueado: ${ loginUsuario.login } 
	<br />
	<br />
	<br />

	<c:if test="${ not empty empresa }">
		Empresa ${ empresa } registrada!
	</c:if>
	Lista de Empresas: <br />
	<ul>
	
		<c:forEach items="${empresas}" var="empresa">
		
			<li>
				${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${ empresa.id }">modificar</a>
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${ empresa.id }">eliminar</a>
			</li>
		</c:forEach>
	
	</ul>
	<!--  
	<ul>
		<% 
			//List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas"); //${empresas}
			//for (Empresa empresa : lista) {
		%>
			<li><%//= empresa.getNombre() %> </li>
		<% 
			//}
		%>
	</ul>
	-->

</body>
</html>