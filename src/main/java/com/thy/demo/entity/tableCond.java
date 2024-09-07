package com.thy.demo.entity;

import lombok.Data;

import java.util.HashMap;

@Data
public class tableCond {
    private String personid;
    private String personname;
    private HashMap<String,String> nameMap;
}
