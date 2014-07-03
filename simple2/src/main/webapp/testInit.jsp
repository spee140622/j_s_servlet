<%--
  Created by IntelliJ IDEA.
  User: wenzhouyang
  Date: 7/6/2014
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%!
       public void jspInit() {
           ServletConfig config = getServletConfig();
           String email = config.getInitParameter("email");
           ServletContext context = getServletContext();
           context.setAttribute("email", email);
       }
    %>

    <%=application.getAttribute("email")%>
</body>
</html>
