<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ include file = "home.jsp" %>
<%@ page import ="java.util.*" %>
<%@ page import ="java.lang.*" %>
<%@ page import ="com.example.demo.model.Search" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.example.demo.model.Search" %>
<%@ page import="com.example.demo.model.Dependent" %>
<%!
    ArrayList<Boolean> check;
    ArrayList<Search> searches;
    ArrayList<String> tableHeaders;
    ArrayList<Dependent> tableChild;
%>

<%
    check = (ArrayList<Boolean>) request.getAttribute("check");
    searches = (ArrayList<Search>) request.getAttribute("searches");
    tableHeaders = (ArrayList<String>) request.getAttribute("tableHeaders");
    tableChild = (ArrayList<Dependent>) request.getAttribute("tableChild");
%>
<h1>검색한 테이블 출력</h1>
<form method = "post" name ="form" >
    <table border = "1">
        <th>선택</th>
        <%
            for(int i = 0; i < tableHeaders.size(); i++){
        %>
        <th><%=tableHeaders.get(i)%></th>
        <%
            }
        %>
        <%
            for(int i = 0; i < searches.size(); i++){
        %>
        <tr>
            <td><label><input type="checkbox" name = "ssn" value="<%=searches.get(i).getSsn()%>"></label></td>
            <%
                if(check.get(0)) {
            %>
            <td><%=searches.get(i).getName()%></td>
            <%
                }
                if(check.get(1)) {
            %>
            <td><%=searches.get(i).getSsn()%></td>
            <%
                }
                if(check.get(2)) {
            %>
            <td><%=searches.get(i).getBDate()%></td>
            <%
                }
                if(check.get(3)) {
            %>
            <td><%=searches.get(i).getAddress()%></td>
            <%
                }
                if(check.get(4)) {
            %>
            <td><%=searches.get(i).getSex()%></td>
            <%
                }
                if(check.get(5)) {
            %>
            <td><%=searches.get(i).getSalary()%></td>
            <%
                }
                if(check.get(6)) {
            %>
            <td><%=searches.get(i).getSupervisor()%></td>
            <%
                }
                if(check.get(7)) {
            %>
            <td><%=searches.get(i).getDepartment()%></td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
    </table>
    <p>
    <span><input type = "submit" name = "update" value = "DELETE" onclick="javascript: form.action='/updates';"></span>
        <span><input type = "submit" name = "update" value = "CHILD" onclick="javascript: form.action='/search/dependent';"></span>
    <span>수정 :
        <select name = "updateCategory">
            <option value="address">Address</option>
            <option value="sex">Sex</option>
            <option value="salary">Salary</option>
        </select>
        <input type = "text" name = "updateText">
        <input type = "submit" name = "update" value = "UPDATE">
    </span>

    </p>
    <table border = "1">
        <th> Employee_name </th>
        <th> Dependent_name </th>
        <th> Sex </th>
        <th> Bdate </th>
        <th> Relationship </th>
        <%
            for(int i = 0; i < tableChild.size(); i++){
        %>
        <tr>
            <td><%=tableChild.get(i).getParent_name()%></td>
            <td><%=tableChild.get(i).getDependent_name()%></td>
            <td><%=tableChild.get(i).getSex()%></td>
            <td><%=tableChild.get(i).getBdate()%></td>
            <td><%=tableChild.get(i).getRelationship()%></td>

        </tr>
        <%
            }
        %>
    </table>
</form>
