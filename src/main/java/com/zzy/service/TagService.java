package com.zzy.service;

import com.zzy.vo.Result;
import com.zzy.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsArticleId(Long articleId);

    Result hots(int limit);

    //查询所有文章标签
    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
