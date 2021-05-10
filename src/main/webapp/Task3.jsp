<%--
  Created by IntelliJ IDEA.
  User: maksymbardakh
  Date: 06/03/2021
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="main.css" type="text/css">
    <title>Task 3</title>
</head>
<body>
<form name="choiceForm" method="post" action="thirdTask">
    Parameter A: <input type="number" step=0.00001 name="paramA"/> <br/>
    Parameter B: <input type="number" step=0.00001 name="paramB"/> <br/>
    Parameter C: <input type="number" step=0.00001 name="paramC"/> <br/>
    Parameter D: <input type="number" step=0.00001 name="paramD"/> <br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>