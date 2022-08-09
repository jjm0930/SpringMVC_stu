<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/4
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新添书籍</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>添加书籍</small>
                    </h1>
                </div>
            </div>
        </div>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="formGroupExampleInput">书籍名称</label>
                <input type="text" name="bookName" class="form-control" id="formGroupExampleInput" >
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" id="formGroupExampleInput2">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput3">书籍简介</label>
                <input type="text" name="detail" class="form-control" id="formGroupExampleInput3">
            </div>
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</body>
</html>
