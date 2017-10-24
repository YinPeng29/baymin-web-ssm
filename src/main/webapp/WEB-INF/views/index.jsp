<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/20
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    <c:if test="${!empty list}">
        <c:forEach var="li" items="${list}"  varStatus="status">
            <li>${li.user_name}</li>
            <li>${li.password}</li>
            <li>${li.email}</li>
            <li>${li.add_time}</li>
        </c:forEach>
    </c:if>
</h2>
</body>
</html>
