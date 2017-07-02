package com.wisdontech.wisdondemo.service;

import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;

import java.util.List;

public interface SysMeterDefService {
    public SysMeterDef selectByPrimaryKey(SysMeterDefKey key);
    public List<SysMeterDef> selectByExample(SysMeterDefExample example);
}
