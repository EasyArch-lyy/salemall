package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品参数，商品自定义规格属性Dao
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
