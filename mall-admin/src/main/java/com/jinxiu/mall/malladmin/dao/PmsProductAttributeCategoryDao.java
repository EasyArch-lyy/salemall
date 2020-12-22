package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.malladmin.dto.PmsProductAttributeCategoryItem;
import java.util.List;

/**
 * 自定义商品属性分类Dao
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
