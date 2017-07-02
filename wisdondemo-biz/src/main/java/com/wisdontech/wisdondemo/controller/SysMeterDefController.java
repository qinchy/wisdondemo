package com.wisdontech.wisdondemo.controller;

import com.github.pagehelper.PageHelper;
import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import com.wisdontech.wisdondemo.service.SysMeterDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysmeterdef")
public class SysMeterDefController {

    @Autowired
    private SysMeterDefService sysMeterDefService;

    @RequestMapping("/selectByPrimaryKey/{id}")
    public SysMeterDef selectByPrimaryKey(@PathVariable String id){
        SysMeterDefKey key = new SysMeterDefKey();
        key.setInnerId(Integer.parseInt(id));
        key.setTenantId(22L);

        return sysMeterDefService.selectByPrimaryKey(key);
    }

    @RequestMapping("/selectByExample")
    public List<SysMeterDef> selectByExample(){
        PageHelper.startPage(0, 1);
        SysMeterDefExample example = new SysMeterDefExample();
        return sysMeterDefService.selectByExample(example);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
