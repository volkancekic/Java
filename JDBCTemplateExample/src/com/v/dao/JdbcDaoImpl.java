package com.v.dao;

import com.v.model.Department;

import java.sql.*;

public class JdbcDaoImpl {
    public Department getDepartment(int departmentId){
        Department d=null;
        Connection con=null;
        String sql="select Department_name from departments where department_id=:1";

        try {
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,departmentId);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                d=new Department(departmentId,rs.getString("department_name"));
            }
            rs.close();
            ps.close();


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return d;
    }
}
