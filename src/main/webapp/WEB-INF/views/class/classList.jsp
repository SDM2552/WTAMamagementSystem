<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>수업관리</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div >
    <h2>수업관리</h2>
    <hr>
    <table>
        <tr>
            <th></th>
            <th>No</th>
            <th>수업명</th>
            <th>강의기간</th>
        </tr>
        <tr>
            <td><input type="checkbox" id="checked"></td>
            <td>1</td>
            <td>임시제목</td>
            <td>2024.05.09 ~ 2024.05.24</td>
        </tr>
    </table>
</div>
<div>
    <button onClick='location.href="/"'>강의계획서 작성</button>
    <button onClick='location.href="/"'>휴보강 신청</button>
    <button onClick='location.href="/"'>출석 관리</button>
    <button onClick='location.href="/"'>시험 관리</button>
</div>


</body>
</html>