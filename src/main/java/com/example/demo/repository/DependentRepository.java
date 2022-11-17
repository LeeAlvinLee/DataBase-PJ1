package com.example.demo.repository;

import com.example.demo.model.Dependent;
import com.example.demo.model.Password;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
@Repository
@Slf4j
public class DependentRepository {
    Password pw = new Password();

    public ArrayList<Dependent> showDependent(ArrayList<String> queries){

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Dependent> dependents_list = new ArrayList<Dependent>();
        // 연결
        try {

            // 접속 url과 사용자, 비밀번호
            String url = "jdbc:mysql://localhost:3306/여기에db이름을 입력해주세요?serverTimezone=UTC";
            String user = "여기에 user를 입력해주세요.";
            String pwd ="여기에 pwd를 입력해주세요.";

            con = DriverManager.getConnection(url, user, pwd);
            log.info("DB와 정상적으로 연결되었습니다.");

            for(String query : queries) {
                String sql = query;
                log.info("ShowCiled sql : " + sql);

                pstmt = con.prepareStatement(sql);

                rs = pstmt.executeQuery();

                while (rs.next()){
                    Dependent dependent = new Dependent();
                    dependent.setParent_name(rs.getString("Essn"));
                    dependent.setDependent_name(rs.getString("Dependent_name"));
                    dependent.setSex(rs.getString("Sex"));
                    dependent.setBdate(rs.getDate("Bdate").toString());
                    dependent.setRelationship(rs.getString("Relationship"));
                    dependents_list.add(dependent);
                }
            }

        } catch (
                SQLException e){
            System.err.println("연결할 수 없습니다.");
            e.printStackTrace();
        }

        // 해제
        try {
            log.info("DB 연결을 종료합니다.");
            if (con != null)
                con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return dependents_list;
    }
}
