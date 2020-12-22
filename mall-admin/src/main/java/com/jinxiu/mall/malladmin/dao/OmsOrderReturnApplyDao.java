package com.jinxiu.mall.malladmin.dao;

import com.jinxiu.mall.malladmin.dto.OmsOrderReturnApplyResult;
import com.jinxiu.mall.malladmin.dto.OmsReturnApplyQueryParam;
import com.jinxiu.mall.mallmbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单退货申请自定义Dao
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id") Long id);
}
