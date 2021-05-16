<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Questionaire1</title>
</head>
<body>
<h1><%= "Complete the form!" %>
</h1><br/>
<form action="quest-servlet">
    <p><label for="name">Input your name:</label>
        <input id="name"type="text"placeholder="Your name"> </p>
    <p><label for="surname">Input your surname:</label>
        <input id="surname"type="text"placeholder="Your surname"> </p>
    <p><label for="age">Input your age:</label>
        <input id="age"type="text"placeholder="Your age"> </p>


 <a href="quest-servlet">Submit</a>
</form>
</body>
</html>