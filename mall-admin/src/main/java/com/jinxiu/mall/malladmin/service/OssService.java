package com.jinxiu.mall.malladmin.service;

import com.jinxiu.mall.malladmin.dto.OssCallbackResult;
import com.jinxiu.mall.malladmin.dto.OssPolicyResult;
import javax.servlet.http.HttpServletRequest;

/**
 * Oss对象存储管理Service
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
