package com.jinxiu.mall.malladmin.service.impl;

import com.jinxiu.mall.malladmin.service.OmsCompanyAddressService;
import com.jinxiu.mall.mallmbg.mapper.OmsCompanyAddressMapper;
import com.jinxiu.mall.mallmbg.model.OmsCompanyAddress;
import com.jinxiu.mall.mallmbg.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 收货地址管理Service实现类
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
