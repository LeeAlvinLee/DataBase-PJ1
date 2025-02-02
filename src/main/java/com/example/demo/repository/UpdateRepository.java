package com.example.demo.repository;

import com.example.demo.model.Password;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;

@Slf4j
public class UpdateRepository {

    Password pw = new Password();

    public boolean update(ArrayList<String> queries){
        boolean ret = true;
        Connection con = null;
        PreparedStatement pstmt = null;

        // 연결
        try {

            // 접속 url과 사용자, 비밀번호
            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pwd ="fuckthepolice";

            con = DriverManager.getConnection(url, user, pwd);
            log.info("DB와 정상적으로 연결되었습니다.");

            for(String query : queries) {
                String sql = query;
                log.info("update sql : " + sql);

                pstmt = con.prepareStatement(sql);

                pstmt.executeUpdate();
            }

        } catch (SQLException e){
            System.err.println("연결할 수 없습니다.");
            e.printStackTrace();
            ret = false;
        }

        // 해제
        try {
            log.info("DB 연결을 종료합니다.");
            if (con != null)
                con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ret;
    }
}
