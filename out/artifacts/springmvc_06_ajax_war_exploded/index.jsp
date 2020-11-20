<%--
  Created by IntelliJ IDEA.
  User: haoyu
  Date: 2020/11/10
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data) {
            alert(data);


          }

        });
      }

    </script>
  </head>
  <body>
  <%--失去焦点的时候，发起一个请求（携带信息）到后台--%>
  用户名：<input type="text" id="username" onblur="a()">

  </body>
</html>
