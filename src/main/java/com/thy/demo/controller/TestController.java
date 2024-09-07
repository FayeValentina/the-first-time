package com.thy.demo.controller;

import com.thy.demo.entity.ResultTable;
import com.thy.demo.entity.TestTable;
import com.thy.demo.entity.tableCond;
import com.thy.demo.mapper.TestTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestTableMapper testTableMapper;
    @GetMapping("/test")
    @ResponseBody
    public ResultTable getTestData(Model model) {
        tableCond cond = new tableCond();
        cond.setPersonid((String) model.getAttribute("id"));
        List<TestTable> resultList = testTableMapper.select(cond);

        ResultTable resultTable = new ResultTable();
        resultTable.setResultList(resultList);

        return resultTable;
    }
}
