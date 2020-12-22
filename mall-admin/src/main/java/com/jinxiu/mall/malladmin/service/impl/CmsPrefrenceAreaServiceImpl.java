package com.jinxiu.mall.malladmin.service.impl;

import com.jinxiu.mall.malladmin.service.CmsPrefrenceAreaService;
import com.jinxiu.mall.mallmbg.mapper.CmsPrefrenceAreaMapper;
import com.jinxiu.mall.mallmbg.model.CmsPrefrenceArea;
import com.jinxiu.mall.mallmbg.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 商品优选Service实现类
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
