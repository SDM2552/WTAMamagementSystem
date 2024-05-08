<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>강의계획서 입력</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div >
    <h2>강의계획서 입력</h2>
    <form>
        <div class="form-group">
            <label for="lectureName">강의명:</label>
            <input type="text" class="form-control" id="lectureName" placeholder="강의명 입력">
        </div>
        <div class="form-group">
            <label for="professorName">교수명:</label>
            <input type="text" class="form-control" id="professorName" placeholder="교수명 입력">
        </div>
        <div class="form-group">
            <label for="lectureTime">강의 시간:</label>
            <input type="text" class="form-control" id="lectureTime" placeholder="강의 시간 입력">
        </div>
        <div class="form-group">
            <label for="classroom">강의실:</label>
            <input type="text" class="form-control" id="classroom" placeholder="강의실 입력">
        </div>
        <div class="form-group">
            <label for="lectureContent">강의 내용:</label>
            <textarea class="form-control" id="lectureContent" rows="5" placeholder="강의 내용 입력"></textarea>
        </div>
        <div class="form-group">
            <label for="classObjective">수업 목표:</label>
            <textarea class="form-control" id="classObjective" rows="3" placeholder="수업 목표 입력"></textarea>
        </div>
        <div class="form-group">
            <label for="referenceMaterials">교재 및 참고 자료:</label>
            <textarea class="form-control" id="referenceMaterials" rows="3" placeholder="교재 및 참고 자료 입력"></textarea>
        </div>
        <div class="form-group">
            <label for="evaluationMethod">평가 방법:</label>
            <textarea class="form-control" id="evaluationMethod" rows="3" placeholder="평가 방법 입력"></textarea>
        </div>
        <div class="form-group">
            <label for="otherInformation">기타 사항:</label>
            <textarea class="form-control" id="otherInformation" rows="3" placeholder="기타 사항 입력"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">제출</button>
    </form>
</div>



</body>
</html>