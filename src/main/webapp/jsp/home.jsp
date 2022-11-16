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
<h1>직원 검색 시스템</h1>
<h4>[ Team : 2022-DB-452-B-02 ]</h4>
<hr>
<form method="get" action="/search">
    <h3>Attribute에서 조건 선택</h3>
    <select name = "mainCategory" onchange="categoryChange(this)">
        <option value="none" selected>전체</option>
        <option value="department">부서</option>
        <option value="sex">성별</option>
        <option value="salary">연봉</option>
        <option value="bdate">생일</option>
        <option value="supervisor">부하직원</option>
        <option value="supervising">상사</option>
    </select>

    <select name="subCategory" id = "category">
    </select>
    <input type = "text" name = "inputText">

    <script>
        function categoryChange(e){
            var none = [];
            var department = ["Research", "Administration", "Headquarters"];
            var sex = ["M", "F"];
            var target = document.getElementById("category");

            if(e.value == "department") var d = department;
            else if(e.value == "sex") var d = sex;
            else var d = none;

            target.options.length = 0;

            for (x in d) {
                var opt = document.createElement("option");
                opt.value = d[x];
                opt.innerHTML = d[x];
                target.appendChild(opt);
            }
        }
    </script>
    <hr>
    <h2>검색 필터</h2>
    <h5>테이블에서 보고 싶은 Attribute만 선택해주세요.</h5>
    <label><input type="checkbox" name="name" value="1" checked> Name</label>
    <label><input type="checkbox" name="ssn" value="1" checked> Ssn</label>
    <label><input type="checkbox" name="bdate" value="1" checked> Bdate</label>
    <label><input type="checkbox" name="address" value="1" checked> Address</label>
    <label><input type="checkbox" name="sex" value="1" checked> Sex</label>
    <label><input type="checkbox" name="salary" value="1" checked> Salary</label>
    <label><input type="checkbox" name="supervisor" value="1" checked> Supervisor</label>
    <label><input type="checkbox" name="department" value="1" checked> Department</label>
    <label><input type="checkbox" name="created_at" value="1" checked> Created_at</label>
    <label><input type="checkbox" name="updated_at" value="1" checked> Updated_at</label>
    <p><input type="submit" value="테이블 보여지기 버튼"></p>
</form>
<hr>
<form method = "get" action = "/insertPage">
    <h2>직원 정보 추가</h2>
    <p><input type="submit" value="Click"></p>
</form>
<hr>
</body>
</html>