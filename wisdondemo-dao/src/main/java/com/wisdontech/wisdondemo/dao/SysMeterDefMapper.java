package com.wisdontech.wisdondemo.dao;

import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefExample;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMeterDefMapper {
    int countByExample(SysMeterDefExample example);

    int deleteByExample(SysMeterDefExample example);

    int deleteByPrimaryKey(SysMeterDefKey key);

    int insert(SysMeterDef record);

    int insertSelective(SysMeterDef record);

    List<SysMeterDef> selectByExample(SysMeterDefExample example);

    SysMeterDef selectByPrimaryKey(SysMeterDefKey key);

    int updateByExampleSelective(@Param("record") SysMeterDef record, @Param("example") SysMeterDefExample example);

    int updateByExample(@Param("record") SysMeterDef record, @Param("example") SysMeterDefExample example);

    int updateByPrimaryKeySelective(SysMeterDef record);

    int updateByPrimaryKey(SysMeterDef record);
}