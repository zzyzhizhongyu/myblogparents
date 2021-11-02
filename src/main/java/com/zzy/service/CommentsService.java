package com.zzy.service;

import com.zzy.vo.Result;
import com.zzy.vo.params.CommentParam;

public interface CommentsService {
    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}
