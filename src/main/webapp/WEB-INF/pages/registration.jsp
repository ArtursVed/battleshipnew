
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Battleship</title>
</head>
<body>

<form method="post" action="/battleship/registration">

    <label for="username">Enter your name</label>
    <input id="username"
           type="text"
           name="username">
            ${errorHolder.message}
    <br>
    <button type="submit">start</button>
</form>

</body>
</html>
