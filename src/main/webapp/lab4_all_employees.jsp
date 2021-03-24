<%@page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="lab4.jsp" %>
<html>
<body>
<c:if test="${requestScope.containsKey('allEmployees')}">
    <jsp:useBean id="allEmployees" type="java.util.ArrayList<com.example.programming2.lab4.Employee>" scope="request"/>
    <p>All employees:</p>
    <table>
        <tbody>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Salary</th>
        </tr>
        <c:forEach items="${allEmployees}" var="employee">
            <tr>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.salary}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${!requestScope.containsKey('allEmployees')}">
    <p>No employees found in this company</p>
</c:if>
</body>
</html>