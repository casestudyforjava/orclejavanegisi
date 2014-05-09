<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>
        <h1>List</h1>
        <table>
            <tr>
                <th>users_id</th>
                <th>users_password</th>
                <th>users_name</th>
                <th>更新</th>
                <th>削除</th>
            </tr>
            <c:forEach items="${result}" var="user">
                <tr>
                    <td>${user.usersId}</td>
                    <td>${user.usersPassword}</td>
                    <td>${user.usersName}</td>
                    <td><a href="update?id=${user.usersId}">更新</a></td>
                    <td><a href="delete?id=${user.usersId}">削除</a></td>
		</tr>
            </c:forEach>
        </table>
    </body>
</html>
