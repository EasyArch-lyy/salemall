package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义会员价格Dao
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
