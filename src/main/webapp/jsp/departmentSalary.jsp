<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>DB_706_11</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
    <style>
        *{
            font-family: 'AppleSDGothicNeo', sans-serif;
        }
    </style>
</head>
<body>
<h1>부서 직원 월급 일괄 업데이트 페이지</h1>
<form method="post" action="/updateSalary">
    <p>부서별 월급 수정</p>
    <label>Select Dno : <input type = "text" name = "dpdno"></label><br>
    <label>Salary: <input type = "text" name = "dpsalary"></label><br>
    <p><input type="submit" value="해당 부서 월급 바꾸기"></p>
</form>
</body>
</html>