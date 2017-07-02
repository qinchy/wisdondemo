package com.wisdontech.wisdondemo.service.impl;

import com.wisdontech.wisdondemo.dao.SysMeterDefMapper;
import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import com.wisdontech.wisdondemo.service.SysMeterDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMeterDefServiceImpl implements SysMeterDefService {

    @Autowired
    private SysMeterDefMapper sysMeterDefMapper;

    @Override
    public SysMeterDef selectByPrimaryKey(SysMeterDefKey key) {
        return sysMeterDefMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<SysMeterDef> selectByExample(SysMeterDefExample example) {
        return sysMeterDefMapper.selectByExample(example);
    }
}
