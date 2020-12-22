package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.malladmin.dto.OmsOrderDeliveryParam;
import com.jinxiu.mall.malladmin.dto.OmsOrderDetail;
import com.jinxiu.mall.malladmin.dto.OmsOrderQueryParam;
import com.jinxiu.mall.mallmbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单自定义查询Dao
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
