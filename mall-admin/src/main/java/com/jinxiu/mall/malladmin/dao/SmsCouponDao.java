package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.malladmin.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 自定义优惠券管理Dao
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
