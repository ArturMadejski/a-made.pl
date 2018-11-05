<%--
  Created by IntelliJ IDEA.
  User: artur
  Date: 07.07.18
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Artur Madejski JJD</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Artur Madejski</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/myPage">Home</a></li>
            <li><a href="/table">Projekty</a></li>
            <li><a href="#">Nauka</a></li>
            <li><a href="#">O mnie</a></li>
            <li><a href="#">Inne zainteresowania</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
    </nav>
    <title>Edit Message</title>

    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>

</head>


<body>
<h2>Edit message</h2>

<c:if test="${not empty errorMessage}">
    <div>${errorMessage}</div>
</c:if>

        <div class="form-group">
            <a>Message type: ${message.messageType}</a><br>
            <form-action>
            <select>
                <option value="BAD">BAD</option>
                <option value="GOOD">GOOD</option>
                <option value="NEUTRAL">NEUTRAL</option>
            </select>
            </form-action>
            <label for="comment">Message text:</label>
            <textarea class="form-control" rows="5" id="comment">${message.text}</textarea>
            <a href="<c:url value='/messages/save/${message.id}' />"  data-method="save">Save</a>
            <hr/>
        </div>

<%--<form:form method="POST" modelAttribute="edit" action="/messages/save">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td>Message text</td>--%>
            <%--<td><form:input path="text" id="text" items="${message.text}"/></td>--%>
            <%--<td><form:errors path="text" id="text" items="${message.text}"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>Message Type</td>--%>
            <%--<td><form:select path="messageType" id="messageType" items="${message.messageType}"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td></td>--%>
            <%--<td>--%>
                <%--<c:choose>--%>
                    <%--<c:when test="${edit}">--%>
                        <%--<input type="submit" value="Update Message"/>--%>
                    <%--</c:when>--%>
                    <%--<c:otherwise>--%>
                        <%--<input type="submit" value="Add Message"/>--%>
                    <%--</c:otherwise>--%>
                <%--</c:choose>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<form:hidden path="id" id="id" items="${message.id}"/>--%>
    <%--</table>--%>

<%--</form:form>--%>

</body>
</html>
