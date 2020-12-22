package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义优选和商品关系操作Dao
 */
public interface CmsPrefrenceAreaProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
