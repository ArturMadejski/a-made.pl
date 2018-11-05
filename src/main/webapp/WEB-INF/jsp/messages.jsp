<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Messages List</title>

        <title>Artur Madejski JJD</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <nav class="navbar navbar-inverse">
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



    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>

</head>


<body>
    <h2>Messages List</h2>
	<form action="/messages"></form>
    <table>
        <c:forEach items="${messagesList}" var="message">
                <tr>
                    <div class="form-group">
                        <a>Message type: ${message.messageType}</a><br>
                        <label for="comment">Message text:</label>
                        <textarea class="form-control" rows="5" id="comment">${message.text}</textarea>
                        <a>Message ID: ${message.id}</a>
                        <a href="<c:url value='/messages/edit/${message.id}' />">Edit</a>
                        <a href="<c:url value='/messages/delete/${message.id}' />"  data-method="delete">Delete</a>
                        <a href="<c:url value='/messages/save/${message.id}' />"  data-method="delete">Save</a>
                        <hr/>
                    </div>
        </c:forEach>
    </table>
    <br/>
    <a href="/messages/new">Add new message</a>
</body>
</html>