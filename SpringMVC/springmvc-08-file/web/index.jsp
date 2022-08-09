<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/9
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload2" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="上传">
  </form>
  <a href="${pageContext.request.contextPath}/download">下载文件</a>
  </body>
</html>
