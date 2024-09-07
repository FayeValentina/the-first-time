package com.thy.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TestTable {
    private String personid;
    private String personname;
    private Date birthday;
}