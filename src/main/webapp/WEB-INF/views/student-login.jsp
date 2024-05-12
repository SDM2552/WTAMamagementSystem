<%@ include file="header.jsp" %>

<h2>Student Login</h2>
<form action="/login/student" method="post">
    Email: <input type="email" name="email" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>

<%@ include file="footer.jsp" %>