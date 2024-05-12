<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Enroll Course</title>
</head>
<body>
<h2>Enroll in a Course</h2>
<form action="/enroll" method="post">
    Student ID: <input type="text" name="studentId" required><br>
    Program ID: <input type="text" name="programId" required><br>
    <input type="submit" value="Enroll">
</form>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
</body>
</html>