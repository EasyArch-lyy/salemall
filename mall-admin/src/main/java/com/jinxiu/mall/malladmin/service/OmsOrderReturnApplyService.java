package com.jinxiu.mall.malladmin.service;

import com.jinxiu.mall.malladmin.dto.OmsOrderReturnApplyResult;
import com.jinxiu.mall.malladmin.dto.OmsReturnApplyQueryParam;
import com.jinxiu.mall.malladmin.dto.OmsUpdateStatusParam;
import com.jinxiu.mall.mallmbg.model.OmsOrderReturnApply;
import java.util.List;

/**
 * 退货申请管理Service
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
