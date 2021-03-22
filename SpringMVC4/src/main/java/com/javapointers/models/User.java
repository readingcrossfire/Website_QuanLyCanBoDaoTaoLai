/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javapointers.models;


import VSC.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

/**
 * @author Tuan
 */

@Component
public class User implements IUser {

    @Autowired
    @Resource(name = "dataSource")
    DataSource dataSource;

    //DataSource dataSourceFW_config=ConfigDataSource.setDataSourceFW();
    @Override
    public List dangNhap(Account account) {
        String sql = "call DANGNHAP_F(?,?)#c,s,s";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForList(sql, new Object[]{account.layTenDangNhap(), account.layMatKhau()});
    }

    @Override
    public List dsnguoidung() {
        String sql="call DS_NGUOIDUNG(?)#c,";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForList(sql,new Object());
    }

}
