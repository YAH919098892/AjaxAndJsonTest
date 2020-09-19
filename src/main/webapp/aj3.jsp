<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#but").click(function () {
                console.log("hhhh");
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    console.log(data);
                    console.log(data.length);
                })

            })
        });
    </script>
</head>
<body>
<input type="button" value="加载数据" id="but"/>
<table>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>地址</td>
    </tr>
    <tbody id="content"></tbody>
</table>
</body>
</html>
