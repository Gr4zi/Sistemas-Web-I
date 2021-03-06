<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Salesman</title>
</head>
<body>
    <div align="center">
        <c:if test="${salesman != null}">
            <form action="updateSalesman" method="post">
        </c:if>
        <c:if test="${salesman == null}">
            <form action="insertSalesman" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${salesman != null}">
                        Edit Salesman
                    </c:if>
                    <c:if test="${salesman == null}">
                        Add New Salesman
                    </c:if>
                </h2>
            </caption>
                <c:if test="${salesman != null}">
                    <input type="hidden" name="id" value="<c:out value='${salesman.id}' />" />
                </c:if>           
            <tr>
                <th>Name: </th>
                <td>
                    <input type="text" name="name" size="45"
                            value="<c:out value='${salesman.name}' />"
                        />
                </td>
            </tr>
            <tr>
                <th>City: </th>
                <td>
                    <input type="text" name="city" size="45"
                            value="<c:out value='${salesman.city}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Commission: </th>
                <td>
                    <input type="number" name="commission" size="5" min="1" max="99999" step=".01"
                            value="<c:out value='${salesman.commission}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                    <input type="reset" value="Clear" />
                    <a href="listSalesman">Cancel</a>
                </td>
            </tr>
        </table>
        </form>
    </div>   
</body>
</html>