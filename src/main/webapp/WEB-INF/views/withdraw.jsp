<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Withdraw Course</title>
</head>
<body>
<h2>Withdraw from a Course</h2>
<form action="/withdraw" method="post">
    Enrollment ID: <input type="text" name="enrollmentId" required><br>
    <input type="submit" value="Withdraw">
</form>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
</body>
</html>