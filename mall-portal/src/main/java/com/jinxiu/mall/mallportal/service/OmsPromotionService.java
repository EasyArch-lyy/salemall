package com.jinxiu.mall.mallportal.service;

import com.jinxiu.mall.mallmbg.model.OmsCartItem;
import com.jinxiu.mall.mallportal.domain.CartPromotionItem;
import java.util.List;

/**
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
