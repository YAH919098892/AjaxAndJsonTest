<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#but").click(function () {
                $.post("${pageContext.request.contextPath}/a3",function (data) {
                    console.log(data);
                    var html="";
                    for (let i=0;i<data.length;i++){
                        html +="<tr>"+
                            "<td>"+data[i].id+"</td>"+
                            "<td>"+data[i].name+"</td>"+
                            "<td>"+data[i].home+"</td>"+
                            "<td>"+"<a href=''>"+"修改"+"</a>"+"</td>"+
                            "<td>"+"<a href=''>"+"删除"+"</a>"+"</td>"+
                            "</tr>"
                    }
                    $("#content").html(html);
                });
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
