<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <style>
        table {
            margin-top: 20px;
            text-align: center;
            padding: 8px;
        }

        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>

<%!
    double aFrom = 1.234;
    double aTo = 1.934;
    double aStep = 0.25;

    double bFrom = -3.12;
    double bTo = -2.234;
    double bStep = 0.25;

    double cFrom = 5.45;
    double cTo = 6.45;
    double cStep = 0.25;

    double dFrom = 2.0;
    double dTo = 3.0;
    double dStep = 0.25;

    double getCurrentValue(HttpServletRequest request, String name, double defaultValue) {
        if (request.getParameter(name) != null) {
            return Double.parseDouble(request.getParameter(name));
        } else {
            return defaultValue;
        }
    }
%>

<%
    aFrom = getCurrentValue(request, "aFrom", aFrom);
    bFrom = getCurrentValue(request, "bFrom", bFrom);
    cFrom = getCurrentValue(request, "cFrom", cFrom);
    dFrom = getCurrentValue(request, "dFrom", dFrom);

    aTo = getCurrentValue(request, "aTo", aTo);
    bTo = getCurrentValue(request, "bTo", bTo);
    cTo = getCurrentValue(request, "cTo", cTo);
    dTo = getCurrentValue(request, "dTo", dTo);

    aStep = getCurrentValue(request, "aStep", aStep);
    bStep = getCurrentValue(request, "bStep", bStep);
    cStep = getCurrentValue(request, "cStep", cStep);
    dStep = getCurrentValue(request, "dStep", dStep);
%>

<div style="font-weight: bold; font-size: 30px">y = Math.pow((Math.tan(a)), 1.0 / c) / (1 + (Math.cosh(b) / Math.log(d + c)))</div>

<div style="width: 100%; height: 1px; background: black; margin-top: 20px"></div>

<form action="lab3_task19.jsp" method="GET" style="margin-top: 20px;">
    a: from<input type="text" name="aFrom" value="<%=aFrom%>">to<input type="text" value="<%=aTo%>"
                                                                       name="aTo"/>step<input type="text"
                                                                                              value="<%=aStep%>"
                                                                                              name="aStep"/><br/>
    b: from<input type="text" name="bFrom" value="<%=bFrom%>">to<input type="text" value="<%=bTo%>"
                                                                       name="bTo"/>step<input type="text"
                                                                                              value="<%=bStep%>"
                                                                                              name="bStep"/><br/>
    c: from<input type="text" name="cFrom" value="<%=cFrom%>">to<input type="text" value="<%=cTo%>"
                                                                       name="cTo"/>step<input type="text"
                                                                                              value="<%=cStep%>"
                                                                                              name="cStep"/><br/>
    d: from<input type="text" name="dFrom" value="<%=dFrom%>">to<input type="text" value="<%=dTo%>"
                                                                       name="dTo"/>step<input type="text"
                                                                                              value="<%=dStep%>"
                                                                                              name="dStep"/><br/>
    <input type="submit" value="Calculate"/>
    <% if (!request.getParameterMap().isEmpty()) { %>
    <table style="width: 100%; ">
        <tbody>
        <tr>
            <th>a</th>
            <th>b</th>
            <th>c</th>
            <th>d</th>
            <th>y</th>
        </tr>

        <%
            for (double a = aFrom; a <= aTo; a += aStep) {
                for (double b = bFrom; b <= bTo; b += bStep) {
                    for (double c = cFrom; c <= cTo; c += cStep) {
                        for (double d = dFrom; d <= dTo; d += dStep) {
        %>
        <tr>
            <td><%=a%>
            </td>
            <td><%=b%>
            </td>
            <td><%=c%>
            </td>
            <td><%=d%>
            </td>
            <td><%=Math.pow((Math.tan(a)), 1.0 / c) / (1 + (Math.cosh(b) / Math.log(d + c)))%>
            </td>
        </tr>
        <%
                        }
                    }
                }

            }
        %>
        </tbody>
    </table>

    <% } %>
</form>
</body>
</html>