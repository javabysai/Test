<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 isELIgnored="false"    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to Shipment Data Page</h1>
<table border="1px">
<th>ShipmentId</th>
<th>ShipmentMode</th>
<th>ShipmentCode</th>
<th>enableShipment</th>
<th>ShipmentGrade</th>
<th>Operations</th>

<c:forEach items="${data}"  var="ship">
<tr><td><c:out value="${ship.shipmentId}"></c:out></td>
<td><c:out value="${ship.shipmentMode}"></c:out></td>
<td><c:out value="${ship.shipmentCode}"></c:out></td>
<td><c:out value="${ship.enableShipment}"></c:out></td>
<td><c:out value="${ship.shipmentGrade}"></c:out></td>
<td><a href="editOne?shipmentId=${ship.shipmentId}"><img  alt="edit" src=".../resources/icons/edit.png"></img></a>
<a href="delete?shipmentId=${ship.shipmentId}"><img  alt="delete" src=".../resources/icons/delete.png"></a><br>
<a href="excel?id=${ship.shipmentId}">Excel Export</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>