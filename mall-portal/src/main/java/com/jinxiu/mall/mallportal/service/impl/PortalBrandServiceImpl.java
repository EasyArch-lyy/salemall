package com.jinxiu.mall.mallportal.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinxiu.mall.mallcommon.api.CommonPage;
import com.jinxiu.mall.mallmbg.mapper.PmsBrandMapper;
import com.jinxiu.mall.mallmbg.mapper.PmsProductMapper;
import com.jinxiu.mall.mallmbg.model.PmsBrand;
import com.jinxiu.mall.mallmbg.model.PmsProduct;
import com.jinxiu.mall.mallmbg.model.PmsProductExample;
import com.jinxiu.mall.mallportal.dao.HomeDao;
import com.jinxiu.mall.mallportal.service.PortalBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 前台品牌管理Service实现类
 */
@Service
public class PortalBrandServiceImpl implements PortalBrandService {
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return homeDao.getRecommendBrandList(offset, pageSize);
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andDeleteStatusEqualTo(0)
                .andBrandIdEqualTo(brandId);
        List<PmsProduct> productList = productMapper.selectByExample(example);
        return CommonPage.restPage(productList);
    }
}
