package com.qxt.dao;

import java.util.List;

import com.qxt.domain.Article;
import com.qxt.domain.ArticleWithBLOBs;
import com.qxt.domain.Vo;

public interface ArticleMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询文章
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article article);
	
	List<Article> all();

    ArticleWithBLOBs selectByPrimaryKey(Integer id);


	List<Article> list(Vo vo);
}