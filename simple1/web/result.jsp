<%--
  Created by IntelliJ IDEA.
  User: wenzhouyang
  Date: 7/3/2014
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>

    <p>
        <%
            List<String> list = (List<String>) request.getAttribute("style");
            for (String str : list) {
                response.getWriter().println("<br/> try: " + str);
            }
        %>
    </p>
</body>
</html>
