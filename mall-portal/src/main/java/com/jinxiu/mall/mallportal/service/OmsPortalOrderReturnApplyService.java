package com.jinxiu.mall.mallportal.service;

import com.jinxiu.mall.mallportal.domain.OmsOrderReturnApplyParam;

/**
 * 前台订单退货管理Service
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
