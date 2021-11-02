package com.zzy.controller;

import com.zzy.common.aop.LogAnnotation;
import com.zzy.common.cache.Cache;
import com.zzy.service.ArticleService;
import com.zzy.vo.Result;
import com.zzy.vo.params.ArticleParam;
import com.zzy.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    /**
     * 首页 文章列表
     */
    @Autowired
    private ArticleService articleService;


    @PostMapping
    //对该接口日记
    @Cache(expire = 5 * 60 * 1000,name = "listArticle")
    @LogAnnotation(module = "文章",operation = "获取文章列表")
    public Result listArticle(@RequestBody PageParams pageParams) {

        return  articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     */
    @PostMapping("hot")
    @Cache(expire = 5 * 60 * 1000,name = "hot_article")
    public Result hotArticle() {
        int limit = 5;
        return  articleService.hotArticle(limit);
    }

    /**
     * 首页 最新文章
     */
    @PostMapping("new")
    @Cache(expire = 5 * 60 * 1000,name = "new_article")
    public Result newArticles() {
        int limit = 5;
        return  articleService.newArticles(limit);
    }

    /**
     * 首页 最新文章
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return  articleService.listArchives();
    }


    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }
}
