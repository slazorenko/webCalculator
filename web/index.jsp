<%--
  Created by IntelliJ IDEA.
  User: lazzar
  Date: 26.03.2018
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web Calculator</title>
    <link href="css/index.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <div class="index">
      <form name="calculator" action="calculate" method="get">
        <table class="index" align="center">
          <tr>
            <th>Enter num1: <input type="text" name="num1" size="20"></th>
            <th rowspan="4" align="left" valign="top">${history}</th></tr>
          <tr><th>
            <select name="operation">
              <option value="plus">+</option>
              <option value="minus">-</option>
              <option value="multiply">*</option>
              <option value="divide">/</option>
            </select>
          </th></tr>
          <tr><th>
            Enter num2: <input type="text" name="num2" size="20">
          </th></tr>
          <tr><th>
            <input type="submit" value="Calculate">
          </th></tr>
        </table>
      </form>
      <span id="result" class="index">${result}</span>
    </div>
  </body>
</html>
