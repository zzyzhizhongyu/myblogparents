package com.zzy.service;


import com.zzy.vo.Result;
import com.zzy.vo.params.ArticleParam;
import com.zzy.vo.params.PageParams;


public interface ArticleService {

    /**
     * 分页查询 文章列表
     */
    Result listArticle(PageParams pageParams);


    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();

    Result findArticleById(Long articleId);

    Result publish(ArticleParam articleParam);
}
