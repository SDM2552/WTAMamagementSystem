<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인 페이지</title>
</head>
<body>
<div th:replace="header :: header"></div>
<div>
    <a th:href="@{/login}">Login</a> |
    <a th:href="@{/register}">Register</a>
</div>

<h1>메인 페이지 입니다.</h1>
<<<<<<< HEAD


=======
<br>
<a href="/syllabus">강의계획서 입력</a>
>>>>>>> bomi<br>


<a href="/progInput">프로그램 추가</a>
<a href="/progMidInput">교육과정 추가</a>
>>>>>jiung<br>
<div th:replace="footer :: footer"></div>
</body>
</html>