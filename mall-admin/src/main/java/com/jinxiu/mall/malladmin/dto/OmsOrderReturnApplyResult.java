package com.jinxiu.mall.malladmin.dto;

import com.jinxiu.mall.mallmbg.model.OmsCompanyAddress;
import com.jinxiu.mall.mallmbg.model.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
