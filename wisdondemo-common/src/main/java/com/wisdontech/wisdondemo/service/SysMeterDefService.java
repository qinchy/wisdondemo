package com.wisdontech.wisdondemo.service;

import com.wisdontech.wisdondemo.model.SysMeterDef;
import com.wisdontech.wisdondemo.model.SysMeterDefKey;

public interface SysMeterDefService {
    public SysMeterDef selectByPrimaryKey(SysMeterDefKey key);
}
