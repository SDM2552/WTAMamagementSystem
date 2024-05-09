<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>과정추가</title>
</head>
<body>
<form>
    <div class="form-group">
        <label for="lessonName">교육명</label>
        <input type="text" class="form-control" id="lessonName" placeholder="교육명 입력">
    </div>
    <div class="form-group">
        <label for="lessonMember">수강정원</label>
        <input type="text" class="form-control" id="lessonMember" placeholder="수강정원">
    </div>
    <div class="form-group">
        <label for="idProf">교수id</label>
        <input type="text" class="form-control" id="idProf" placeholder="교수id">
    </div>
    <div class="form-group">
        <label for="lecFee">강의료</label>
        <input type="text" class="form-control" id="lecFee" placeholder="강의료">
    </div>
    <button type="submit" class="btn btn-primary">제출</button>
</form>













<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>