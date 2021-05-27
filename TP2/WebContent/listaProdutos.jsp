<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, gerenciador.Produtos"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos</title>
</head>
<body>
	
	<c:if test="${not empty produto }">
		Produto ${produto } cadastrado com sucesso!
	</c:if>
	
	Lista de Produtos: <br/><br/>
	
	<table style="text-align:center">
		<tr>
			<th>C�d.</th>
			<th>Nome</th>
			<th>Descri��o</th>
			<th>UnidadeCompra</th>
			<th>Pre�oMaxCompra</th>
			<th>QtdePrevistaM�s</th>
		</tr>
		<c:forEach items="${produtos }" var="produto">
		<tr>
			<td>${produto.cd }</td>
			<td>${produto.nome }</td>
			<td>${produto.descricao }</td>
			<td>${produto.unidadeCompra }</td>
			<td>R$ ${produto.precoMaxComprado }</td>
			<td>${produto.qtdPrevistoMes }</td>
			<td><a href="/TP2/MostraProduto?cd=${produto.cd }">Editar</a></td>
			<td><a href="/TP2/RemoveProduto?cd=${produto.cd }">Remover</a></td>
		</tr>
		</c:forEach>
	</table>
		
	<br><br><a href="/TP2/formNovoProduto.jsp">Cadastrar novo produto.</a><br><br>
	
</body>
</html>