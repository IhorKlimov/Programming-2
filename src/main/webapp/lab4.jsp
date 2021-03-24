<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Tag Example</title>
    <style>
        table {
            margin-top: 20px;
            text-align: center;
            padding: 8px;
        }

        table, th, td {
            border: 1px solid black;
            padding: 8px;
        }
    </style>
</head>
<body>
<table>
    <tbody>
    <tr>
        <th>Max salary:</th>
        <th>Employee that makes more than head of department:</th>
        <th>All employees:</th>
    </tr>

    <tr>
        <td>
            <form action="lab4Controller" method="post">
                <input type="hidden" value="0" name="task">
                <input type="submit" value="Show">
            </form>
        </td>
        <td>
            <form action="lab4Controller" method="post">
                <input type="hidden" value="1" name="task">
                <input type="submit" value="Show">
            </form>
        </td>
        <td>
            <form action="lab4Controller" method="post">
                <input type="hidden" value="2" name="task">
                <input type="submit" value="Show">
            </form>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>