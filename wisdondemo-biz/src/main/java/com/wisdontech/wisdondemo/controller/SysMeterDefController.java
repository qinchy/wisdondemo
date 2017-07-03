package com.wisdontech.wisdondemo.controller;

import com.github.pagehelper.PageInfo;
import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import com.wisdontech.wisdondemo.service.SysMeterDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
    public PageInfo<SysMeterDef> selectByExample(@RequestParam(defaultValue = "1", value = "currentPage") int currentPage,
                                                 @RequestParam(defaultValue = "1", value = "pageSize") int pageSize) {
        SysMeterDefExample example = new SysMeterDefExample();
        return sysMeterDefService.selectByExample(example, currentPage, pageSize);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
