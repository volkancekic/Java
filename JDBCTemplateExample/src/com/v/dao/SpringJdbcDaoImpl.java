package com.v.dao;

import com.v.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

@Component
public class SpringJdbcDaoImpl {
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;



    public DataSource getDataSource() {
        return dataSource;
    }
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
    public int getDeptCount(){
            String sql="select count(*) from departments";
            return jdbcTemplate.queryForObject(sql,Integer.class);
    }
    public String getDeptName(int departmentId){
        String sql="select department_name from departments where department_id=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{departmentId},String.class);
    }
    public Department getDepartment(int departmentId){
        Department d=null;
        String sql="select * from departments where department_id=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{departmentId},new DepartmentMapper());

    }
    private class DepartmentMapper implements RowMapper<Department>{

        @Override
        public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
            Department d=new Department();
            d.setDepartmentId(rs.getInt("department_id"));
            d.setDepartmentName(rs.getString("department_name"));

            return d;
        }
    }
    public List<Department> listOfDepartments(){
        String sql="select * from departments";
        return  jdbcTemplate.query(sql,new DepartmentMapper());
    }

    public void InsertDepartment(Department dept){
        String sql="insert into departments(department_id,department_name) values (?,?)";
        jdbcTemplate.update(sql,new Object[]{dept.getDepartmentId(),dept.getDepartmentName()});//parametre olarak geciliyor object dizisine

    }
}
