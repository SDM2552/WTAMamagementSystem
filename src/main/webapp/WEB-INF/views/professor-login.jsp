<%@ include file="header.jsp" %>

<h2>Professor Login</h2>
<form action="/login/professor" method="post">
    Email: <input type="email" name="email" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>

<%@ include file="footer.jsp" %>