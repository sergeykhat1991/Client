<%@ page import="ru.khat.logreader.utils.Journal" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
    <%
        new Journal().writeEvent(request, "logout");
        session.invalidate();
    %>
    <script>
        window.location = "login.jsp";
    </script>

</head>
<body>

</body>
</html>
