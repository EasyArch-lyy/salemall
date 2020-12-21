package com.jinxiu.mall.mallportal.dao;

import com.jinxiu.mall.mallmbg.model.SmsCoupon;
import com.jinxiu.mall.mallportal.domain.SmsCouponHistoryDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员优惠券领取历史自定义Dao
 */
public interface SmsCouponHistoryDao {
    /**
     * 获取优惠券历史详情
     */
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);

    /**
     * 获取指定会员优惠券列表
     */
    List<SmsCoupon> getCouponList(@Param("memberId") Long memberId, @Param("useStatus") Integer useStatus);
}
