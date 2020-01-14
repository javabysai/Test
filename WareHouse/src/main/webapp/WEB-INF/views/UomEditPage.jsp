<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.read {
	background-color: #D3D3D3;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to UomEditPage</h1>
	<form:form action="update" method="post" modelAttribute="uom">
		<pre>
UomType:<form:select path= "uomType">
<form:option value="pack">pack</form:option>
<form:option value="no pack">no pack</form:option>
<form:option value="na">na</form:option>
</form:select>
UomCode:<form:input path="uomCode"/>
enabled:<form:radiobutton value="a" path="enableUom"/>Yes
        <form:radiobutton value="a" path="enableUom"/>No
MetaCode:<form:input path="metaCode"/>
AdjustSize:<form:radiobutton value="b" path="adjSize" />L
           <form:radiobutton value="b" path="adjSize" />M
           <form:radiobutton value="b" path="adjSize" />R
Note:<form:textarea path="note" />
<input type="submit" value="register">
</pre>
	</form:form>
</body>
</html>
