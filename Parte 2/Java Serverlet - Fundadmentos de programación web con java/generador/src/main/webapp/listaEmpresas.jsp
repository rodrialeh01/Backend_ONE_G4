<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.alura.gerenciador.servlet.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
		Empresa ${ empresa } registrada!
	</c:if>
	Lista de Empresas: <br />
	<ul>
	
		<c:forEach items="${empresas}" var="empresa">
		
			<li>
				${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostrarEmpresa?id=${ empresa.id }">modificar</a>
				<a href="/gerenciador/eliminarEmpresa?id=${ empresa.id }">eliminar</a>
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