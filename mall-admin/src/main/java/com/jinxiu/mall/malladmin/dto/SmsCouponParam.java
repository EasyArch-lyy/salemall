package com.jinxiu.mall.malladmin.dto;

import com.jinxiu.mall.mallmbg.model.SmsCoupon;
import com.jinxiu.mall.mallmbg.model.SmsCouponProductCategoryRelation;
import com.jinxiu.mall.mallmbg.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和绑定分类
 */
public class SmsCouponParam extends SmsCoupon {
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品")
    private List<SmsCouponProductRelation> productRelationList;
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品分类")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
