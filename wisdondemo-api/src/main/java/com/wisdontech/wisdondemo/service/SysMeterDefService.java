package com.wisdontech.wisdondemo.service;

import com.github.pagehelper.PageInfo;
import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;

public interface SysMeterDefService {
    public SysMeterDef selectByPrimaryKey(SysMeterDefKey key);

    public PageInfo<SysMeterDef> selectByExample(SysMeterDefExample example, int currentPage, int pageSize);
}
