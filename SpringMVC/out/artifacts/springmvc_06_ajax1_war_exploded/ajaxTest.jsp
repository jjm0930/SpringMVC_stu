<%--
  Created by IntelliJ IDEA.
  User: jinjunming
  Date: 2022/8/7
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        function a(){
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/test3",
                data:{"name":$("#username").val()},
                dataType:"json",
                success:function (data){
                    if(data) {
                        for(var i=0;i<data.length;i++){
                            console.log(data[i].name);
                            console.log(data[i].age);
                            console.log(data[i].sex);
                        }
                    }
                }
            });
        }
    </script>
</head>
    用户名：<input type="text" name="name" id="username" onblur="a()">
<body>

</body>
</html>
