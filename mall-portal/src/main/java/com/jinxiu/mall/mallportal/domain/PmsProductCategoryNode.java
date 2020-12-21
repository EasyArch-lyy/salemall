package com.jinxiu.mall.mallportal.domain;

import com.jinxiu.mall.mallmbg.model.PmsProductCategory;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * 商品分类，包含子分类
 */
@Getter
@Setter
public class PmsProductCategoryNode extends PmsProductCategory {
    private List<PmsProductCategoryNode> children;
}
