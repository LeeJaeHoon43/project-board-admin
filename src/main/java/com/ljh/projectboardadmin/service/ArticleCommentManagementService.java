package com.ljh.projectboardadmin.service;

import com.ljh.projectboardadmin.dto.ArticleCommentDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleCommentManagementService {

    public List<ArticleCommentDto> getArticleComments(){
        return List.of();
    }

    public ArticleCommentDto getArticleComment(Long articleCommentId){
        return null;
    }

    public void deleteArticleComment(Long articleCommentId){

    }
}
