package com.wisdontech.wisdondemo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wisdontech.wisdondemo.dao.SysMeterDefMapper;
import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import com.wisdontech.wisdondemo.service.SysMeterDefService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysMeterDefServiceImpl implements SysMeterDefService {

    private Logger logger = LoggerFactory.getLogger(SysMeterDefServiceImpl.class);

    @Autowired
    private SysMeterDefMapper sysMeterDefMapper;

    @Override
    public SysMeterDef selectByPrimaryKey(SysMeterDefKey key) {
        return sysMeterDefMapper.selectByPrimaryKey(key);
    }

    @Override
    public PageInfo<SysMeterDef> selectByExample(SysMeterDefExample example, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<SysMeterDef> sysMeterDefs = sysMeterDefMapper.selectByExample(example);
        PageInfo<SysMeterDef> pageInfo = new PageInfo<SysMeterDef>(sysMeterDefs);
        logger.info("总页数"+pageInfo.getPageNum());
        logger.info("每页记录数"+pageInfo.getPageSize());

        return pageInfo;
    }
}
