<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        function an() {
            $.ajax({
                url:"${pageContext.request.contextPath}/aj1",
                data:{"name":$("#username").val()},
                success:function (data) {
                   console.log(data);
                }
            })
        }
    </script>
</head>
<body>
<input id="username" type="text" onblur="an()"/>
<input id="butt" type="button" onclick="an()"/>
</body>
</html>
