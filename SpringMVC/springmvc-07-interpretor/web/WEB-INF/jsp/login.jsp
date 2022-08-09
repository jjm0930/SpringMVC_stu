<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/7
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/goLogin" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="password" name="pwd">
        <input type="submit" value="提交">
    </form>
</body>
</html>
