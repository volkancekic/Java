package com.v;

import com.v.dao.JdbcDaoImpl;
import com.v.model.Department;

public class jdbcApp {
    public static void main(String[] args) {

        JdbcDaoImpl jdbcDao=new JdbcDaoImpl();
        Department dept=jdbcDao.getDepartment(20);
        System.out.println(dept);
    }
}
