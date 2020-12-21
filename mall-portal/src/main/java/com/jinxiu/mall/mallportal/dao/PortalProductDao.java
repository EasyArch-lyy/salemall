package com.jinxiu.mall.mallportal.dao;

import com.jinxiu.mall.mallmbg.model.SmsCoupon;
import com.jinxiu.mall.mallportal.domain.CartProduct;
import com.jinxiu.mall.mallportal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 前台系统自定义商品Dao
 */
public interface PortalProductDao {
    /**
     * 获取购物车商品信息
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 获取促销商品信息列表
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * 获取可用优惠券列表
     */
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);
}
