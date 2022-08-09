<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/7
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<input type="button" id="btn" value="获取数据" onclick="a()"/>
<table width="80%" align="center">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tbody id="content">
    </tbody>
</table>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
<script>
    function a(){
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/test4",
            data:{"name":$("#username").val()},
            dataType:"json",
            success:function (data){
                var html="";
                console.log(data);
                if(data) {
                    for(var i=0;i<data.length;i++){
                        html+= "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>"
                    }
                    $("#content").html(html);
                }
            }
        });
    }
</script>
</body>
</html>
