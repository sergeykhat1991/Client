
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login form</title>
</head>
<div class="center-div">
<body bgcolor="#e6eeff" text=black>

    <form method="POST" action="j_security_check">
        <table border=5%>
            <tr>
                <td>Логин:</td>
                <td><input type="text" name="j_username"></td>
            </tr>

            <tr>
                <td>Пароль:</td>
                <td><input type="password" name="j_password"></td>
            </tr>

            <tr>
                <td colspan=2 align=right><input type=submit value="Login"></td>
            </tr>
        </table>
    </form>
</div>
</body>

<style>

    .center-div
    {
        position: absolute;
        margin: auto;
        top: 0;
        right: 0;
        bottom: 0;
        left: -100px;
        width: 100px;
        height: 100px;

    }

</style>
</html>