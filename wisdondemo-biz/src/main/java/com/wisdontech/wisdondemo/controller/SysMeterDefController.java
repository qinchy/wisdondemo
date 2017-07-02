package com.wisdontech.wisdondemo.controller;

import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import com.wisdontech.wisdondemo.service.SysMeterDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
