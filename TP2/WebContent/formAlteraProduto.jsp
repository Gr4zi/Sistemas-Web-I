<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/AlteraProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Produto</title>
</head>
<body>
	
	<form action="${linkServletNovoProduto }" method="post">
		
		Nome: <input type="text" name="nome" value="${produto.nome }" />
		Descrição: <input type="text" name="descricao" value="${produto.descricao }" />
		Unidade de compra: <input type="number" name="unidadeCompra" value="${produto.unidadeCompra }" />
		Qtde previsto mês: <input type='number' step='0.01' placeholder='0.00' name="qtdPrevistoMes" value="${produto.qtdPrevistoMes }" />
		Preço: <input type='number' step='0.01' placeholder='0.00' name="precoMaxComprado" value="${produto.precoMaxComprado }" />
		<input type="hidden" name="cd" value="${produto.cd }">
		<input type="submit"/>
		
	</form>
	
</body>
</html>