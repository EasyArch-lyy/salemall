package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义商品分类和属性关系Dao
 */
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
