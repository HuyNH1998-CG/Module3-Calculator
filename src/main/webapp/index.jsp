<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Model.Calculator</title>
</head>
<body>
<h1>Simple Calc</h1>
<form action="/Calcu" method="post">
    <h1>Model.Calculator</h1>
    <table>
        <tr>
            <td>First num</td>
            <td><input type="text" name="Num1"></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td>
                <select name="operator">
                    <option value="+">addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiply</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second Num</td>
            <td><input type="text" name="Num2"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Cal"></td>
        </tr>
    </table>
</form>
</body>
</html>
