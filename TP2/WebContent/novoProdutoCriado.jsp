<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Produto</title>
</head>
<body>
	
	<c:if test="${not empty produto }">
		Produto ${empresa } cadastrado com sucesso!
	</c:if>
	
	<c:if test="${empty produto }">
		Nenhum produto cadastrado!
	</c:if>
	
</body>
</html>