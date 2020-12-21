package com.jinxiu.mall.mallportal.dao;

import com.jinxiu.mall.mallmbg.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单商品信息自定义Dao
 */
public interface PortalOrderItemDao {
    /**
     * 批量插入
     */
    int insertList(@Param("list") List<OmsOrderItem> list);
}
