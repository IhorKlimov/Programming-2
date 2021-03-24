<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="lab4.jsp" %>
<html>
<body>
<p>Max salary in the company is</p>
<c:out value="${requestScope.get('maxSalary')}"/>
</body>
</html>