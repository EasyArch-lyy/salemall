package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义优惠券和商品分类关系管理Dao
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
