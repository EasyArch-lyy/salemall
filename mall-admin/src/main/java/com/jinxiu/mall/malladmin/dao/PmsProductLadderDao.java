package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.mallmbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义会员阶梯价格Dao
 */
public interface PmsProductLadderDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
