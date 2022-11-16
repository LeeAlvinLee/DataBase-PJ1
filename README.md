# Clone 후 주의 사항
### <1>
repository file에서
1. 자신이 설정한 db 이름
2. user name
3. user pwd
를 수정해주세요.

### <2>
기존 database 에 timestamp를 추가해주기 위해 밑 코드를 입력해주세요.

ALTER TABLE EMPLOYEE

ADD COLUMN created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

ADD COLUMN updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;


# DataBase-PJ1

1. EMPLOYEE 테이블의 attribute들을 모두 출력하기
(조건: Super_ssn과 Dno 대신 상사의 이름과 부서명으로 바꿔서 출력)
(단, 생성 날짜인 created와 수정 날짜인 modified는 출력할 필요 없음)
2. 검색 범위, 검색 항목 필터를 적용하여 해당되는 직원의 정보를 검색해서
출력하기
3. 검색된 직원을 선택하고 DB에서 삭제하기
4. 직원 선택, 수정할 항목 선택 후 수정사항을 입력하여 그 직원의 해당 항목
정보를 수정하기
5. 새로운 직원의 정보를 GUI에서 직접 추가하기
(조건 : 생성 날짜와 수정 날짜는 모두 동일한 값으로 해야 함)
6. 부서별 직원을 모두 출력하기 (출력 형태 자유)
7. 직원별 가족을 모두 출력하기 (출력 형태 자유)
8. 부서별로 월급 일괄 수정하기
9. 한 직원의 정보가 수정되면, 수정 날짜 항목
(modified 항목 값 바꿔주기)
10. 성별 남자인 직원 검색하기
11. Salary>3000 이상 검색하기
12. 같은 상사를 가진 직원들 출력하기

1-3 : 김재혁 / 4-6 : 이다슴 / 7-9 : 왕호은 / 10-12 : 전영서

# About
프로젝트 목표 12가지 역할 분담 + JDBC 코드 작성

# Description
이다슴 / 김재혁 / 왕호은 / 전영서  => 순서대로 3개씩 나눠서 담당.

# 추가 사항
전체적인 프론트는 마지막에 진행. (한 사람이 도맡아 하는게 좋을 듯 합니다.=>아마도 @hoeun0723 예정.)
