<%--
  Created by IntelliJ IDEA.
  User: Administratorer
  Date: 2020/7/4
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/uploadFile" method="post" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="submit" value="上传文件">
    </form>
</body>
</html>
