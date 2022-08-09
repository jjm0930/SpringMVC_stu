<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/4
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/all">显示所有书籍</a>
        </div>
        <div class="col-md-8 column">
            <span style="color: red;font-weight:bold">${error}</span>
            <form action="${pageContext.request.contextPath}/book/toQueryBook" method="post">
                <div class="form-row align-items-center">
                    <div class="col-sm-3 my-1">
                        <input type="text" name="bookName" class="form-control" id="inlineFormInputName"
                               placeholder="请输入书名">
                    </div>
                    <div class="col-auto my-1">
                        <button type="submit" class="btn btn-primary">查询</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">书籍名称</th>
                    <th scope="col">数量</th>
                    <th scope="col">简介</th>
                    <th scope="col">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${books}">
                    <tr>
                        <th scope="row">${book.bookID}</th>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td class=" col-md-auto">
                            <a class="btn btn-warning"
                               href="${pageContext.request.contextPath}/book/toUpdateBook?name=${book.bookName}">修改</a>
                            <a class="btn btn-danger"
                               href="${pageContext.request.contextPath}/book/toDeleteBook?id=${book.bookID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>
</body>
</html>
