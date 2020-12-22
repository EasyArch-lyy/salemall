package com.jinxiu.mall.malladmin.service.impl;

import com.jinxiu.mall.malladmin.service.UmsMemberLevelService;
import com.jinxiu.mall.mallmbg.mapper.UmsMemberLevelMapper;
import com.jinxiu.mall.mallmbg.model.UmsMemberLevel;
import com.jinxiu.mall.mallmbg.model.UmsMemberLevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 会员等级管理Service实现类
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
