/*
package com.example.alishev1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        createTable1();
        createTable2();
    }

    private void createTable1() {
        String sql = "CREATE TABLE person (id SERIAL PRIMARY KEY, firstname VARCHAR(255) UNIQUE, middlename VARCHAR(255) UNIQUE, lastname VARCHAR(255) UNIQUE, dateofbirth DATE)";
        jdbcTemplate.execute(sql);
    }

    private void createTable2() {
        String sql = "CREATE TABLE book (id SERIAL PRIMARY KEY, title VARCHAR(255), author VARCHAR(255), year INT, person_id INT, CONSTRAINT fk_person FOREIGN KEY (person_id) REFERENCES person (id))";
        jdbcTemplate.execute(sql);
    }
}

 */