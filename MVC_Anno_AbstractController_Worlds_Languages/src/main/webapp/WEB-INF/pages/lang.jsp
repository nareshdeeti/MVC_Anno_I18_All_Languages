<%--
  Created by IntelliJ IDEA.
  User: nareshd
  Date: 07-01-2020
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color:darkolivegreen;text-align: center">Languages</h1>
<c:forEach var="local" items="${locale}">
    <p style="color:cadetblue">${local.getDisplayLanguage(local)}</p>
</c:forEach>
    <a href="home.htm">Home</a>
