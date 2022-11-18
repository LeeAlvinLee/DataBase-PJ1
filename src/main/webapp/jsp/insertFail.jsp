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
<h1>INSERT에 실패하였습니다!</h1>
<form method="get" action="/">
    <p>INSERT할 직원의 정보를 정확하게 입력하였는지 확인해주세요!</p>
    <p>ex) Ssn을 정확하게 입력하였는지 확인해주세요!</p><br>
    <p>ex) Middle Init 은 한글자로 입력해줘야합니다 !</p><br>
    <p>ex) B-Date는 형식에 맞게 작성하여주세요 !</p><br>
    <p>ex) Dno는 존재하는 부서번호로 작성하여 주세요 !</p><br>
    <br>
    <input type="submit" value="처음으로 돌아가기">
</form>
</body>
</html>