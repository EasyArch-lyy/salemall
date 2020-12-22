package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.malladmin.dto.PmsProductCategoryWithChildrenItem;
import java.util.List;

/**
 * 商品分类自定义Dao
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
