<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>Add Employee Form</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<jsp:include page="/WEB-INF/jsp/common/pageHeader.jsp"></jsp:include>

<form action="uploadImage" enctype="multipart/form-data" method="Post">
	<input type="hidden" name="name" value="rajan" />
    <input id="productImage" name="file" type="file" class="form:input-large" />
    <input type="submit" value="Upload" />
</form>

</div>
</body>
</html>
