<%@page import="com.example.programming2.lab4.Department" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="lab4.jsp" %>
<html>
<body>
<c:if test="${requestScope.containsKey('department')}">
    <jsp:useBean id="department" type="com.example.programming2.lab4.Department" scope="request"/>
    <p>Employees make more money than their head in department: </p>
    <c:out value="${department.title}"/>
</c:if>
<c:if test="${!requestScope.containsKey('department')}">
    <p>No employees make more money than their head in this company</p>
</c:if>
</body>
</html>