<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   isELIgnored="false" pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to UomDataPage</h1>
	<table border="1px">
		<th>UomId</th>
		<th>uomType</th>
		<th>UomCode</th>
		<th>enableUom</th>
		<th>metacode</th>
		<th>Adjustsize</th>
		<th>operations</th>
		<c:forEach items="${all}" var="uom">
		<tr><td><c:out value="${uom.uomId}"></c:out></td>
		<td><c:out value="${uom.uomType}"></c:out></td>
		<td><c:out value="${uom.uomCode}"></c:out></td>
		<td><c:out value="${uom.enableUom}"></c:out></td>
		<td><c:out value="${uom.metaCode}"></c:out></td>
		<td><c:out value="${uom.adjSize}"></c:out></td>
		<td><a href="edituom?uomId=${uom.uomId}">edit</a>
	    <a href="delete?uomId=${uom.uomId}">delete</a>
	    <a href="excel?uomId=${uom.uomId}">ExcelExport</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
</body>
</html>