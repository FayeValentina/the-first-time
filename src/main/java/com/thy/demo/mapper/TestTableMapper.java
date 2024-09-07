package com.thy.demo.mapper;

import com.thy.demo.entity.TestTable;
import com.thy.demo.entity.tableCond;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTableMapper {
    List<TestTable> select(tableCond cond);
}