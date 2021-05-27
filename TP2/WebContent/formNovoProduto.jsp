<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/NovoProduto" var="linkServletNovoProduto" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Produto</title>
</head>
<body>
	
		<form action="${linkServletNovoProduto }" method="post">
		
		Nome: <input type="text" name="nome"/><br>
		Descrição: <input type="text" name="descricao"/><br>
		Unidade de compra: <input type="number" name="unidadeCompra"/><br>
		Qtde previsto mês: <input type='number' step='0.01' placeholder='0.00' name="qtdPrevistoMes"/><br>
		Preço: <input type='number' step='0.01' placeholder='0.00' name="precoMaxComprado"/><br>
		<input type="submit" />
		
	</form>
	
</body>
</html>