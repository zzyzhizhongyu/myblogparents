package com.zzy.service;

import com.zzy.vo.CategoryVo;
import com.zzy.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}
