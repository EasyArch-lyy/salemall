package com.jinxiu.mall.mallportal.service;

import com.jinxiu.mall.mallmbg.model.PmsProduct;
import com.jinxiu.mall.mallportal.domain.PmsPortalProductDetail;
import com.jinxiu.mall.mallportal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * 前台商品管理Service
 */
public interface PmsPortalProductService {
    /**
     * 综合搜索商品
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    PmsPortalProductDetail detail(Long id);
}
