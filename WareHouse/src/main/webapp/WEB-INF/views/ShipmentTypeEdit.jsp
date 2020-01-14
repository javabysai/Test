<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
isELIgnored="false"  pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.read{background-color: #D3D3D3;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome To Shipment Edit page</h1>
<form:form action="update" method="post" modelAttribute="shipmentType">
<pre>
ShipmentId:<form:input path="shipmentId" readonly="true" cssClass="read"/>
ShipmentMode:<form:select path="shipmentMode">
<form:option value= "AIR">Air</form:option>
<form:option value="TRUCK">Truck</form:option>
<form:option value="TRAIN">Train</form:option>
<form:option value="SHIP">ship</form:option>
</form:select>
ShipmentCode:<form:input path="shipmentCode"/>
EnableShipment:<form:select path="enableShipment">
             <form:option value="yes">yes</form:option>
             <form:option value="no">no</form:option>
</form:select>
ShipmentGrade:<form:radiobutton path="shipmentGrade" value="a"/>a
               <form:radiobutton path="shipmentGrade" value="b"/>b
              <form:radiobutton path="shipmentGrade" value="c"/>c
<form:textarea path="note"/>
<input type="submit" value="Register">              
</pre>
</form:form>
</body>
</html>