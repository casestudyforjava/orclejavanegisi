<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <h1>Update</h1>
        <form>
            <table>
                <c:forEach items="${result}" var="user">
                    <tr>
                        <th>ユーザーID</th>
                        <td><input type="text" name="usersId" value="${user.usersId}"></td>
                    </tr>
                    <tr>
                        <th>パスワード</th>
                        <td><input type="text" name="usersPassword" value="${user.usersPassword}"></td>
                    </tr>
                    <tr>
                        <th>名前</th>
                        <td><input type="text" name="usersName" value="${user.usersName}"></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
